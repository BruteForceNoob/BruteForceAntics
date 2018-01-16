include pcmac.inc
        .model  small
        .stack  100h
        
        .data
        Sign    DB  ?        ; GETDEC data
        M32768  db  '-32768$'; PUTDEC data
        Prompta  DB      'Enter M:$'
        PROMPTb  DB      'Enter N:$'
        PROMPTc  DB      'Do another? (Y/N)$'
        Promptd  DB      'Division by zero attempted $'
        Prompte  DB      'Greatest common denominator = $'
        
        
        .code
         PUBLIC  PutDec
        PutDec  PROC
            push    ax
            push    bx
            push    cx
            push    dx
            cmp ax, -32768 ;    -32768 is a special case as there
            jne TryNeg ;      is no representation of +32768
            _PutStr M32768
            jmp DonePut
            TryNeg:
                 cmp ax, 0 ;     If number is negative ...
                 jge NotNeg
                 mov bx, ax ;      save from it from _PutCh
                 neg bx ;          make it positive and...
                 _PutCh  '-' ;         display a '-' character
                 mov ax, bx ;    To prepare for PushDigs
            NotNeg:
                 mov cx, 0 ;     Initialize digit count
                 mov bx, 10 ;    Base of displayed number
            PushDigs:
                 sub dx, dx ;    Convert ax to unsigned double-word
                 div bx
                 add dl, '0' ;   Compute the Ascii digit...
                 push    dx ;        ...push it (can push words only)...
                 inc cx ;        ...and count it
                 cmp ax, 0   ;   Don't display leading zeroes
                 jne PushDigs
                    ;
            PopDigs:    ;       Loop to display the digits
                 pop dx ;          (in reverse of the order computed)
             _PutCh  dl
                loop    PopDigs
            DonePut:
                pop dx ;    Restore registers
                pop cx
                pop bx
                pop ax
                ret
            PutDec  ENDP
        PUBLIC  GetDec
            GetDec  PROC
            push    bx ;        Don't need to save ax, but bx, cx, ...
            push    cx ;        ...dx must be saved and restored
            push    dx
            mov bx, 0 ;     accumulated NumberValue in bx := 0
            mov cx, 10
            mov Sign, '+' ; Guess that sign will be '+'
            _GetCh  ;       Read character ==> al
            cmp al, '-' ;   Is first character a minus sign?
            jne AfterRead
            mov Sign, '-' ;   yes
            ReadLoop:
            _GetCh
            AfterRead:
            cmp al, '0' ;   Is character a digit?
            jl  Done ;        No
            cmp al, '9'
            jg  Done ;        No
            sub al, '0' ;     Yes, cvt to DigitValue and extend to a
            mov ah, 0 ;        word (so we can add it to NumberValue)
            xchg    ax, bx ;    Save DigitValue
            ;          and set up NumberValue for mul
            mul cx ;        NumberValue * 10 ...
            add ax, bx ;      + DigitValue ...
            mov bx, ax ;      ==> NumberValue
            jmp ReadLoop
            Done:
                cmp al, 13 ;    If last character read was a RETURN...
                jne NoLF
                _PutCh 10 ;     ...echo a matching line feed
            NoLF:
                cmp Sign, '-'
                jne Positive
                neg bx ;        Final result is in bx
            Positive:
                mov ax, bx ;    Returned value --> ax
                pop dx ;        restore registers
                pop cx
                pop bx
                ret
            GetDec  ENDP
            
            
 ;=================================================================================================================
            
            ; Author: Sujeeth Panicker campus Id: 014828682
            error proc  
                sPutstr Promptd
                ret
            error endp
            
            print proc
            
               push bp
               mov bp,sp
               sPutstr Prompte
               mov ax, [bp+4]
               call PutDec
               _Putch 13,10 
              
               pop bp
               ret 2
              
            print endp
        
            upcase proc
                push bp
                mov bp,sp
                
               
               
               mov ax,[bp+4]
               cmp ax,97
               jl returnstep
               
              
               cmp ax,122
               jg returnstep
               
                mov ax,[bp+4]
                Sub ax,32
               pop bp 
               ret 2
         returnstep:
         pop bp 
         ret 2
        
            upcase endp
            
            
                
             GCD proc
                push bp
                mov bp,sp
                
                
                cmp word ptr[bp+4],0
                je ERRORMSG
                
                mov ax, [bp+6]
                cwd
                idiv [bp+4]
                cmp dx,0
                JNE RECURSION
                MOV ax,[bp+4]
                pop bp
                RET 4
                
            
            
            RECURSION:
            push [bp+4]
            push dx
            call GCD    ; recursive call
            pop bp
            RET 4   
                
            ERRORMSG:
            call error
            pop bp
            ret 4
                
            GCD ENDP
            
              GetData proc
            
                
                
                LOOPBODY:
                
                _Putch 13,10
                sPutstr Prompta
                call    GetDec          
                push ax
                sPutStr Promptb
                call    Getdec          
                push ax
                call GCD
                cmp ax,0
                jne printGCDcall
                
                

                
                Redo:                               
                 _Putch 13,10 
                 sPutstr Promptc
                 _GetCh
                      
                 cbw
                 push ax  
                 call upcase
                 cmp ax,89
                 je LOOPBODY   ; jump to Loop body
                 
                 ret
                 
                printGCDcall: 
                push ax
                call print
                jmp Redo
                
                
          GetData ENDP
            
          main    proc
          
                 mov     ax, @data
                 mov     ds, ax
                 call GetData
                 _exit   0  
                 
          main    endp
          end     main
          
        
          
          
            
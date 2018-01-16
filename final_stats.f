       real function variance(arr,count,mean)
       real arr(100)
       integer count
       real mean
       real temp
       real dummyValue
       integer i
       temp=0.0
       i=1
       do 120 i=1,count
       dummyValue=(arr(i)-mean)*(arr(i)-mean)
       temp=(temp+dummyValue)
120    continue
       variance=(temp/(count-1))

       return
       end




       real function sum(arr,count)
       real arr(100)



       integer count,i
       i=1
       sum=0
       do 40  i=1,count
        sum=sum+arr(i)
40     continue

       return
       end

       real function getMedian(arr,count)
       real arr(100)
       integer count

       integer check
       check=count/2

       if(check*2 .ne. count) then
       getMedian=arr(check+1)

       else
       getMedian=(arr(check+1) +  arr(check))/2
       endif

       return
       end


       subroutine WRITEAR(ARR,LENGTH)
       real arr(100)
       integer length
       integer i,j ,c
       i=1

       c=1



       do 100 i = 1,length
         if(c .eq. 6) then

          write(*,150) arr(i)
          write(*,*)
          c=1
          else
          c=c+1
           write(*,150) arr(i)
          endif
 150     format($,F10.3)
100     continue



       RETURN
       END

       subroutine SHELL(ARR,length)
       real arr(100)
       integer length
       integer i,j,SUM
       real temp
       temp=0.0
       i=1
       j=1
       temp=0
       sum=0
       do 50  i=1,length
        do 60 j=(i+1),length
          if(arr(i)>arr(j)) then
           temp=arr(i)
           arr(i)=arr(j)
           arr(j)=temp
           endif
60     continue
50     continue

      return
      end

       subroutine READAR(ARR,count,filename)
       REAL ARR(100)
       integer count
       character filename*40

       parameter (unit=10)
       integer CHECKEOF


       count=1

       open (unit, FILE=filename, STATUS='OLD')
       do

          read(unit,*,IOSTAT=checkeof) arr(count)
          if (checkeof .GT. 0) then
           WRITE(*,*) 'INVALID INPUT DATA'
           EXIT

           ELSEIF (checkeof .lt. 0)  THEN
           EXIT
           ELSE

             count=count+1
           endif
          enddo


        close(unit)


        return
        END

       PROGRAM STATS
       real ARR(100)
       REAL RANGE,median

       integer count
       real total
       real mean
       real varianceValue, sdeviation
       character filename*40
       write(*,*) 'Enter name of the file: '
       read(*,*)     filename
       call READAR(ARR,count,fileName)
       count=count-1

       write(*,*) 'Total number of elements: ', count
       write(*,*)
       call WRITEAR(ARR,COUNT)
       write(*,*)
       write(*,*)
       call SHELL(ARR,COUNT)
       call WRITEAR(ARR,COUNT)
       RANGE= ARR(COUNT)-ARR(1)
       total= sum(arr,count)
       mean=total/count
       median = getMedian(arr,count)
       varianceValue= variance(arr,count,mean)
       sdeviation=sqrt(varianceValue)


       write(*,*)
        write(*,*)

        write(*,*)
       write(*,*) 'Minimum value: ', arr(1)
        write(*,*)
       write (*,*)   'Maximum value: ' , arr(count)
        write(*,*)
       WRITE (*,*) 'The range of given values is ' , RANGE
        write(*,*)
       write(*,*) 'Mean of given values is ', mean
        write(*,*)
       write(*,*) 'Median of given values is ', median
        write(*,*)
       write(*,*) 'Standard Deviation of given values is ', sdeviation
        write(*,*)
       write(*,*) 'variance of given values is ', varianceValue
        write(*,*)

        read(*,*)


       STOP
       END






import java.io.IOException;


import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class TestRun {
	
	public static void main(String[] args) throws RecognitionException, IOException {
		ExprLexer lexer = new ExprLexer(new ANTLRFileStream("C:\\Users\\sujeeth\\workspace\\BNFAssignment\\src\\Untitled 1"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprParser parser = new ExprParser(tokens);
		parser.prog();
		/*List<String> idList=new ArrayList<>();
		idList.g
		String str="10";
		String[] inputArray=str.split(" ");
		inputArray.length;
		System.out.println(inputArray[0]);*/

		
		
	}

}

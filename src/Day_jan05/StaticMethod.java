package Day_jan05;

import java.io.PrintStream;

public class StaticMethod {

	 static PrintStream out;

	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		Demo.show.screen("static method in demo");
		
		String str="println method";
		Demo.show.screen(str);
		
	//	out.println("Hello");
		
	}

}

/*

Java System.out.println() is used to print an argument that is passed to it. 
The statement can be broken into 3 parts which can be understood separately as:

System: It is a final class defined in the java.lang package.

out: This is an instance of PrintStream type, which is a public and static member field of the System class.

println(): As all instances of PrintStream class have a public method println(), hence we can invoke the same on out as well.
           This is an upgraded version of print(). It prints any argument passed to it and adds a new line to the output. 
           We can assume that System.out represents the Standard Output Stream.

*/

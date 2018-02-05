package Test;



class Addition

//Student Name : 		Enda Dunican
//Student Id Number : 	COM1234
//Date :				1/9/2005
//Purpose : 			A Sample skeleton program


//Error : "Invalid path, \bin\javac.exe -classpath"
//	Solution
//		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
 public static void main(String[] args)
 {

    Double number1;
	Double number2;
	Double number3;
	Double answer;
	

			System.out.print("Enter the first number ->  ");
     	number1 = EasyIn.getDouble();
     	System.out.print("Enter the second number ->  ");
     	number2 = EasyIn.getDouble() ;
     	answer = number1 + number2 ;
     	System.out.println("The sum of the two numbers is " + answer) ;
     	answer = number1 * number2;
     	System.out.println("The product of the two numbers is " + answer);
     	answer = (number1 + number2) / 2;
     	System.out.println("The average of ther two numbers is" + answer);
     	System.out.print("Enter the third number ->   ");
     	number3 = EasyIn.getDouble();
     	answer = number1 + number2 + number3;
     	System.out.println("The sum of the three numbers is" +  answer);
     	answer = number1 * number2 * number3;
     	System.out.println("The product of the three numbers is" + answer );
     	answer = (number1 + number2 + number3) / 3;
     	System.out.println("The average of the three numbers is" + answer);
	

 }
}



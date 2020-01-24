Brynn Stafford
using google java style guide for standard formatting


1st Assignment - Say No to Hello World
This isn't our first rodeo, so I'm not going to insult anyone with hello world:

Instead print out the following pattern:

*
**
***
##
#


class Main {
  public static void main(String[] args) {
    //Printing out a pattern
    System.out.print("*\n**\n***\n");
    System.out.println("##\n#");
    
    
  }
}


Variable Assignment:
When we create a variable we also assign it (no matter what)
The above (or something near it) was stated in class, consider what happens when we just "create" a variable without assigning it? (hint: print it). Then complete the following assignment:

For you to do:
Create an integer variable on line 4 but do not assign it (what is its value?)
Now assign the integer the value 21 on line 5.
Finally, change the initial creation of the variable (line 4) to assign the value 21 and remove line 5.
  

class Main {
  public static void main(String[] args) {
    // Assigning variables
    int num1 = 21;
    
    System.out.print(num1);
  }
}


Assign and Create 2

For you to do:
Create a String variable called "name" and set it to "Chen"
Create an integer variable called "age" and set it to 50
Create an integer variable called "iq" and set it to the value of age (do NOT use ' = 50')
Print the value of name
Print the value of age without skipping a new line
Print the value of iq

class Main {
  public static void main(String[] args) {
    // Assigning strings, and integer variables. Printing with \n
    String name = "Chen";
    int age = 50;
    int iq = age;
    
    System.out.println(name + "\n" + age + iq);
  }
}


 The variable "num" holds an integer user input
Write a conditional statement starting on line 9 that does the following:
If num is positive, print "__ is positive"
If num is negative, print "__ is negative"
Examples:
In: 5
5 is positive
In: -2
-2 is negative
In: 0
(no output for zero) 

  
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	int num = inp.nextInt();
  	//DO NOT CHANGE ABOVE CODE!  Write your code below
  	// If/else statements for positive and negative integers
  	if (num > 0){
  	  System.out.println(num + " is positive");
  	}
  	else if (num < 0){
  	  System.out.println(num + " is negative");
  	}
  }
}


MUST USE SWITCH STATEMENT
  The variable "name" holds a String user input 

Write a conditional statement starting on line 9 that does the following:
(Case counts for this one - so "Chen" is different than "chen")
If name is equal to "Chen", "Greenwell", or "Bob", print "teacher"
If name equals "Smith", print "TA"
For any other input, print "student"

Examples:
In: Chen
teacher
In: Greenwell 
teacher
In: Smith 
TA  
In: chen
student


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner scan = new Scanner(System.in);
  	System.out.print("In:");
  	String name = scan.nextLine();
  	
  	/*Using switches with strings.
  	* Printing specific output based on string input
  	*/
  	
  	String x = name;
  	switch (x) {
  	  case "Chen": case "Greenwell": case "Bob":
  	    System.out.println("teacher");
  	    break;
  	  case "Smith":
  	    System.out.println("TA");
  	    break;
  	  default:
  	   System.out.println("student");
  	}
  	
  }
}


Given a String (already declared for you as str), do the following:
Print out the following: "The first 3 letters of ___ is ___"

For example, if the input is "banana", your output should be "The first 3 letters of banana is ban"
verify = type is correct & exists
validate = data is what I expect


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String str = inp.nextLine();
  	
  	// Checks input and gives first 3 letters (or >= 3)
  	if(str.length() > 2) {
  	  System.out.println("The first 3 letters of " + str + " is " + str.substring(0,3));
  	}

  }
}










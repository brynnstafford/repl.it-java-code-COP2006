Brynn Stafford
using google java style guide for standard formatting


(1)1st Assignment - Say No to Hello World
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


(2)Variable Assignment:
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


(3)Assign and Create 2

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


(4)The variable "num" holds an integer user input
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


(5)MUST USE SWITCH STATEMENT
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


(6)Given a String (already declared for you as str), do the following:
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


(7)Given three variables:
String str
int start
int end

Print out the following string:

The substring of (str) from (start) to (end) is (substring from start to end, inclusive)

Sample output:
In: lolwut
Start: 2
End: 4 
The substring of lolwut from 2 to 4 inclusive is lwu
 
PLEASE NOTE that we are counting the end index in our output!

lolwut
012345

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String str = inp.nextLine();
  	System.out.print("\nStart:");
  	int start = inp.nextInt();
  	System.out.print("\nEnd:");
  	int end = inp.nextInt();
    // Printing range of characters from input
  	System.out.println("\nThe substring of " + str + 
  	" from " + start + " to " + end + " inclusive is " + str.substring(start,end + 1));
  }
}


(8)On line 5, declare an integer array of size 5 and assign the values 10, 20, 30, 40, and 50 to it.

Then use a for loop to print out all the elements of the array, one per line.
  
class Main
{
	public static void main(String[] args)
	{
	  //declaring int arrays and assigning values to array
	  int [] array;
	  array = new int [5];
	  array[0] = 10;
	  array[1] = 20;
	  array[2] = 30;
	  array[3] = 40;
	  array[4] = 50;
	  for (int i = 0; i < array.length; i++)
	  {
	    System.out.println(array[i]);
	  }
	}
}

(9)Inputs:
int end;

Write a for loop that will print out the numbers starting at 1 and ending at the input inclusive.  The numbers printed should all be on the same line separated by a space.

Sample inputs/outputs:
In: 5
1 2 3 4 5

In: 10
1 2 3 4 5 6 7 8 9 10

In: -5

(no output)
  
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int end = inp.nextInt();
    //Printing 1 through input number on separate line
    for (int i = 1; i < end + 1; i += 1) {
      System.out.println(i);
    }
  }
}

##### Assignment 10: Fibonacci Loop

The fibonacci sequence is a sequence of numbers in which the next number is the sum of the previous two numbers.

The first two numbers of the fibonacci sequence are 0, 1.

The first 8 numbers of the fibonacci sequence are 0, 1, 1, 2, 3, 5, 8, 13

Write some code to print out the first X numbers of the fibonacci sequence.

Your output should be on one line, with each number separated by a space.  You may assume that x is at least 2.


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int x = inp.nextInt();
   	// Assigning first two fibonacci int values (f1 & f2)
   	int f1 = 0, f2 = 1;
   	
   	// While loop condition states loop must start at f1 
   	// & input must be greater than f1
   	int i = 1;
   	while(i <= x){
   	  // Looping f1 until inp-x while satisfying conditions
   	  System.out.print(f1 + " ");
   	  int fibonacciSum = f1 + f2;
   	  f1 = f2;
   	  f2 = fibonacciSum;
   	  i++;
   	}
  }
}





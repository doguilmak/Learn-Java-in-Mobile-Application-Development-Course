
# Java and Mobile Application Development - Course 4

This week, we created the algorithm that the professor asked us for as homework. In the algorithm, we were tried to build functions for several purposes.

The basic inputs made in this course and shown by the professor are explained. You can review what was done below in order. If there are points you want to add, please correct us.

### Importing utilities

Java's scanner utilities have been added to receive input from the keyboard.

    import java.util.Scanner;

---

### Building variable for keyboard input

A variable has been created for the keyboard input. Thanks to this variable, the values ​​we enter will be stored in memory and can be assigned to another variable. The  `Scanner`  class is used to get user input, and it is found in the  `java.util`  package.

To use the  `Scanner`  class, create an object of the class and use any of the available methods found in the  `Scanner`  class documentation.

    
	Scanner keyboardInput = new Scanner(System.in);

	public static int okuint()	{
		@SuppressWarnings("resource")
		Scanner okuyucu=new Scanner(System.in);
		return okuyucu.nextInt();
	}

The `next()` is a method of the Java Scanner class that finds and returns the next complete token from the scanner which is in use. Adding the `@SuppressWarnings( "resource" )` should remove the warning for a potential resource leak.
	
	public static String oku()	{
		@SuppressWarnings("resource")
		Scanner okuyucu=new Scanner(System.in);
		return okuyucu.next(); 
	}
---

### Building function to print string variable parameter

The `yaz and yazln` functions that prints the string variable in parentheses are given below.


	public static void yaz(String gelen) {
		System.out.print(gelen);
	}

Same function but writing parameters on the new line is given below.

	public static void yazln(String gelen) {
		System.out.println(gelen);
	}
	
	public static void yazln() {
			System.out.println();		
	}

---

### Building function to print integer and double variable parameter

The `yaz and yazln` functions that print the integer variable in parentheses are given below.

	public static void yazln(Integer gelen) {
		System.out.println(gelen); 
	}	
	
	public static void yaz(Integer gelen) {
		System.out.print(gelen); 
	}
	
	public static void yaz(Double gelen) {
		System.out.print(gelen); 
	}

---

### Building function generated via another function and print integer  variable parameter

The `yaz` function that prints the integer variable in parentheses is given below.

	public static void yaz(int s1, int s2) {
		yaz("Sayıların toplamı : "+ (s1+s2)); 
	}

---

### Building function that makes addition, subtraction, multiplication, and division via two integer variable parameter

The `topla` function prints addition of two integer variables (s1 and s2) in parentheses.

	public static int topla(int s1,int s2) {
		return s1+s2;
	}	

The `cikar` function prints subtraction of two integer variables (s1 and s2) in parentheses.

	public static int cıkar(int s1,int s2) {
		return s1-s2;
	}	

The `carp` function prints multiplication of two integer variables (s1 and s2) in parentheses.

	public static int carp(int s1,int s2) {
		return s1*s2;
	}	

The `bol` function prints division of two integer variables (s1 and s2) in parentheses.
	
	public static int bol(int s1,int s2) {
		return s1/s2;
	}

---

### Creating a function that calculates the factorial over the specified integer variable parameter

The `faktoriyel` function prints factorial of an integer variable (sayi) in parentheses.

	public static int faktoriyel(int sayi) {
		    int num = 1;
		    yazln(num);
		    for (int i = 2; i <= sayi; i++) {	
		    	num = num * i;
		    	yazln(num);
		    }
		    return num;
		}	

---
	
### Display output of functions written in Java main method on the console.
	
	public static void main(String[] args) {	
	
		// HM 2 FAKTORIYEL		
			
		yazln("Faktörüyeli alınacak sayıyı giriniz: ");
		int sayi=okuint();
		faktoriyel(sayi);
	
	}

## Contact Me

If you have something to say to me please contact me: 

 - Twitter: [Doguilmak](https://twitter.com/Doguilmak) 
 - Mail address: doguilmak@gmail.com

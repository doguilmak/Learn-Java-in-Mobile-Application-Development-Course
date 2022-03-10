
# Java and Mobile Application Development - Course 3

This week, we created the algorithm that the professor asked us as homework. In the algorithm, we were tried to build a basic calculator that can only add numbers with using keyboard inputs.

---

The basic inputs made in this course and shown by the professor are explained. You can review what was done below in order. If there are points you want to add, please correct us.

### Importing utilities

Java's scanner utilities have been added to receive input from the keyboard.

    import java.util.Scanner;

---

### Building variable for keyboard input

A variable has been created for the keyboard input. Thanks to this variable, the values ​​we enter will be stored in memory and can be assigned to another variable.

    
	Scanner keyboardInput = new Scanner(System.in);

---

### Building the basic calculator

After the two different inputs (num1, num2) received from the user were processed in the algorithm, the addition process was made and printed on the console.


	System.out.print("Enter num1: ");
	int num1 = keyboardInput.nextInt();
	System.out.print("Enter num2: ");
	int num2 = keyboardInput.nextInt();		
	System.out.println(num1 + num2);


## Contact Me

If you have something to say to me please contact me: 

 - Twitter: [Doguilmak](https://twitter.com/Doguilmak) 
 - Mail address: doguilmak@gmail.com


# Java and Mobile Application Development - Midterm Exam Exercise 3 

This exercise is one of the studies that the professor asked us to do in preparation for the midterm exam. This exercise is game-based. **There are 5 words containing 5-letter city names in the memory of the program. When the program first runs, one of these 5 cities will be chosen randomly and will be kept in memory and will not be displayed to the user. While running the program, the time will run backward for 60 seconds and if the user cannot find the correct answer within 60 seconds, the program will give a "60 saniye doldu. Islem gecersiz." warning, and all elements will be unselected. If 5 wrong letters are selected, the program will give a "Oyun Bitti" warning, and all transactions will be invalid. If the player guesses all the letters correctly, the program will give a "Kazandiniz! Sehir: " warning, and all transactions will be invalid.** An algorithm has been created for the user to play.

The basic inputs made in this course and shown by the professor are explained. You can review what was done below in order. If there are points you want to add, please correct us.


## Creating loop for generating columns

As stated before, we have the right to create columns 10 times in total in the game. A <code>while</code> loop is created for this. `say` corresponds to the limiting parameter which is our right to guess the city and `gizli.contains("*")` corresponds to does city name has hidden stars or not. Until the `say` number of rounds reaches 4 and city name does not contains any star, a layout has been created to produce each round.
		
	while (say < 4 && gizli.contains("*")) {
	
	}



## Branching process of generating columns and numbers

### Importing utilities

Java's scanner utilities have been added to receive input from the keyboard.

    import java.util.Scanner;

### Generate random numbers for the algorithm

Java provides three ways to generate random numbers using some built-in methods and classes. In this project, we created via <code>Math.random()</code>. The `Math.random()` function returns a floating-point, pseudo-random number in the range $0$ to less than $1$ (inclusive of $0$, but not $1$) with approximately uniform distribution over that range — which you can then scale to your desired range. The implementation selects the initial seed to the random number generation algorithm; it cannot be chosen or reset by the user.
    
	private static String il = iller[(int) (Math.random() * iller.length)];


###	Building integer variables and array

First of all, `iller`, which is the array containing the provinces, the variable `il` is created to be randomly selected from among the provinces, `gizli` is created to make it difficult for the user to guess, and finally the integer variable `say`, which was created to play a maximum of $5$ rpunds as specified in the rules.

	private static String[] iller = {"ADANA", "AFYON", "BURSA", "KONYA", "TOKAT"};
	private static String il = iller[(int) (Math.random() * iller.length)];
	private static String gizli = new String(new char[il.length()]).replace("\0", "*");
	private static int say = 0;


### Branching process

As stated in the introduction, the game continues within the framework of several different rules and limits, such as a time limitation of $60$ seconds and have $5$ rights. If it is lost, a warning is given to the player or user as **"Oyun Bitti"**. If it is timed up a warning is given to the player or user as **"60 saniye doldu. Islem gecersiz."**.


	long basla = System.currentTimeMillis();
	long bitir = basla + 60*1000; // Milisaniye
	Scanner sc = new Scanner(System.in);
	
	while (say < 4 && gizli.contains("*")) {
		if (System.currentTimeMillis() > bitir) {
			System.out.println("60 saniye doldu. Islem gecersiz.");
		    System.exit(1);
		}
		System.out.println("Harf tahmin et!");
		System.out.println(gizli);
		String tahmin = sc.next().toUpperCase();
		sehir_bul(tahmin);
	}
	if(say >= 4) {
		System.out.println("Oyun Bitti");
	}
	sc.close();

### Evaluation and benchmarking of user input

In this section, a comparison was made between the letters entered by the user or the player and the randomly selected cities. If the entered letter exists in the randomly selected city, the specified letter is substituted for **" * "**. If it is won, a warning is given to the player or user as **"Kazandiniz! Sehir: "**.

	String newasterisk = "";
	for (int i = 0; i < il.length(); i++) {
		if (il.charAt(i) == tahmin.charAt(0)) {
			newasterisk += tahmin.charAt(0);
		} else if (gizli.charAt(i) != '*') {
			newasterisk += il.charAt(i);
		} else {
			newasterisk += "*";
		}
	}

	if (gizli.equals(newasterisk)) {
		say++;
	} else {
		gizli = newasterisk;
	}
	if (gizli.equals(il)) {
		System.out.println("Kazandiniz! Sehir: " + il);
	}

### Display function output on the console

You can examine the console output shown below as an example.

Output:

>Harf tahmin et!
> 
><b>*****</b>
>
>A 
>
>Harf tahmin et!
>
><b>A**** </b>
>
>F 
>
>Harf tahmin et! 
>
><b>AF***</b>
>
>Y
>
>Harf tahmin et! 
>
><b>AFY**</b>
>
>O 
>
>Harf tahmin et! 
>
><b>AFYO* </b>
>
>N 
>
><b>Kazandiniz! Sehir: AFYON</b>

<br>

## Contact Me

If you have something to say to me please contact me: 

 - Twitter: [Doguilmak](https://twitter.com/Doguilmak) 
 - Mail address: doguilmak@gmail.com


# Java and Mobile Application Development - Midterm Exam Exercise 1 

This exercise is one of the studies that the professor asked us to do in preparation for the midterm exam. This exercise is game-based. When two dice are rolled in the game **if their total is 7 or 11, it is won. If the total is 2, 3, or 12, it is lost. If the total is 4, 5, 6, 8, 9, 10, the player continues to roll the dice.** In addition, we have the right to roll the dice 4 times in total in the game.

The basic inputs made in this course and shown by the professor are explained. You can review what was done below in order. If there are points you want to add, please correct us.

---

### Creating loop for right to roll the dice

As stated before, we have right to roll the dice 4 times in total in the game. A <code>while</code> loop is created for this. `oyun_hakki` is corresponds to limiting parameter which is our right to roll.

	int oyun_hakki = 4;
    while (true) {
			if (oyun_hakki == 0) {
	        	System.out.println("Hakkınız doldu.");
	        	break;
	        }
	}

---

### Creating dice


Java provides three ways to generate random numbers using some built-in methods and classes. In this project, we generated random numbers with <code>Math.random()</code> via <code>Math</code> class. We can easily generate random numbers of types integers, float, double, long, booleans using this class. To do that, we need to define our random number type. We need to make it as integers between 1 and 6, then sum up the numbers corresponding to the dice. `zar1` corresponds to dice 1, `zar2` corresponds to dice 2 and `toplam` corresponds to sum.
    
	int zar1=(int)(Math.random()*6+1);
    int zar2=(int)(Math.random()*6+1);
    int toplam = zar1 + zar2;

It could be better to show the results on the console in every loop:

	System.out.println("1 Numarali Zar = " + zar1); 
    System.out.println("2 Numarali Zar = " + zar2);
    System.out.println("Zar toplami = " + toplam);

---

### Branching process of generating six integers 

As we said at the top, when two dice are rolled in the game if their total is 7 or 11, it is won. If the total is 2, 3, or 12, it is lost. If the total is 4, 5, 6, 8, 9, 10, the player continues to roll the dice. Let's build if...else if statement for our rule.


    if (toplam==2 || toplam==3 || toplam==12) {
        System.out.println("Kaybettin! Sayi: " + toplam);
        break;
    } else if(toplam==7 || toplam==11) { 
        System.out.println("Kazandin! Sayi: " + toplam);
        break; 
    }
    
    System.out.println("============");	        
    oyun_hakki--;

If our right to roll the dice equals the 4, the game will end. Let's try 3 games in total.

#### Game 1:

Output:

> Oyun 4
> 
> 1 Numarali Zar = 4 
> 
> 2 Numarali Zar = 4 
> 
> Zar toplami = 8
> 
> ============ 
> 
> Oyun 3
> 
> 1 Numarali Zar = 3 
> 
> 2 Numarali Zar = 5 
> 
> Zar toplami = 8
> 
> ============ 
> 
> Oyun 2
> 
> 1 Numarali Zar = 2 
> 
> 2 Numarali Zar = 3 
> 
> Zar toplami = 5
> 
> ============ 
> 
> Oyun 1
> 
> 1 Numarali Zar = 5 
> 
> 2 Numarali Zar = 3 
> 
> Zar toplami = 8
> 
> ============ 
> 
> Hakkınız doldu.

#### Game 2

Output:

> Oyun 4 
> 1 Numarali Zar = 2 
> 2 Numarali Zar = 5 Zar toplami = 7 
> Kazandin! Sayi: 7

#### Game 3

Output:

> Oyun 4 
> 
> 1 Numarali Zar = 2 
> 
> 2 Numarali Zar = 1 
> 
> Zar toplami = 3
> 
> Kaybettin! Sayi: 3

---

## Contact Me

If you have something to say to me please contact me: 

 - Twitter: [Doguilmak](https://twitter.com/Doguilmak) 
 - Mail address: doguilmak@gmail.com

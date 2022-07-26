
# Java and Mobile Application Development - Midterm Exam Exercise 2 

This exercise is one of the studies that the professor asked us to do in preparation for the midterm exam. This exercise is game-based. **A lucky ball game is a numerical game based on choosing a specified number of numbers from two different sets of numbers. The first set of numbers consists of numbers 1-34, and the second set of numbers consists of numbers 1-14. Participants will be able to participate in the game by choosing 5 numbers from the first set of numbers and 1 number from the second set of numbers. They can play a maximum of 10 games in a column**. An algorithm has been created for the user to play the chance ball game automatic.

The basic inputs made in this course and shown by the professor are explained. You can review what was done below in order. If there are points you want to add, please correct us.


## Creating loop for generating columns

As stated before, we have the right to create columns 10 times in total in the game. A <code>while</code> loop is created for this. `tur` is corresponds to limiting parameter which is our right to roll. Until the `tur` number of rounds reaches zero , a layout has been created to produce 6 different numbers in each round.
		
	public static void sans_topu(int tur) {
	    while (true) {
				while(true) {
			
				}
		}
	}



## Branching process of generating columns and numbers

### Importing utilities

Java's Random utility has been added to generate random numbers. **An instance of java Random class is used to generate random numbers**. This class provides several methods to generate random numbers such as type integer, double, long, float etc. The random number generation algorithm works on the seed value.

    import java.util.Random;

### Generate random numbers for the algorithm

Java provides three ways to generate random numbers using some built-in methods and classes. In this project, we created via <code>java.util.Random</code> class. We can easily generate random numbers of types integers, float, double, long, booleans using this class. 
    
	Random rastgele=new Random();


###	Building integer variables and array

First, we created the maximum value of the first set which corresponds `elemansayisi1`, then created the maximum value of the first set which corresponds to the  `elemansayisi2`. The `dizi` corresponds to the $6x1$ matrix which has our 6 random numbers. `yedek` and `yedek2`values ​​correspond to the random numbers to have been generated.

	int elemansayisi1=34;
	int elemansayisi2=14;
	int[] dizi=new int[6];			
	
	int yedek, yedek2;
	int sira=0;


### Branching process

As stated, the numbers to be produced between 1-34 in the first set and the numbers to be produced between 1-14 in the second set must be 6 in total and **different from each other**. Below you can see the algorithm that corresponds to these conditions.


	System.out.println("======== " + tur + " Numaralı Kolon ===========");				
	
	yedek2=rastgele.nextInt(elemansayisi2)+1;
	dizi[5] = yedek2;				
	
	while(true)	{
		yedek=rastgele.nextInt(elemansayisi1)+1;					
		if(sira==5)
			break;
		
		int i = 0;
		for (i = 0; i < dizi.length; i++)	{
			if(yedek==dizi[i])
				break;
		}
		if(i==dizi.length)	{
			dizi[sira]=yedek;
			sira++;
		}
		
	}

### Showing the columns and numbers on the console

Finally, a loop has been created so that the obtained columns and numbers can be seen on the console. When all operations are completed, for information, the `if` statement has been added.

	for(int i = 1; i <= 6; i++)	{
		System.out.println(i+ " Numaralı Sayı: "+ dizi[i-1]);
	}
	if (tur == 1)	{
		System.out.println("Kolon Doldu!");
		break;
	}
					
	tur--;

### Display function output on the console in Java main method.

	
	public static void main(String[] args) {			
		sans_topu(10);			
	}

Output:

> ======== 10 Numaralı Kolon =========== 
> 
> 1 Numaralı Sayı: 8 
> 
> 2 Numaralı Sayı: 29 
> 
> 3 Numaralı Sayı: 34 
> 
> 4 Numaralı Sayı: 14 
> 
> 5 Numaralı Sayı: 30 
> 
> 6 Numaralı Sayı: 9
> 
> ======== 9 Numaralı Kolon =========== 
> 
> 1 Numaralı Sayı: 19 
> 
> 2 Numaralı Sayı: 33 
> 
> 3 Numaralı Sayı: 34 
> 
> 4 Numaralı Sayı: 10 
> 
> 5 Numaralı Sayı: 27 
> 
> 6 Numaralı Sayı: 4
> 
> ======== 8 Numaralı Kolon =========== 
> 
> 1 Numaralı Sayı: 1 
> 
> 2 Numaralı Sayı: 10 
> 
> 3 Numaralı Sayı: 19 
> 
> 4 Numaralı Sayı: 28 
> 
> 5 Numaralı Sayı: 12 
> 
> 6 Numaralı Sayı: 13
> 
> ======== 7 Numaralı Kolon =========== 
> 
> 1 Numaralı Sayı: 11 
> 
> 2 Numaralı Sayı: 24 
> 
> 3 Numaralı Sayı: 17 
> 
> 4 Numaralı Sayı: 9 
> 
> 5 Numaralı Sayı: 13 
> 
> 6 Numaralı Sayı: 12
> 
> ======== 6 Numaralı Kolon =========== 
> 
> 1 Numaralı Sayı: 1 
> 
> 2 Numaralı Sayı: 31 
> 
> 3 Numaralı Sayı: 34 
> 
> 4 Numaralı Sayı: 11 
> 
> 5 Numaralı Sayı: 12 
> 
> 6 Numaralı Sayı: 6
> 
> ======== 5 Numaralı Kolon =========== 
> 
> 1 Numaralı Sayı: 14 
> 
> 2 Numaralı Sayı: 10 
> 
> 3 Numaralı Sayı: 28 
> 
> 4 Numaralı Sayı: 11 
> 
> 5 Numaralı Sayı: 15 
> 
> 6 Numaralı Sayı: 5
> 
> ======== 4 Numaralı Kolon =========== 
> 
> 1 Numaralı Sayı: 4 
> 
> 2 Numaralı Sayı: 16 
> 
> 3 Numaralı Sayı: 21 
> 
> 4 Numaralı Sayı: 27 
> 
> 5 Numaralı Sayı: 19 
> 
> 6 Numaralı Sayı: 3
> 
> ======== 3 Numaralı Kolon =========== 
> 
> 1 Numaralı Sayı: 1 
> 
> 2 Numaralı Sayı: 18 
> 
> 3 Numaralı Sayı: 26 
> 
> 4 Numaralı Sayı: 27 
> 
> 5 Numaralı Sayı: 12 
> 
> 6 Numaralı Sayı: 8
> 
> ======== 2 Numaralı Kolon =========== 
> 
> 1 Numaralı Sayı: 15 
> 
> 2 Numaralı Sayı: 9 
> 
> 3 Numaralı Sayı: 18 
> 
> 4 Numaralı Sayı: 31 
> 
> 5 Numaralı Sayı: 5 
> 
> 6 Numaralı Sayı: 7
> 
> ======== 1 Numaralı Kolon =========== 
> 
> 1 Numaralı Sayı: 1 
> 
> 2 Numaralı Sayı: 24 
> 
> 3 Numaralı Sayı: 30 
> 
> 4 Numaralı Sayı: 34 
> 
> 5 Numaralı Sayı: 27 
> 
> 6 Numaralı Sayı: 14 
> 
> Kolon Doldu!

---

## Contact Me

If you have something to say to me please contact me: 

 - Twitter: [Doguilmak](https://twitter.com/Doguilmak) 
 - Mail address: doguilmak@gmail.com

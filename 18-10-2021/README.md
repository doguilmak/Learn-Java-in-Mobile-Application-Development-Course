
# Java and Mobile Application Development - Course 6

This week, we created the algorithm that can give 6 random values between stated parameters. In the algorithm, we were tried to build functions for several purposes.

The basic inputs made in this course and shown by the professor are explained. You can review what was done below in order. If there are points you want to add, please correct us.

### Importing utilities

Java's <code>Random</code> utility have been added to generate random numbers.

    import java.util.Random;

---

### Generate random numbers for the algorithm


Java provides three ways to generate random numbers using some built-in methods and classes. In this project, we created via <code>java.util.Random</code> class. We can easily generate random numbers of types integers, float, double, long, booleans using this class.
    
	Random rastgele=new Random();

---

### Branching process of generating six integers 

Since it has created the Random feature, it remains to create an array containing six different integers.


	int[] dizi=new int[6];
		
		if (max-min < 6) {
			System.out.println("Maksimum ve minimum sayı aralığı en az 6 olmalıdır.");
			System.exit(0);
		}
		if (min>max) {
			System.out.println("Maksimum sayı minimum sayıdan büyük olmalıdır.");
			System.exit(0);
		}

As you can see, the branching process here is about the maximum and minimum values ​​of random numbers in the array. If the maximum number in the function is greater than the minimum number, the array will not be created. In addition, the maximum integer must be equal to or bigger than six from the minimum number.

---

### Generating six different integers

The algorithm that gives six different integer values ​​and records these values ​​in an array, respectively, is given below. 

	int yedek;
	int sira=0;
	while(true) {
		yedek=rastgele.nextInt(max-min)+min;
		int i = 0;
		for (i = 0; i < dizi.length; i++) {
			if(yedek==dizi[i])
				break;
		}
		if(i==dizi.length)
		{
			dizi[sira]=yedek;
			sira++;
		}
		if(sira==6)
			break;
	}			
	for(int i = 1; i <= 6; i++)	{
		System.out.println(i+ " Numaralı Sayı: "+ dizi[i-1]);
		
	}
	return sira;

To avoid re-creating the generated random integer, another variable named <code>yedek</code> was generated. For example, if the <code>yedek</code> value and the previously created <code>rastgele</code> value ​​are the same, the random number will not be output to the user. When the number of the generated numbers reaches 6, the algorithm will stop, and the generated integers will be specified in the console.

---

### Display output of functions written in Java main method on the console.

The <code>rastgele_bul</code> function that prints the integer variable in parentheses is given below. As we can see minimum number (5) is bigger than (11) and we have minumum size of 6 (11-5=6). <code>rastgele_bul(11, 5);</code> and <code>rastgele_bul(5, 10);</code> will give you error if you try.

	public static void main(String[] args) {
		
		// Random sayılar
		rastgele_bul(5, 11);
			
	}

Output:

> 1 Numaralı Sayı: 7 
>
> 2 Numaralı Sayı: 8 
>
> 3 Numaralı Sayı: 9 
>
> 4 Numaralı Sayı: 5
>
>  5 Numaralı Sayı: 6 
>
>  6 Numaralı Sayı: 10

---

## Contact Me

If you have something to say to me please contact me: 

 - Twitter: [Doguilmak](https://twitter.com/Doguilmak) 
 - Mail address: doguilmak@gmail.com


# Java and Mobile Application Development - Course 2

The basic inputs made in this course and shown by the professor are explained. You can review what was done below in order. If there are points you want to add, please correct us.

---

This week, we created the algorithm that the professor asked us as homework. In the algorithm, it is aimed to randomly give 6 numbers from the integers from 1 to 49 without duplicated numbers.

### Setting variables

Variables that specify the random number generating variable, number range and how many numbers are drawn are created in array.

    Random rastgele=new Random();
	int elemansayisi=49;
	int[] dizi=new int[6];

---

### Setting variables for the loop and random values

A 'yedek' variable has been created to help us with the order of the random numbers created in the array and in case of repetitive numbers.

    
		int yedek;
		int sira=0;

---

### Building the loop

An algorithm is written that generates a random number, generates another number if it is passed in the 'dizi' array, and finally stops the loop if 6 numbers are produced.


    while(true) {
			yedek=rastgele.nextInt(elemansayisi)+1;
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

---

### Show values ​​in console

As a result, a for loop is created, which outputs the values ​​in the array to us in the console.

    for(int i = 1; i <= 6; i++)	{
	System.out.println(i+ " Numaralı Sayı: "+ dizi[i-1]);
    }

---

## Contact Me

If you have something to say to me please contact me: 

 - Twitter: [Doguilmak](https://twitter.com/Doguilmak) 
 - Mail address: doguilmak@gmail.com

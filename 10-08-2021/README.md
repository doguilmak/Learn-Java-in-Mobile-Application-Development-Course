
# Java and Mobile Application Development - Course 7

This week, we created the algorithm that can make 5x5 matrix with random integers between 0 and 24. In the algorithm, first we were tried to make 5x5 matrix from 0 to 24 without random order. Then, we made it with random utility.

The basic inputs made in this course and shown by the professor are explained. You can review what was done below in order. If there are points you want to add, please correct us.


## Making matrix without random utility

###	Building integer variables and array

First, we created the row, column, delimiter and array values. Then, variables were valued as a 5x5 matrix. Named row as `satir`, column as `sutun`, delimeter as `sabit` and array as `dizi`.

	int satir=5;
	int sutun=5;
	int sabit=1;
		
	int[][] dizi = new int[satir][sutun];

### Branching process of generating matrix

Row and column values ​​are created in a nested loop. First, row and then column values ​​are assigned. When the column loop is completed, <code>System.out.println()</code> makes a new line to show the matrix relatively better on the console. This continued until `satir` equals 4 ​​(to create a 5x5 matrix).


		for(int i=0;i<satir;i++)
		{			
			for(int j=0;j<sutun;j++)
			{				
				dizi[i][j]=sabit;
				System.out.print(dizi[i][j]+ "\t");
				sabit++;				
			}			
			System.out.println();		
		}

Console:

> 1 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2 &nbsp;&nbsp;&nbsp;&nbsp;3 &nbsp;&nbsp;&nbsp;&nbsp;4 &nbsp;&nbsp;&nbsp;&nbsp;5
> 
> 6 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7 &nbsp;&nbsp;&nbsp;&nbsp;8 &nbsp;&nbsp;&nbsp;&nbsp;9 &nbsp;&nbsp;&nbsp;&nbsp;10
> 
> 11 &nbsp;&nbsp;12 &nbsp;&nbsp;13 &nbsp;&nbsp;14 &nbsp;&nbsp;15
> 
> 16 &nbsp;&nbsp;17 &nbsp;&nbsp;18 &nbsp;&nbsp;19 &nbsp;&nbsp;20
> 
> 21 &nbsp;&nbsp;22 &nbsp;&nbsp;23 &nbsp;&nbsp;24 &nbsp;&nbsp;26


## Making matrix with random utility

### Importing utilities

Java's Random utility has been added to generate random numbers. **An instance of java Random class is used to generate random numbers**. This class provides several methods to generate random numbers such as type integer, double, long, float etc. The random number generation algorithm works on the seed value.

    import java.util.Random;

### Generate random numbers for the algorithm

Java provides three ways to generate random numbers using some built-in methods and classes. In this project, we created via <code>java.util.Random</code> class. We can easily generate random numbers of types integers, float, double, long, booleans using this class. 
    
	Random rast=new Random();

### Branching process of generating matrix

The matrix will be created within the framework of the specified parameters, as was done in the non-random section. However, unlike the previous section, our feature will be used <code>new Random()</code>, which generates random numbers instead of a delimiter. <code>Random rast=new Random();</code> instantiate random number generator using system-supplied value as seed. and <code>rast.nextInt(25);</code> will give us random integer values between 0 to 24.

	for(int i=0;i<satir;i++)
		{
			for(int j=0;j<sutun;j++)
			{
				Random rast=new Random();	
				int sabit=rast.nextInt(25);
				dizi[i][j]=sabit;
				System.out.print(dizi[i][j]+ "\t");
			}
			System.out.println();
		}

Console:

> 24 &nbsp;&nbsp;11 &nbsp;&nbsp;5 &nbsp;&nbsp;&nbsp;&nbsp;4 &nbsp;&nbsp;&nbsp;&nbsp;11
> 
> 0 &nbsp;&nbsp;&nbsp;&nbsp;5 &nbsp;&nbsp;&nbsp;&nbsp;17 &nbsp;&nbsp;3 &nbsp;&nbsp;&nbsp;&nbsp;24
> 
> 5	&nbsp;&nbsp;&nbsp;&nbsp;13 &nbsp;&nbsp;1 &nbsp;&nbsp;&nbsp;&nbsp;21 &nbsp;&nbsp;18
> 
> 8	&nbsp;&nbsp;&nbsp;&nbsp;12 &nbsp;&nbsp;22 &nbsp;&nbsp;8 &nbsp;&nbsp;&nbsp;&nbsp;24
> 
> 22  &nbsp;&nbsp;18 &nbsp;&nbsp;8 &nbsp;&nbsp;&nbsp;&nbsp;8 &nbsp;&nbsp;&nbsp;&nbsp;4

The algorithm generates random values, so do not wait to see the same results. It is possible, but it is just for the presentation :).


## Contact Me

If you have something to say to me please contact me: 

 - Twitter: [Doguilmak](https://twitter.com/Doguilmak) 
 - Mail address: doguilmak@gmail.com


# Java and Mobile Application Development - Course 7

This week, we created the algorithm which can make calculations on circles and spheres on radius. In this project, the circumference and area of ​​the circle formed over the radius variable (r), the volume of ​​the sphere, and the surface area were calculated. This calculation was made via a class called cember.

The basic inputs made in this course and shown by the professor are explained. You can review what was done below in order. If there are points you want to add, please correct us.

### Building class

We are building classes because classes help you take all the properties and behaviors of an object in your program, and combine them into a single template. The formulas in the class are given below.

Builded <code>cevre_hesapla</code> for calculading circumference of the circle.
$$ 2 *\Pi * r$$

Builded <code>alan_hesapla</code> for calculading area of the circle.

$$ \Pi * r^2$$

Builded <code>hacim_hesapla</code> for calculading the volume of ​​the sphere.

$$ 4/3 * \Pi * r^3$$

Builded <code>y_alan_hesapla</code> for calculading the surface area of ​​the sphere.

$$ 4 * \Pi * r^2$$
    
	class cember {
			
			public static double cevre_hesapla(int r) {
				return 2 * Math.PI * r;
			}
				
			public static double alan_hesapla(int r) {
			        return Math.PI * Math.pow(r, 2);
			}
				
			public static double hacim_hesapla(int r) {
				return 4/3 * Math.PI * Math.pow(r, 3);
			}
				
			public double y_alan_hesapla(int r) {
				return 4 * Math.PI * Math.pow(r, 2);
			}
			
	}


### Setting the variables

For making calculation; <code>y_alan</code>, <code>volume</code>, <code> area</code>, <code>perimeter</code>, and also a radius <code>r</code> variable were created for four different calculations. After that we used our <code>cember</code>class for making calculations. In addition, we can define functions with making `cember cm = new cember();`.

	int r=3;
	double cevre=0, alan=0, hacim=0, y_alan=0;

	cevre = cember.cevre_hesapla(r);
	alan = cember.alan_hesapla(r); 
	hacim = cember.hacim_hesapla(r); 

	cember cm = new cember();
	y_alan=cm.y_alan_hesapla(r);

Let's print out our calculations and see.

	System.out.println("Cevre: " + cevre);
	System.out.println("Alan: " + alan);
	System.out.println("Hacim: " + hacim);
	System.out.println("Yüzey alani: " + y_alan);	

Output:

> Cevre: 18.84955592153876 
> 
> Alan: 28.274333882308138 
> 
> Hacim: 84.82300164692441
>  
> Yüzey alani: 113.09733552923255


## Contact Me

If you have something to say to me please contact me: 

 - Twitter: [Doguilmak](https://twitter.com/Doguilmak) 
 - Mail address: doguilmak@gmail.com


# Java and Mobile Application Development - Course 1

The basic inputs made in this course and shown by the professor are explained. You can review what was done below in order. If there are points you want to add, please correct us.

---

### Setting variables and printing to console

Integer, character, boolean, float, double and string variables are created.

    System.out.print("Hello World");
	
	int sayi1=10;
	char karakter='A';
	boolean boolean=true;
	float sayi2=10;
	double sayi3=100;
	String ad="Can";
	
	System.out.println(sayi1);
	System.out.println(karakter);
	System.out.println(boolean);
	System.out.println(sayi2);
	System.out.println(sayi3);
	System.out.println(ad);

---

### Operation on two different variables

Creating and manipulating two different variables in two different ways.

    int s1;
	int s2;
	int sonuc;
	//int s1, s2, sonuc;
	
	int s1=5;
	int s2=3;
	int sonuc;
	
	sonuc= s1 + s2;				
	System.out.print("İki Sayının Toplamı: "+sonuc);

---

### Getting data from keyboard (from user)

Receiving data from the keyboard (from the user) and printing it on the screen. For the code to run, **import java.util.Scanner;** the tool should be added at the beginning of the code.


    Scanner okuyucu=new Scanner(System.in);
	System.out.print("Klavyeden bir değer giriniz:");
	String a = okuyucu.next();
	System.out.print("Klavyeden girilen değer: "+a);

---

### Operate on the data entered from the keyboard

In addition; In the java file in the src folder, there are 2 different examples similar to the example below.

    float s1, s2, sonuc;
		
	Scanner klavye=new Scanner(System.in);
	System.out.print("1. Sayıyı Giriniz:");
	s1 = klavye.nextFloat();
	System.out.print("2. Sayıyı Giriniz:");
	s2 = klavye.nextFloat();
	
	//İŞLEMLER
	sonuc=s1+s2;
	System.out.println("İki sayının toplamı:"+sonuc);
	
	sonuc= s1 - s2;
	System.out.println("İki sayının farkı:"+sonuc);
	
	sonuc= s1 * s2;
	System.out.println("İki sayının çarpımı:"+sonuc);
	
	sonuc= s1 / s2;
	System.out.println("İki sayının bölümü:"+sonuc);

---

### Creating a simple calculator

Performing addition, subtraction, multiplication and division operations in line with the information received from the user.

    float s1, s2, sonuc;
	String islem="";
	
	Scanner klavye=new Scanner(System.in);
	System.out.print("1. Sayıyı Giriniz: ");
	s1 = klavye.nextFloat();
	System.out.print("2. Sayıyı Giriniz: ");
	s2 = klavye.nextFloat();
	System.out.print("Yapmak İstediğiniz İşlemi Giriniz: ");
	islem = klavye.next();
	
	sonuc=0;				
	if(islem.equals("+"))
		sonuc= s1 + s2;
	else if(islem.equals("-"))
		sonuc= s1 - s2;
	else if(islem.equals("*"))
		sonuc= s1 * s2;
	else if(islem.equals("/"))
		sonuc = s1 / s2;
	
	System.out.println("Sonuç: " + sonuc);


## Contact Me

If you have something to say to me please contact me: 

 - Twitter: [Doguilmak](https://twitter.com/Doguilmak) 
 - Mail address: doguilmak@gmail.com

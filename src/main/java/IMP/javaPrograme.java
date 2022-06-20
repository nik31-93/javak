package IMP;

public class javaPrograme {
	static String name="urmmillaa";
	static int value=121345569;
	
	public void Fabonacci () {
		int a = 10;
		int b = 11;
		for (int i = 0; i < 10; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(a);	
		}
	
	}
	
	public void Factorial () {
		int a = 7;
		int b = 1;
		for (int i = a; i > 0; i--) 
		{
			b = b * i;
		}
		System.out.println(b);
	}
		
	public void Find2nd_large_smallnum () {		
		int temp, size;
		int array[] = { 25, 200, 15, 63, 100, 96, 57 };
		size= array.length;
		for (int i = 0; i < size; i++) 
		{					
			for (int j = i + 1; j < size; j++) 
			{	
				if (array[i] > array[j]) 
				{
					temp = array[i];	//		a=b		25
					array[i] = array[j];//		b=c		15
					array[j] = temp;	//		c=a		25
				}
			}
		}
		System.out.println("Smallest element of the array is ::    " + array[0]);
		System.out.println("2nd Smallest element of the array is ::" + array[1]);
		System.out.println("3rd Smallest element of the array is ::" + array[2]);
		System.out.println("3rd largest element of the array is :: " + array[size - 3]);
		System.out.println("2nd largest element of the array is :: " + array[size - 2]);
		System.out.println("largest element of the array is ::     " + array[size - 1]);		
		}
	
	public void Findduplicates () {
		String a=Integer.toString(value);
		int l1=a.length();		
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l1;j++)
				if (j>i) 
			{
				char a1=a.charAt(i);
				char a2= a.charAt(j);
				if(a1==a2)
				{
					System.out.println(a1);
				}
			}
		}
	}
	
	public void int_char_string_from_array() {
		Object[] a = { 'A', 2244, "selenium", 'Z', 345 };
		for (int i = 0; i < a.length; i++) {			
			if (a[i].getClass() == Integer.class) {
				System.out.println("integer value is "+a[i]);
			}	
			else if(a[i].getClass()==Character.class)
			{
				System.out.println("character value is "+a[i]);
			}
			else if(a[i].getClass()==String.class)
			{
				System.out.println("String value is "+a[i]);
			}
		}
	}
	
	public void Prime_number () {
		int i,j;	
		for  (i=0;i<=100;i++)
		{		
			int a=0;//1,2
			for (j=i;j>=1;j--)
				{
				if(i%j==0) {//0%1=
					a=a+1;		
				}
			}
			if(a==2) {
				System.out.println(i);
			}
		}
	}
	
	public void Removeduplicatearray() {
String str = "Hello World!!";
		
		int a = 0;//1,2,3,4
		
		char[] xyz = str.toCharArray();

		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i + 1; j < str.length(); j++) 
			{
				if (xyz[i] == xyz[j]) 
				{
					System.out.println(xyz[j]);
				a++;
				break;
				}
			}
		}
		System.out.println(a);
	}
	
	public void Seperatenumcharsym() {
		String Number = "";
		String Alphabate = "";
		String Scharacter = "";

		String abc = "goo12^gle.1$2_34@gmail.com";
		int num = abc.length();
		for (int i = 0; i < num; i++) {
			char ch = abc.charAt(i);
			if (Character.isDigit(ch)) 
			{
				Number = Number + ch;
			} 
			
			else if (Character.isLetter(ch)) 
			{
				Alphabate = Alphabate + ch;
			} 
			
			else {
				Scharacter = Scharacter + ch;
			}
		}
		System.out.println(Number);
		System.out.println(Alphabate);
		System.out.println(Scharacter);
	}
	
	public void String_Palindrome() {
String palindrome1 = "abcdcba";
		
		int palindrome2 = 12321;
		String a = Integer.toString(palindrome2);// convert into String
		
		String palindrome3 = "312";
		
		
		int a1 = palindrome1.length() - 1;
		System.out.println(a1);
		for (int i = a1; i >= 0; i--) {
			System.out.print(palindrome1.charAt(i));			
		}System.out.println(" ");
		
		int a2 = a.length() - 1;
		System.out.println(a2);
		for (int i = a2; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}System.out.println(" ");
		
		int a3 = palindrome3.length() - 1;
		System.out.println(a1);
		for (int i = a3; i >= 0; i--) {
			System.out.print(palindrome3.charAt(i));
		}
	}
	
	public void String_Reverse() {
		String abc = "stringname";
		
		
		int a = abc.length() - 1;
		System.out.println(a);
		for (int i = a; i >= 0; i--) {
			System.out.print(abc.charAt(i));
		}
	}

public void swap2numwithout3rdvariable() {
	int a = 10;
	int b = 11;
	for (int i = 0; i < 10; i++) {
		int c = a + b;
		a = b;
		b = c;
		System.out.println(a);
	}
	}
	
	
		
}
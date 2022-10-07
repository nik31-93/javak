package javaprogrameTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import imp.javaPrograme;

public class test extends javaPrograme{
	private static javaPrograme jp;
	@AfterMethod
	public void endTest(){
		System.out.println("--------------");
	}
	
	@Test(priority=1)
	public void A1(){
	jp=new javaPrograme();
	jp.Fabonacci();
	}
	
	@Test(priority=2)
	public void A2(){
	jp=new javaPrograme();
	jp.Factorial();
	}
	
	@Test(priority=3)
	public void A3(){
	jp=new javaPrograme();
	jp.Find2nd_large_smallnum();
	}
	
	@Test(priority=4)
	public void A4(){
	jp=new javaPrograme();
	jp.Findduplicates();
	}
	
	@Test(priority=5)
	public void A5(){
	jp=new javaPrograme();
	jp.int_char_string_from_array();
	}
	
	@Test(priority=6)
	public void A6(){
	jp=new javaPrograme();
	jp.Prime_number();
	}
	
	@Test(priority=7)
	public void A7(){
	jp=new javaPrograme();
	jp.Removeduplicatearray();
	}
	
	@Test(priority=8)
	public void A8(){
	jp=new javaPrograme();
	jp.Seperatenumcharsym();
	}
	
	@Test(priority=9)
	public void A9(){
	jp=new javaPrograme();
	jp.String_Palindrome();
	}
	
	@Test(priority=10)
	public void A10(){
	jp=new javaPrograme();
	jp.String_Reverse();
	}
	
	@Test(priority=11)
	public void A11(){
	jp=new javaPrograme();
	jp.swap2numwithout3rdvariable();
	}
}

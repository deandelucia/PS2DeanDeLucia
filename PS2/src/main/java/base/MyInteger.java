package base;
import static org.junit.Assert.*;


public class MyInteger {
	private int iValue;
	MyInteger(){
		iValue = 0;
	}
	MyInteger(int Num){
		iValue = Num;
	}
	public int getValue(){
		return iValue;
	}
	public boolean isEven(){
		if (iValue%2==0)
			return true;
		else 
			return false;
	}
	public boolean isOdd(){
		if (iValue%2==1)
			return true;
		else 
			return false;
	}
	public boolean isPrime(){
		for (int i = 2;i<iValue;i++){
			if (iValue%i==0)
				return false;
		}
		return true;
	}
	public static boolean isEven(int Num){
		if (Num%2==0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(int Num){
		if (Num%2==1)
			return true;
		else 
			return false;
	}
	public static boolean isPrime(int Num){
		for (int i = 2;i<Num;i++){
			if (Num%i==0)
				return false;
		}
		return true;
	}
	public static boolean isEven(MyInteger value){
		if (value.getValue()%2==0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(MyInteger value){
		if (value.getValue()%2==1)
			return true;
		else 
			return false;
	}
	public static boolean isPrime(MyInteger value){
		for (int i = 2;i<value.getValue();i++){
			if (value.getValue()%i==0)
				return false;
		}
		return true;
	}
	public boolean equals(int num){
		if (iValue==num)
			return true;
		return false;
	}
	public boolean equals(MyInteger num){
		if (iValue==num.getValue())
			return true;
		return false;
	}
	public void test(){
		MyInteger num1 = new MyInteger(6);
		MyInteger num2 = new MyInteger(7);
		assertEquals(num1.isEven(),true);
		assertEquals(num2.isEven(),false);
		assertEquals(num1.isOdd(),false);
		assertEquals(num2.isOdd(),true);
		assertEquals(num1.isPrime(),false);
		assertEquals(num2.isPrime(),true);
		assertEquals(MyInteger.isEven(6),true);
		assertEquals(MyInteger.isEven(7),false);
		assertEquals(MyInteger.isOdd(6),false);
		assertEquals(MyInteger.isOdd(7),true);
		assertEquals(MyInteger.isPrime(6),false);
		assertEquals(MyInteger.isPrime(7),true);
		assertEquals(MyInteger.isEven(num1),true);
		assertEquals(MyInteger.isEven(num2),false);
		assertEquals(MyInteger.isOdd(num1),false);
		assertEquals(MyInteger.isOdd(num2),true);
		assertEquals(MyInteger.isPrime(num1),false);
		assertEquals(MyInteger.isPrime(num2),true);
		
		assertEquals(num1.equals(6),true);
		assertEquals(num1.equals(7),false);
		assertEquals(num1.equals(num2),false);
	}
	public static void main (String[] args){
		MyInteger num = new MyInteger(4);
		num.test();
		}
}
	
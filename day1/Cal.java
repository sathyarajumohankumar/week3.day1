package week3.day1;

public class Cal
{
public int add(int a, int b)
{ 
	int addval=a+b;
	System.out.println(addval);
	return addval;
	
}
public int add1(int a,int b,int c)
{
int addval1=a+b+c;
System.out.println(addval1);
	return addval1;
}
public int sub(int a,int b)
{
	int subval1=a-b;
	System.out.println(subval1);
	return subval1;
}
public double sub1(double num1,double num2)
{
	double subval2=num1-num2;
	System.out.println(subval2);
	return subval2;
}
public int mul(int a,int b)
{
	int mulval=a*b;
	System.out.println(mulval);
	return mulval;
}
public double mul1(double num1, int b)
{
	double mulval1=num1*b;
	System.out.println(mulval1);
	return mulval1;
}


public static void main(String[] args)
{

	
	Cal ca=new Cal();
	ca.add(20,15);
	ca.add1(20, 15, 5);
	ca.sub(20,15);
	ca.sub1(30.00, 20.00);
	ca.mul(20, 15);
	ca.mul1(30.00,15);
}	
	



}
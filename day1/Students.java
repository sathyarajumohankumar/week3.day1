package week3.day1;

public class Students {
	
	public void getStudentInfo(int id)
	{
		
		System.out.println("id" + " " +id);
	}
public void getStudentInfo(int id,String name)
{
System.out.println("id" + " " +id);	
System.out.println("name" + " " +name);
}
public void getStudentInfo(String email,int phoneNumber)
{
	
	
	
	System.out.println("email" + " " +email);
	System.out.println("phoneNumber" + " " +phoneNumber);
	
}
	// TODO Auto-generated method stub
	public static void main(String[] args)
	{
		Students st=new Students();
		st.getStudentInfo(1);
	st.getStudentInfo(2, "smirthi");
	st.	getStudentInfo("sathya@gmail.com",989436788);
	

	}

}

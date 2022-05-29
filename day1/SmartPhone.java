package week3.day1;

public class SmartPhone extends AndroidPhone{

	
	public void connectWhatsapp()
	{
		System.out.println("whatsapp");
	}
	
public static void main(String[] args)
{
	SmartPhone sp=new SmartPhone();
	sp.sendMsg();
	sp.makeCall();
	sp.saveContact();
	sp.takeVideo();
}


}

import com.botticelli.messagereceiver.MessageReceiver;


public class Main {

	public static void main(String[] args) 
	{
		MessageReceiver mr = new MessageReceiver(new SabatiniBot("98965223:AAHfho-kh3Zfrht1i74BMEXBkMWlvdOZM3M"),250, 5);
		mr.start();
	}
}

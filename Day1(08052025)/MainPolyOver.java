class Notification {
	void send(){
		System.out.println("Sending notification");
	}
}

class EmailNoti extends Notification{
	void send(){
		System.out.println("sending email");
	}
}
class SmsNoti extends Notification{
	void send(){
		System.out.println("Senfing SMS");
	}
}
public class MainPolyOver{
	public static void main(String args[]){
	Notification n1 = new Notification();
	n1.send();
	Notification n2 = new EmailNoti();
	n2.send();
	Notification n3 = new SmsNoti();
	n3.send();
	}
}
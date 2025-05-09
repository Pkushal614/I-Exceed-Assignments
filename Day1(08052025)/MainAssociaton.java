class Hospital{
String name;
Hospital(String name){
this.name = name;
	}
}

class Doctor {
String name;
Hospital hosp;
Doctor (String name, Hospital hosp){
this.name = name;
this.hosp = hosp;
	}
	void display(){
	System.out.println(name+ " works at "+ hosp.name);
	}
}

public class MainAssociaton{
public static void main(String args[]){
Hospital hp = new Hospital("NIMHANS");
Doctor doc = new Doctor("Kushal",hp);
	doc.display();
}
}
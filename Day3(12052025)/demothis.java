class sample{
	String name;
	int age;
	sample (String name,int age){
		this.name = name;
		this.age = age;
		this.display();
	}
	public void display(){
		System.out.println("name "+ name);
		System.out.println("age " +age);
	}
}
public class demothis{
	public static void main(String args[]){
	sample s = new sample("kushal",21);
		sample sap = new sample("kumar",21);
		System.out.println(s);
		System.out.println(sap);
	}
}
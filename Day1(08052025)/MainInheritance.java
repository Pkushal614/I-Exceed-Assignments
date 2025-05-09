class User{
	String name;
	void login(){
		System.out.println(name + " logged in");
	}
}

class Admin extends User{
	void accessDashboard(){
		System.out.println(name+ " accessed Admin dashboard");
	}
}

class Customer extends User{
	void browseprods(){
		System.out.println(name+ " is browsing prods");
	}
}
class MainInheritance{
public static void main(String args[]){
		Admin ad = new Admin();
		ad.name = "Kushal";
		ad.login();
		ad.accessDashboard();
		Customer cu = new Customer();
		cu.name = "kumar";
		cu.browseprods();
	}
}
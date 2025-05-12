import mypack.student;

 
class teacher extends student

{

   String name,city,desig;

   int age;
 
    teacher(String name,int age,String city,String desig)

	{

	   super(name,age,city);

	   this.desig=desig;

	}
 
   public void displayTecher()

	{

	   System.out.println("Designation="+desig);

	}
 
}
 
class demopack 

{

    public static void main(String asd[])

	{

	      teacher obj=new teacher("prabhu",21,"Blore","Engineer");
	      obj.displayStudent();

	      obj.displayTecher();

	}
}
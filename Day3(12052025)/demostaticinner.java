class college
{
    static String c="hello";
 
   static  class departments
    {
        int no_of_dept;
	   college clg = new college();
	   departments(){
	   System.out.println(clg.c);
	   }
    }
     
}
 
 class demostaticinner
 {
    public static void main(String[] args) {
        college.departments dep=new college.departments();
        dep.no_of_dept=10;
		
       
    }
 }
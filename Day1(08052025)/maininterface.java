interface university{

String uni = "I-Exceed";
String loc = "Kormangala";
void ntg();
}
interface Accomudation{
String loc = "Zuduviu";

}
class main implements university, Accomudation{
public void ntg(){
System.out.println("this is ntg method");}
}
class maininterface {
public static void main(String args[]){
main obj = new main();
	System.out.println("location = " + university.loc + Accomudation.loc);
}
}
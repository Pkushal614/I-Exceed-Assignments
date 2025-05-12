interface One{
public void display()
{}
}
interface Two{
public void display1(){}

}
class demo implements one,two{
public void display(){
System.out.prrintln("display");
}
public void display1(){
System.out.println("display1");
}
}
class demointerface1{
public static void main(String args[]){
demo obj = new demo();
obj.display();
obj.display1();
}
}
abstract class KickAny{
    String item;
    KickAny(this.item);
    void kickd();

}
class foot extends KickAny{
    foot(String ball):super(ball);
    void kick(){
        print('$item kicked!!!');
    }
     void kickd(){
        print('This also works!!!');
    }
}
class person extends KickAny{
    person(String name):super(name);
    void kick(){
        print('$item kicked!!!');
    }
    void kickd(){
        print('This also works!!!');
    }
}
void main(){
    person p = new person('Man');
    foot f = new foot('foot ball');
    p.kick();
    f.kick();
    p.kickd();
    f.kickd();

}
class Room {
    Room(String name) {
        System.out.println(name + " Room created");
    }
 
    void useRoom() {
        System.out.println("Using the room");
    }
}
 
class House {
    private Room bedroom;
    private Room kitchen;
 
    
    House() {
        bedroom = new Room("Bedroom");
        kitchen = new Room("Kitchen");
    }
 
    void liveInHouse() {
        System.out.println("Living in the house");
        bedroom.useRoom();
        kitchen.useRoom();
    }
}
 
public class MainComposition {
    public static void main(String[] args) {
        House house = new House(); 
        house.liveInHouse();
    }
}
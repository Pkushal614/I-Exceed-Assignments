class Karnataka {
    String capital;
    String cm;
    int area;

    // Static nested class
    static class Mysuru {
        String nameofcollector = "kushal Kumar";
        int dis_area = 12800;

        public void displayMysuru() {
            System.out.println("Name of the collector: " + nameofcollector);
            System.out.println("District area: " + dis_area);
        }
    }
}

public class demonested2 {
    public static void main(String[] args) {
        // Correct way to create object of static nested class
        Karnataka.Mysuru mobj = new Karnataka.Mysuru();
        
        // Accessing and printing fields
        System.out.println("Collector: " + mobj.nameofcollector);
        System.out.println("Area: " + mobj.dis_area);

        // Call display method
        mobj.displayMysuru();
    }
}

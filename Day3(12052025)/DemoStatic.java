class University {
    static String universityName = "Tech University";

    // Static nested class
    static class Department {
        String deptName;

        void printInfo(String name) {
            deptName = name;
            System.out.println("University: " + University.universityName);
            System.out.println("Department: " + deptName);
        }
    }
}

class DemoStatic {
    public static void main(String[] args) {
        University.Department dept = new University.Department();  // No outer class object needed
        dept.printInfo("Computer Science");
    }
}

class hello {
    int id;
    String name;

    Student() {
        this(101, "Nithin");   // Constructor chaining
    }

    Student(int id, String name) {
        this.id = id;          // this keyword
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}


class Car {
 
    String brand;
    int year;

 
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car();

        myCar.brand = "Toyota";
        myCar.year = 2022;

        myCar.displayDetails();
    }
}


// ------------------------------------------------------------------constructor--------------------
class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 18;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // Calls default constructor
        s1.display();
    }
}





// --------------------------------------------

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.display();
    }
}

--------------------------------------------------
 class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Not Provided";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Bob", 22);

        s1.display();
        s2.display();
    }
}
------------------------------------------
 class Student {
    String name;
    int age;

    Student() {
        this("Default", 18); // Calls another constructor
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // Calls no-arg, which calls parameterized
        Student s2 = new Student("David", 25);

        s1.display();
        s2.display();
    }
}
------------------------------------------------
 class Student {
    int id;
    String name;

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class CopyConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ram");
        Student s2 = new Student(s1); // Using copy constructor

        s1.display();
        s2.display();
    }
}


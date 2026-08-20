//OOPs (Object-Oriented Programming) is a programming approach where we organize a program using objects and classes.


// class is a blueprint of creating an object.

/*
class Student {
    String name;
    int age;
}
*/

// object is an instance of a class.

//eg.

class Student {
    String name;
    int age;
}

class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Naitik";
        s1.age = 20;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}



//1. Encapsulation - Wrapping data and methods together and controlling access.

//2. Inheritance - One class gets properties/methods from another class.

//3 Abstraction - Hiding unnecessary implementation details and showing only important features.

//4 polymorphism - one thing can take many form in programming it allow same  method and object to perform different action.

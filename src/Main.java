// Every class inherits from Object.
//Frex we could override objects here

// this `extends is redundant but we do it for teaching
public class Main extends Object {

    public static void main(String[] args) {
        Student max = new Student("Max", 21);
//        System.out.println(max.toString());
        System.out.println(max);
    }
}


class Student {

    private String name;
    private int age;

    Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
        return name + " is " + age;
    }
}
public class A53_Constructor {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Harsh");
        Student s3 = new Student(123);
//        System.out.println(s1.name);
//        System.out.println(s2.roll);
        Student s4 = new Student(s1);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    // copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name){
        this.name = name;
        System.out.println(name);
    }Student(int roll){
        this.roll = roll;
        System.out.println(roll);
    }

    void setName(String name){
        this.name = name;
    }
}
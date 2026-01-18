public class A54_Inheritance {
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// parent class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
//hierarchial inheritance
//single level inheritance
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("Swims in water");
    }
}
//multilevel inheritance
class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
    String breed;
}


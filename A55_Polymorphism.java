public class A55_Polymorphism {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,5));
        System.out.println(calc.sum((float) 3.5, (float) 5.2));
        System.out.println(calc.sum(3,5,4));

        Kid k = new Kid();
        k.eat();
    }
}
//Method overloading (Compile Time Polymorphism)
class Calculator{
    int sum(int a, int b) {
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}

//Method Overriding (Run time polymorphism)
class Human {
    void eat(){
        System.out.println("eats anything");
    }
}

class Kid extends Human {
    void eat(){
        System.out.println("Drinks milk");
    }
}

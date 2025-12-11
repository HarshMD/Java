public class A06_TypePromotion {
    public static void main(String[] args){
        char a = 'a';
        char b = 'b';
        System.out.println(b);
        System.out.println(a);
        System.out.println(b-a); // Type Promotion automatically

        short x = 5;
        byte y =  25;
        char z = 'c';
        byte bt = (byte) ( x + y + z); // type cast
        System.out.println(bt);
    }
}

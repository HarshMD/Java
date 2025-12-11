public class A07_BitwiseOperators {
    public static void main(String[] args){
        int p = 9, q = 10;
        System.out.println( p|q ); // Bitwise OR
        System.out.println( p&q ); // Bitwise AND
        System.out.println( p^q ); // Bitwise XOR

        System.out.println( p<<1 ); // Left Shift 1 Time
        System.out.println( p<<2 ); // Left Shift 2 Time

        System.out.println( q>>1 ); // Right Shift 1 Time
        System.out.println( q>>2 ); // Right Shift 2 Time
    }
}

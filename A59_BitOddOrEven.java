public class A59_BitOddOrEven {
    public static void oddOrEven(int n){
        int bitMask = 1;

        if((n & bitMask) == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    public static int GetithBit(int n, int i){
        int bitMask = 1<<i;

        if((n & bitMask) == 0)
            return 0;
        else
            return 1;
    }

    public static int SetithBit(int n, int i){
        int bitMask = 1<<i;

        return n | bitMask;
    }

    public static int ClearithBit(int n, int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }

    public static int UpdateithBit(int n, int i, int newBit){
        n = ClearithBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearIBit(int n, int i){
        int bitMask = (~0)<<i;

        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;

        return n & bitMask;
    }

    public static void main(String[] args) {
        oddOrEven(2);
        oddOrEven(7);
        oddOrEven(15);

        System.out.println(GetithBit(10, 2)); //0
        System.out.println(SetithBit(10, 2)); //14
        System.out.println(ClearithBit(10, 1)); //8
        System.out.println(UpdateithBit(10, 2,1)); //14
        System.out.println(clearIBit(15, 2)); //12
        System.out.println(clearBitsInRange(10, 2, 4)); //2
    }
}

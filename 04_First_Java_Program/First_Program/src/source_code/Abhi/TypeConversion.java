package source_code.Abhi;

public class TypeConversion {
    public static void main(String[] args) {
        // Automatic type promotion in expressions
//        int a = 128;
//        byte b = (byte) (a); // as bute as 8 bit then no a byte can store is in range of 0-255
                             // after 255 any no given will be stored as ( number - 256 )

//        System.out.println(b);


        byte b = 10;
        short s = 1000;
        char c = 'a';
        int i = 2388;
        float f = 205.9545838f;
        long l = 245L;
        double d = 72.654684343;
        System.out.println((b*i)+","+(c*d)+","+(f*l)); // integer , double , float
        System.out.println((b*i)+(c*d)+(f*l)); // double

    }
}

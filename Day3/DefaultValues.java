//8.Write a program to display default values of data types.
public class DefaultValues {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();

        System.out.println("Default value of byte    : " + obj.b);
        System.out.println("Default value of short   : " + obj.s);
        System.out.println("Default value of int     : " + obj.i);
        System.out.println("Default value of long    : " + obj.l);
        System.out.println("Default value of float   : " + obj.f);
        System.out.println("Default value of double  : " + obj.d);
        System.out.println("Default value of char    : " + obj.c );
        System.out.println("Default value of boolean : " + obj.bool);
    }
}


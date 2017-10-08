package shamim.date8;

public class Sample4 {

    boolean a;
    char b;
    byte c;
    short d;
    int e;
    long f;
    float g;
    double h = 56.53;
    String i;
    Sample4 j;

    public Sample4() {
    }

    public Sample4(int e, String i) {
        this.e = e;
        this.i = i;
    }

    public static void main(String[] args) {
        Sample4 obj = new Sample4();
        System.out.println("boolean a: " + obj.a + "\n"
                + "char b: " + obj.b + "\n"
                + "byte c: " + obj.c + "\n"
                + "short d: " + obj.d + "\n"
                + "int e: " + obj.e + "\n"
                + "long f: " + obj.f + "\n"
                + "float g: " + obj.g + "\n"
                + "double h: " + obj.h + "\n"
                + "String i: " + obj.i + "\n"
                + "Sample4 j: " + obj.j + "\n");
        
        System.out.println("****************************************");
        Sample4 obj2 = new Sample4(52, "Jakir");
        System.out.println("boolean a: " + obj.a + "\n"
                + "char b: " + obj2.b + "\n"
                + "byte c: " + obj2.c + "\n"
                + "short d: " + obj2.d + "\n"
                + "int e: " + obj2.e + "\n"
                + "long f: " + obj2.f + "\n"
                + "float g: " + obj2.g + "\n"
                + "double h: " + obj2.h + "\n"
                + "String i: " + obj2.i + "\n"
                + "Sample4 j: " + obj2.j + "\n");
    }
}

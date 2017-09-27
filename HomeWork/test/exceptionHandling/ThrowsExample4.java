package exceptionHandling;

import java.io.IOException;

class M3 {

    void method() throws IOException {
        throw new IOException("device error");
    }
}

class ThrowsExample4 {

    public static void main(String[] args) throws IOException {
        M3 m = new M3();
        m.method();

        System.out.println("normal flow....");
    }
}

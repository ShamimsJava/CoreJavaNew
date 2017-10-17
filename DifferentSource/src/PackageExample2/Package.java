package PackageExample2;

import PackageExample1.MyMath;

public class Package {
    public static void main(String[] args) {
        MyMath m1 = new MyMath();
        m1.showSq(5);
        System.out.println(m1.cube(3));
    }
}

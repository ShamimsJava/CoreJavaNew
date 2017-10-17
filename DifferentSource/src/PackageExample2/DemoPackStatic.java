package PackageExample2;

import static PackageExample1.DemoPack.count;



public class DemoPackStatic {
    public static void main(String[] args) {
        De d = new De();
        d.getStaticFromPack();
    }
}

class De{
    void getStaticFromPack(){
        System.out.println(count);
    }
}
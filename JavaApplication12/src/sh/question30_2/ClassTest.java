package sh.question30_2;

import sh.question30.ClassOne;

class ClassTest extends ClassOne{
    public static void main(String[] args) {
        char a = new ClassOne().getVar();
        char b = new ClassTest().getVar();
    }
}

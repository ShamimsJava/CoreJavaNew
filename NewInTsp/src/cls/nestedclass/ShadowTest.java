package cls.nestedclass;

public class ShadowTest {
    public int x = 0;
        class InnerClass{
            public int x = 1;
            void method1(int x){
                System.out.println("x = "+x);
                System.out.println("this.x = "+this.x);
                System.out.println("ShadowTest.this.x = "+ShadowTest.this.x);
            }
        }
        
        public static void main(String[] args) {
            ShadowTest st = new ShadowTest();
            ShadowTest.InnerClass it = st.new InnerClass();
            it.method1(23);
    }
}

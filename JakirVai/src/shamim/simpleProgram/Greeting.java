package shamim.simpleProgram;

public class Greeting {
    int x;
    
    public Greeting(){ // default constructor
        System.out.println("Hello Default constructor....");
    }
    
    public Greeting(int y){ //parameterized constructor
        x = y;
        System.out.println("Hello parameterized constructor....");
    }
    
    public void greet(){
        System.out.println("Hello world!");
    }
    
    public static void greet2(){
        System.out.println("Hello static method......");
    }
}



/*
Access modifier:
1. public
2. private
3. protected
4. default
*/

/*
Non-access modifer:
1. static
2. final
3. transient
4. synchronized
5. volatile
*/


// Single line comment

/*
* Multi-line comment
* Multi-line comment
*/

/**
 * @ Md. Shamim Sarker
 */

/*
keyword
constructor
method
method calling
constructor calling
static
public
void return type
*/
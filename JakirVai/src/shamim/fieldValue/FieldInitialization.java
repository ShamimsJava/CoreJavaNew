package shamim.fieldValue;

public class FieldInitialization {
    int x;
    int y;

    public FieldInitialization() {
    
    }

    public FieldInitialization(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    void method(int y){
        FieldInitialization obj = new FieldInitialization();
        obj.x = 5;
        int x = 0;
        System.out.println(x);
    }
}

// single line comments
/*
multi-line comments
*/

/**
 * documentation comments
 */
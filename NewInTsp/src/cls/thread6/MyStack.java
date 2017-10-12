package cls.thread6;

public class MyStack {
    int idx = 0;
    char[] data = new char[6];
    
    public void push(char c){
        data[idx] = c;
        idx++;
        System.out.println(idx);
    }
    
    public char pop(){
        idx--;
        return data[idx];
    }
    
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push('5');
        System.out.println(obj.pop());
    }
}

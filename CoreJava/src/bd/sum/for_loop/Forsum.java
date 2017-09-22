package bd.sum.for_loop;

public class Forsum {
    private int startNumber;
    private int endNumber;
    private int result = 0;
    
    public int getSumResult(int s, int e){
        for(int i = s; i <= e; i++){
            result += i;
        }
        return result;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(int startNumber) {
        this.startNumber = startNumber;
    }

    public int getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(int endNumber) {
        this.endNumber = endNumber;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
}

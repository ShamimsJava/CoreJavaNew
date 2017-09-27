package exceptionHandling;

public class FinalizeEx {
    @Override
    public void finalize(){
	System.out.println("finalize called...");
}

public static void main(String[] args){
	FinalizeEx f1 = new FinalizeEx();
	FinalizeEx f2 = new FinalizeEx();
	f1 = null;
	f2 = null;
	System.gc();
}
}

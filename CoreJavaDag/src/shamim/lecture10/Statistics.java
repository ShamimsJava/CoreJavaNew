package shamim.lecture10;

public class Statistics {
    public float average(int... nums){
        int sum = 0;
        for(int x : nums){  // for-each or enhance for loop
            sum += x;
        }
        return ((float)sum) / nums.length; // use custing
    }
    
    public static void main(String[] args) {
        Statistics st = new Statistics();
        float av = st.average(9, 20);
        System.out.println("The average is: "+ av);
    }
}

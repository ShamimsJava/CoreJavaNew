/*
 Initializing Array
 */
package shamim.lecture13;

import shamim.lecture11.MyDate;

public class InitializingArray {

    public static void main(String[] args) {
        String[] names = {
            "Harry",
            "Peterson",
            "Mark",
            "Bill",
            "Steve"
        };
        
        for(String x : names){ // Enhanced for loop or for each loop
            System.out.println("The name is: "+x);
        }
        
        System.out.println("-----------------------");
        String[] name;
        name = new String[3]; // Array size immutability
        name[0] = "Harry";
        name[1] = "Mark";
        name[2] = "Bill";
        
        for(String x : name){
            System.out.println("The name is: "+x);
        }
        
        System.out.println("-----------------------");
        MyDate[] dates = {  // Referencing Array
            new MyDate(22,7,1964),
            new MyDate(1,1,2000),
            new MyDate(22,12,1964)
        };
        
        for(MyDate x : dates){
            System.out.println("The name is: "+x);
        }
    }
}

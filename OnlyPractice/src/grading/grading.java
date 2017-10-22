package grading;

import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many subject are there? ");
        int snum = sc.nextInt();
        int[] subject = new int[snum];
        for(int i = 0; i<subject.length; i++){
            System.out.print("subject["+(i+1)+"]: ");
            subject[i]=sc.nextInt();
        }
        System.out.println("========Result Sheet=======");
        for(int i=0; i<subject.length; i++){
            System.out.println("subject["+i+"] : "+subject[i]);  
        }
        
        System.out.println("===========================");
        int total=0;
        for(int i=0; i<subject.length; i++){
           total += subject[i]; 
        }
        System.out.println("Total is: "+total);
        System.out.println("===========================");
        double avg = total/subject.length;
        System.out.println("Average number is: "+avg);
        System.out.println("===========================");
        
        if(avg>0 && avg<33){
            System.out.println("Your are failed.");
        }else if(avg>=80){
            System.out.println("Your grade is A+.");
        }else if(avg>=70){
            System.out.println("Your grade is A.");
        }else if(avg>=60){
            System.out.println("Your grade is A-.");
        }else if(avg>=50){
            System.out.println("Your grade is B.");
        }else if(avg>=40){
            System.out.println("Your grade is C.");
        }else if(avg>=33){
            System.out.println("Your grade is D.");
        }else{
            System.out.println("Ambiguity is created.");
        }
    }
}

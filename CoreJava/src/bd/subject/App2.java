package bd.subject;

public class App2 {
    public static void main(String[] args) {
         Subject subject = new Subject();
         subject.setSubjectName("Math");
         subject.setMark(90);
         subject.setStatusPass("Passed");
         subject.setStatusFail("Failed");
         if(subject.getMark()>=70){
             System.out.println(subject.getStatusPass());
         }else{
             System.out.println(subject.getStatusFail());
         }
             
    }
   
    
}

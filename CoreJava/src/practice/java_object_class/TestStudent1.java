/*
There are 3 ways to initialize object in java.
    By reference variable
    By method
    By constructor
*/

class Student{
	int id;
	String name;
}
class TestStudent1{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.id = 101;
		s1.name = "Shamim";
		System.out.println(s1.id + " " + s1.name);
	}
}
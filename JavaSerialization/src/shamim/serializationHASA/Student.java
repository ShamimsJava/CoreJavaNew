package shamim.serializationHASA;

import java.io.*;

public class Student implements Serializable {

    int id;
    String name;
    Address address; //HAS-A  

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

/*
Since Address is not Serializable, you can not serialize the instance of Student class.
All the objects within an object must be Serializable.
*/
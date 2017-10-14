package shamim.serializationISA;

import java.io.*;

public class Person implements Serializable {

    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;

    }
}

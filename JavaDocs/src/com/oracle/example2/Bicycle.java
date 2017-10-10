package com.oracle.example2;

public interface Bicycle {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}


// https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
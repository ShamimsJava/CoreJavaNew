package cls.interface2;

public interface Bicycle {

    // wheel revolution per minutes
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}

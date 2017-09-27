package cls.interfaceex;

public abstract class Cat implements Animal {

    @Override
    public void eat() {

    }
    
    public abstract void jump();
}

// we can create abstract or non-abstract method inside abstract class
// For 100% abstraction use interface
// For 0% to 100% abstraction use abstraction class
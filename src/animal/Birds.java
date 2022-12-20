package animal;

public abstract class Birds extends Animals {
    public Birds(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }
    abstract public void hunting();
    }
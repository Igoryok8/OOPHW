package animal;

public class Predators extends Mammals {

    public Predators(String name, int age, String livingEnvironment, int movementSpeed, String food) {
        super(name, age, livingEnvironment, movementSpeed, food);
    }

    @Override
    public void isGrazing() {

    }

    public void hunting() {
        System.out.println("Охотится на животных");
    }

    @Override
    public void walk() {

    }

    @Override
    void eat() {
        System.out.println("Питается животными");
    }

    @Override
    void sleep() {
        System.out.println("Спит на земле");
    }

    @Override
    void go() {
        System.out.println("Перемещается по суше");
    }
}

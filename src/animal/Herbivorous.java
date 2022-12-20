package animal;

public class Herbivorous extends Mammals{
    public Herbivorous(String name, int age, String livingEnvironment, int movementSpeed, String food) {
        super(name, age, livingEnvironment, movementSpeed, food);
    }

    @Override
    public void walk() {

        System.out.println("Гуляет");
    }

    public void isGrazing() {
        System.out.println("Пасётся");

    }

    @Override
    public void eat() {
        System.out.println("Кушает: "+getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Спит на земле");
    }

    @Override
    public void go() {
        System.out.println("Передвигается по земле");

}

}

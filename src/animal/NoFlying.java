package animal;

public class NoFlying extends Birds {

    private final String typeOfMovement;

    public NoFlying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()) {
            this.typeOfMovement = "нелетающая";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public void hunting() {
        System.out.println("Охотится на насекомых");
    }
    public void walk() {
        System.out.println("Ходит пешком");
    }

    @Override
    void eat() {
        System.out.println("Питается насекомыми");
    }

    @Override
    void sleep() {
        System.out.println("Спит в гнезде");
    }

    @Override
    void go() {
        System.out.println("Передвигается по земле");
    }

    @Override
    public String toString() {
        return super.toString()+ "; тип перемещения: " + getTypeOfMovement();
    }
}

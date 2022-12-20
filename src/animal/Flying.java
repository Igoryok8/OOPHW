package animal;

public class Flying extends Birds {

    private final String typeOfMovement;



    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);

        if (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()) {
            this.typeOfMovement = "летающая";
        } else {
            this.typeOfMovement = typeOfMovement;
        }

    }
    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    void eat() {
        System.out.println("Питается мелкими животными");
    }

    @Override
    void sleep() {
        System.out.println("Спит в гнезде");
    }

    @Override
    void go() {
        System.out.println("Летает");
    }

    @Override
    public void hunting() {
        System.out.println("Охотится на мелких животных");
    }
    public void toFly() {
        System.out.println("Летающая птица");
    }

    @Override
    public String toString() {
        return super.toString()+ "; тип перемещения: " + getTypeOfMovement();
    }
}

package animal;

public abstract class Mammals extends Animals {
    private final int movementSpeed;
    private String food;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed, String food) {
        super(name, age, livingEnvironment);
        if (food == null || food.isEmpty() || food.isBlank()) {
            this.food = "молоко";
        } else {
            this.food = food;
        }
        if (movementSpeed <= 0) {
            this.movementSpeed = 20;
        } else {
            this.movementSpeed = movementSpeed;
        }
    }
    public int getMovementSpeed() {
        return movementSpeed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if (food == null || food.isEmpty() || food.isBlank()) {
            this.food = "молоко";
        } else {
            this.food = food;
        }
    }

    public abstract void isGrazing();

    public abstract void walk();

    @Override
    public String toString() {
        return super.toString() + "; скорость перемещения: " + movementSpeed + "; пища: " + food;
    }
}


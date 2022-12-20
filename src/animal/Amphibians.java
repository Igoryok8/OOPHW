package animal;

public final class Amphibians extends Animals {

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
   public void eat() {
        System.out.println("Питается насекомыми");
    }

    @Override
   public void sleep() {
        System.out.println("Спит в воде");
    }

    @Override
   public void go() {
        System.out.println("Перемещается по воде и по суше");
    }
    public void hunting() {
        System.out.println("Охотится на насекомых");
    }

}

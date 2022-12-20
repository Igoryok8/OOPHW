package animal;

import java.util.Objects;

public abstract class Animals {

    private String name;
    private int age;
    private String livingEnvironment;


    protected Animals(String name, int age, String livingEnvironment) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "any name";
        } else {
            this.name = name;
        }
        if (age <= 0) {
            this.age = 3;
        } else {
            this.age = age;
        }
        this.livingEnvironment = livingEnvironment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    abstract void eat();
    abstract void sleep();
    abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, livingEnvironment);
    }

    @Override
    public String toString() {
        return "Название животного: " + name + "; возраст: " + age + "; среда обитания: " + livingEnvironment;
    }
}

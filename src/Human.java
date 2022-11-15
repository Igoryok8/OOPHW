public class Human {
    String name;
    String town;
    int yearOfBirth;

    @Override
    public String toString() {
        return "Привет! Меня зовут " +name+ ". Я из города "+town+ ". Я родился в " +yearOfBirth+ " году. Будем знакомы!";
}

}

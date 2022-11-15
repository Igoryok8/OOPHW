public class Human {
    String name;
    String town;
    int yearOfBirth;
    String jobTitle;


    @Override
    public String toString() {
        return "Привет! Меня зовут " +name+ ". Я из города "+town+ ". Я родился в " +yearOfBirth+ " году. Я работаю на должности " +jobTitle+ ". Будем знакомы!";
}

}

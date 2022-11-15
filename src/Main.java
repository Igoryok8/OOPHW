public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();
        //Максим работает бренд-менеджером.
          //      Аня работает методистом образовательных программ.
        //Катя работает продакт-менеджером.
          //      Артем работает директором по развитию бизнеса.
        Human maxim = new Human();
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.yearOfBirth = 1988;
        maxim.jobTitle = "Бренд-менеджер";

        Human anya = new Human();
        anya.name = "Аня";
        anya.town = "Москва";
        anya.yearOfBirth = 1993;
        anya.jobTitle = "Методист образовательных программ";

        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 1992;
        katya.jobTitle = "Продакт-менеджер";

        Human artyom = new Human();
        artyom.name = "Артём";
        artyom.town = "Москва";
        artyom.yearOfBirth = 1995;
        artyom.jobTitle = "Директор по развитию бизнеса";

        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artyom);
    }
}
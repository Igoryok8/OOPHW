public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();

        Human maxim = new Human("Максим", null, 1988, "Бренд-менеджер");
        Human anya = new Human("Аня", "Москва", -1993, "Методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1992, null);
        Human artyom = new Human(null, "Москва", 1995, "Директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2001, " ");

        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artyom);
        System.out.println(vladimir);
        System.out.println();

        System.out.println("Задание 2");
        System.out.println();

        Car lada = new Car(null, "Granta", 1.7, "жёлтый", 2015, "в России");
        System.out.println(lada);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", -3.0, "чёрный", 2020, "в Германии");
        System.out.println(audi);

        Car bmw = new Car("BMW", " ", 3.0, "чёрный", 2021, "в Германии");
        System.out.println(bmw);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, " ", -2018, null);
        System.out.println(kia);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, null, 2016, "в Южной Корее");
        System.out.println(hyundai);
        System.out.println();

        System.out.println("Задание 3");
        System.out.println();

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59,0 );
        Flower chrysanthemum = new Flower("Хризантема", " ", 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(gypsophila);
        System.out.println();
    }
}
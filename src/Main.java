import animal.*;
import transport.Bus;
import transport.Car;
import transport.Train;

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
        lada.setTransmission("АКПП");
        System.out.println(lada);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", -3.0, "чёрный", 2020, "в Германии");
        audi.setSummerTires(false);
        System.out.println(audi);

        Car bmw = new Car("BMW", " ", 3.0, "чёрный", 2021, "в Германии");
        bmw.setRegistrationNumber("а888мр199");
        System.out.println(bmw.isCorrectRegistrationNumber());
        System.out.println(bmw);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, " ", -2018, null);
        System.out.println(kia);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, null, 2016, "в Южной Корее");
        System.out.println(hyundai);
        System.out.println();

        Train lastochka = new Train("Ласточка", "B-901",2011,"Россия","",301,3500,20,"Белорусский вокзал","Минск-Пассажирский",11);
        Train leningrad = new Train("Ленинград", "D-125",2019,"Россия","",270,1700,22,"Ленинградский вокзал","Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println();

        Bus neoplan = new Bus("Neoplan", "Tourliner", 2016, "Германия", "синий", 200);
        Bus man = new Bus("MAN", "Lion's Coach", 2021, "Германия", "чёрный", 220);
        Bus liaz = new Bus("ЛиАЗ", "5292", 2022, "Россия", "белый", 160);
        System.out.println(neoplan);
        System.out.println(man);
        System.out.println(liaz);



        System.out.println("Задание 3");
        System.out.println();

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59);
        Flower chrysanthemum = new Flower("Хризантема", " ", 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(gypsophila);
        System.out.println();
        System.out.println("Дополнительное задание");
        System.out.println();
        printCostOfBouquet(
                rose,rose,rose,
                chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                gypsophila
        );

        System.out.println();
        System.out.println("ДЗ 3");
        System.out.println();
        Herbivorous gazelle = new Herbivorous("Газель", 3, "степь", 50, "трава");
        Herbivorous giraffe = new Herbivorous("Жираф", 5, "саванна", 55, "листья");
        Herbivorous horse = new Herbivorous("Лошадь", 2, "степь", 48, "овёс");
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        gazelle.eat();
        giraffe.go();
        horse.sleep();
        horse.isGrazing();
        horse.walk();
        System.out.println();

        Predators hyena = new Predators("Гиена", 3, "саванна", 70, "животные");
        Predators tiger = new Predators("Тигр", 4, "тропические леса", 60, "животные");
        Predators bear = new Predators("Медведь", 6, "леса", 50, "ягоды и животные");
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        bear.hunting();
        tiger.hunting();
        hyena.hunting();
        System.out.println();

        Amphibians frog = new Amphibians("Лягушка", 6, "водоём");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 6, "водоём");
        System.out.println(frog);
        System.out.println(alreadyFreshwater);
        frog.hunting();
        System.out.println();

        Flying seagull = new Flying("Чайка", 10, "водоёмы", null);
        Flying albatross = new Flying("Альбатрос", 15, "водоёмы", null);
        Flying falcon = new Flying("Сокол", 20, "горы", "Летающая");
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
        seagull.hunting();
        albatross.hunting();
        falcon.hunting();
        System.out.println();

        NoFlying peacock = new NoFlying("Павлин", 5, "джунгли", null);
        NoFlying penguin = new NoFlying("Пингвин", 15, "Антарктида", null);
        NoFlying dodoBird = new NoFlying("Птица Додо", 10, "Маврикия", "нелетающая");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        peacock.walk();
        penguin.walk();
        dodoBird.walk();
        System.out.println();





    }

    private static void printCostOfBouquet(Flower... flowers) {
        double totalCost = 0;
        int lifeSpanMin=Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < lifeSpanMin) {
                lifeSpanMin = flower.lifeSpan;
            }
            totalCost+= flower.getCost();
            System.out.println(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + lifeSpanMin);

    }

}
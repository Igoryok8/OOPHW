public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 и 2");
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
        System.out.println();

        System.out.println("Задание 3");
        System.out.println();

        Car lada = new Car();
        lada.brand = "LADA";
        lada.model = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "жёлтый";
        lada.productionYear = 2015;
        lada.productionCountry = "в России";
        System.out.println(lada);

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "чёрный";
        audi.productionYear = 2020;
        audi.productionCountry = "в Германии";
        System.out.println(audi);

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "чёрный";
        bmw.productionYear = 2021;
        bmw.productionCountry = "в Германии";
        System.out.println(bmw);

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.productionYear = 2018;
        kia.productionCountry = "в Южной Корее";
        System.out.println(kia);

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "в Южной Корее";
        System.out.println(hyundai);
    }

}
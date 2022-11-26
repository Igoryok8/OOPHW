package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    public Bus(String brand, String model, int productionYear, String productionCountry, String color) {
        super(brand, model, productionYear, productionCountry, color);
    }

    public Bus() {
    }
}

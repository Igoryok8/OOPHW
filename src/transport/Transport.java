package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private int maxSpeed;
    private String typeFuel;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String typeFuel) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 200;
        } else {
            this.maxSpeed = maxSpeed;
        }
        if (typeFuel == null || typeFuel.isEmpty() || typeFuel.isBlank()) {
            this.typeFuel = "дизель";
        } else {
            this.typeFuel = typeFuel;
        }
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
        this(brand, model, productionYear, productionCountry, color,200,"");
    }

    public abstract void refill();

    public Transport() {
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        if (typeFuel == null || typeFuel.isEmpty() || typeFuel.isBlank()) {
            this.typeFuel = "дизель";
        } else {
            this.typeFuel = typeFuel;
        }
    }

    @Override
    public String toString() {
        return "Бренд: " + getBrand() + "; модель: " + getModel() + "; год выпуска: " + getProductionYear() + "; страна производитель: "
                + getProductionCountry() + "; максимальная скорость: " + getMaxSpeed() + " км/ч; тип топлива: " +getTypeFuel();
    }

}

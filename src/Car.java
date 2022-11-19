public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    Car(String brand,String model,double engineVolume,String color,int productionYear,String productionCountry) {
        if (brand==null|| brand.isEmpty()||brand.isBlank()) {
            this.brand = "default";
        }else {
            this.brand = brand;
        }
        if (model==null|| model.isEmpty()||model.isBlank()) {
            this.model = "default";
        }else {
            this.model = model;
        }
        if (productionCountry==null|| productionCountry.isEmpty()||productionCountry.isBlank()) {
            this.productionCountry = "default";
        }else {
            this.productionCountry = productionCountry;
        }
        if (engineVolume<=0) {
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }
        if (color==null|| color.isEmpty()||color.isBlank()) {
            this.color = "белый";
        }else {
            this.color = color;
        }
        if (productionYear<=0) {
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }
    }

    @Override
    public String toString() {
        return brand + " " +model+ ", "+productionYear+ " год выпуска, сборка "+productionCountry+ ", " + color + " цвет кузова, объем двигателя — " +engineVolume+ " л.";
    }
}

package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, boolean summerTires) {
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
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
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
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }

        this.numberOfSeats = numberOfSeats;
        this.summerTires = summerTires;
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this(brand, model, engineVolume, color, productionYear, productionCountry, "МКПП", "Седан", "х000хх000", 5, true);
    }
        public String getBrand() {
            return brand;
        }

        public String getModel () {
            return model;
        }

        public int getProductionYear () {
            return productionYear;
        }

        public String getProductionCountry () {
            return productionCountry;
        }

        public String getBodyType () {
            return bodyType;
        }

        public int getNumberOfSeats () {
            return numberOfSeats;
        }


        public double getEngineVolume () {
            return engineVolume;
        }

        public void setEngineVolume ( double engineVolume){
            if (engineVolume <= 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
        }

        public String getColor () {
            return color;
        }

        public void setColor (String color){
            if (color == null || color.isEmpty() || color.isBlank()) {
                this.color = "белый";
            } else {
                this.color = color;
            }
        }

        public String getTransmission () {
            return transmission;
        }

        public void setTransmission (String transmission){
            if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
                this.transmission = "МКПП";
            } else {

                this.transmission = transmission;
            }
        }

        public String getRegistrationNumber () {
            return registrationNumber;
        }

        public void setRegistrationNumber (String registrationNumber){
            if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
                this.registrationNumber = "х000хх000";
            } else {
                this.registrationNumber = registrationNumber;
            }
        }

        public boolean isSummerTires () {
            return summerTires;
        }

        public void setSummerTires ( boolean summerTires){
            this.summerTires = summerTires;
        }

        public void changeTires () {
            summerTires = !summerTires;
        }

        public boolean isCorrectRegistrationNumber () {
            if (registrationNumber.length() != 9) {
                return false;
            }
            char[] chars = registrationNumber.toCharArray();
            if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
                return false;
            }
            if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                    !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
                return false;
            }
            return true;
        }

        @Override
        public String toString () {
            return getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска, сборка "
                    + getProductionCountry() + ", " + getColor() + " цвет кузова, объем двигателя — " + getEngineVolume() +
                    " л, коробка передач: "+getTransmission()+", тип кузова: " +getBodyType()+ ", регистрационный номер: "
                    +getRegistrationNumber()+ ", количество мест: " +getNumberOfSeats ()+ ", " +(isSummerTires()? "летняя":"зимняя")+" резина";
        }
    }


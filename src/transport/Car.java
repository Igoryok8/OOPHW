package transport;

import java.security.Key;
import java.time.LocalDate;

public class Car extends Transport {

    private double engineVolume;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, boolean summerTires, Key key, Insurance insurance) {
        super(brand,model,productionYear,productionCountry,color);

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
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
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.numberOfSeats = numberOfSeats;
        this.summerTires = summerTires;
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this(brand, model, engineVolume, color, productionYear, productionCountry, "МКПП", "Седан", "х000хх000", 5, true, new Key(),new Insurance());
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

       public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "МКПП";
        } else {

            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public void changeTires() {
        summerTires = !summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isCorrectRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска, сборка "
                + getProductionCountry() + ", " + getColor() + " цвет кузова, объем двигателя — " + getEngineVolume() +
                " л, коробка передач: " + getTransmission() + ", тип кузова: " + getBodyType() + ", регистрационный номер: "
                + getRegistrationNumber() + ", количество мест: " + getNumberOfSeats() + ", " + (isSummerTires() ? "летняя" : "зимняя") + " резина, "
                +(getKey().isKeylessAccess() ? "Безключевой доступ" : "Доступ с ключом")+", "
                +(getKey().isRemoteEngineStart() ? "Удалённый запуск" : "Обычный запуск")+", номер страховки: " +getInsurance().getNumber()+
                ", стоимость страховки: "+getInsurance().getCost()+", срок действия страховки: " +getInsurance().getValidityPeriod();
    }

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {

        private final LocalDate validityPeriod;
        private final double cost;
        private final String number;

        public Insurance(LocalDate validityPeriod, double cost, String number) {
            if (validityPeriod == null) {
                this.validityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriod = validityPeriod;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }
        public Insurance() {
            this(null,15000,null);
        }


        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkValidityPeriod() {
            if (validityPeriod.isBefore(LocalDate.now()) || validityPeriod.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
}


public class Flower {

    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {

        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    @Override
    public String toString() {
        return getFlowerColor() + ", страна происхождения - " + getCountry() + ", стоимость штуки - " + getCost() + " рублей, срок состояния - " + lifeSpan + " дней.";
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    public String getCountry() {
        return country;
    }

    public void setCountry (String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
            } else {
            this.country = country;
            }
    }
    public double getCost () {
        return cost;
    }

    public void setCost ( double cost){
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }
}

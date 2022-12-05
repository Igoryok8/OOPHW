package transport;

public class Train extends Transport {

    private double ticketPrice;
    private int departureTime;
    private String startStation;
    private String finishStation;
    private int sumWagons;


    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
    double ticketPrice, int departureTime, String startStation, String finishStation, int sumWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    public Train(String brand, String model, int productionYear, String productionCountry, String color,
                 double ticketPrice, int departureTime, String startStation, String finishStation, int sumWagons) {
        super(brand, model, productionYear, productionCountry, color);

        if (ticketPrice <= 0) {
            this.ticketPrice = 2000;
        } else {
            this.ticketPrice = ticketPrice;
        }

        if (startStation == null || startStation.isEmpty() || startStation.isBlank()) {
            this.startStation = "default";
        } else {
            this.startStation = startStation;
        }
        if (finishStation == null || finishStation.isEmpty() || finishStation.isBlank()) {
            this.finishStation = "default";
        } else {
            this.finishStation = finishStation;
        }
        if (sumWagons <= 0) {
            this.sumWagons = 10;
        } else {
            this.sumWagons = sumWagons;
        }
        if (departureTime <= 0) {
            this.departureTime = 20;
        } else {
            this.departureTime = departureTime;
        }
    }

        public double getTicketPrice () {
            return ticketPrice;
        }

        public void setTicketPrice ( double ticketPrice){
            if (ticketPrice <= 0) {
                this.ticketPrice = 2000;
            } else {
                this.ticketPrice = ticketPrice;
            }

        }

        public int getDepartureTime () {
            return departureTime;
        }

        public void setDepartureTime ( int departureTime) {
            if (departureTime <= 0) {
                this.departureTime = 20;
            } else {
                this.departureTime = departureTime;
            }
        }

        public String getStartStation () {
            return startStation;
        }

        public void setStartStation (String startStation){
            if (startStation == null || startStation.isEmpty() || startStation.isBlank()) {
                this.startStation = "default";
            } else {
                this.startStation = startStation;
            }
        }

        public String getFinishStation () {
            return finishStation;
        }

        public void setFinishStation (String finishStation){
            if (finishStation == null || finishStation.isEmpty() || finishStation.isBlank()) {
                this.finishStation = "default";
            } else {
                this.finishStation = finishStation;
            }
        }

        public int getSumWagons () {
            return sumWagons;
        }

        public void setSumWagons ( int sumWagons){
            if (sumWagons <= 0) {
                this.sumWagons = 10;
            } else {
                this.sumWagons = sumWagons;
            }
        }

        @Override
        public String toString () {
            return super.toString() + "Станция отправления: " + getStartStation() + "; Станция назначения: " + getFinishStation() +
                    "; Цена поездки: " + getTicketPrice() + "; количество вагонов: " + getSumWagons();
        }
}

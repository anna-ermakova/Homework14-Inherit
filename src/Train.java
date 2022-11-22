public class Train extends Transport {
    double travelPrice;
    double travelTime;
    String startStation;
    String finishStation;
    int numberOfWagons;

    public Train(String brand, String model, int yearOfRelease, String country, String colorBody, double maxSpeed,
                 double travelPrice, double travelTime, String startStation, String finishStation, int numberOfWagons) {
        super(brand, model, yearOfRelease, country, colorBody, maxSpeed);
        validateDoubleParameters(this.travelPrice=travelPrice);
        validateDoubleParameters(this.travelTime = travelTime);
        validateStringParameters(this.startStation = startStation);
        validateStringParameters(this.finishStation = finishStation);
        validateIntParameters(this.numberOfWagons = numberOfWagons);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfRelease=" + getYearOfRelease() +
                ", country='" + getCountry() + '\'' +
                ", colorBody='" + getColorBody() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                "travelPrice=" + getTravelPrice() +
                ", travelTime=" + getTravelTime() +
                ", startStation='" + getStartStation() + '\'' +
                ", finishStation='" + getFinishStation() + '\'' +
                ", numberOfWagons=" + getNumberOfWagons() +
                '}';
    }

    public double getTravelPrice() {
        return travelPrice;
    }
    public void setTravelPrice(double travelPrice) {
        this.travelPrice = travelPrice;
    }
    public double getTravelTime() {
        return travelTime;
    }
    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }
    public String getStartStation() {
        return startStation;
    }
    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }
    public String getFinishStation() {
        return finishStation;
    }
    public void setFinishStation(String finishStation) {
        this.finishStation = finishStation;
    }
    public int getNumberOfWagons() {
        return numberOfWagons;
    }
    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
}

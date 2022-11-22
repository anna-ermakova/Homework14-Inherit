import java.util.regex.Pattern;

public class Car extends Transport {


    private double engineVolume;
    private String transmission;
    private String typeOfBody;
    private String registrationNumber;
    private int numberOfSeats;
    private String carWheelSeason;


    public Car(String brand, String model, int yearOfRelease, String country, String colorBody, double maxSpeed,
               double engineVolume, String transmission, String typeOfBody, String registrationNumber, int numberOfSeats, String carWheelSeason) {
        super(brand, model, yearOfRelease, country, colorBody, maxSpeed);
        validateDoubleParameters(this.engineVolume = engineVolume);
        validateStringParameters(this.transmission = transmission);
        validateStringParameters(this.typeOfBody = typeOfBody);
        validateStringParameters(this.registrationNumber = registrationNumber);
        validateIntParameters(this.numberOfSeats = numberOfSeats);
        validateStringParameters(this.carWheelSeason = carWheelSeason);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfRelease=" + getYearOfRelease()+
                ", country='" + getCountry() + '\'' +
                ", colorBody='" + getColorBody() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                "engineVolume=" + getEngineVolume() +
                ", transmission='" + getTransmission() + '\'' +
                ", typeOfBody='" + getTypeOfBody() + '\'' +
                ", registrationNumber='" + getRegistrationNumber() + '\'' +
                ", numberOfSeats=" + getNumberOfSeats()+
                ", carWheelSeason='" + getCarWheelSeason() + '\'' +
                '}';
    }

    public String checkRegistrationNumber() {
        if (Pattern.matches("[а-я] []0-9] {3} [а-я] {2} [0-9] {3}", registrationNumber)) {
            return registrationNumber;
        } else {
            System.out.println("Номер некорректный");
        } return "неверный номер";
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getTypeOfBody() {
        return typeOfBody;
    }
    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public String getCarWheelSeason() {
        return carWheelSeason;
    }
    public void setCarWheelSeason(String carWheelSeason) {
        this.carWheelSeason = carWheelSeason;
    }
}

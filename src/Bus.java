public class Bus extends Transport {
    public Bus(String brand, String model, int yearOfRelease, String country, String colorBody, double maxSpeed, String typeOfFuel) {
        super(brand, model, yearOfRelease, country, colorBody, maxSpeed, typeOfFuel);
    }

    @Override
    public void refill() {
        System.out.println("заправлять бензином или дизелем на заправке");
    }
}

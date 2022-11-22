public class Transport {

    private String brand;
    private String model;
    private int yearOfRelease;
    private String country;
    private String colorBody ;
    private double maxSpeed;


    public String validateStringParameters(String value) {
        return value==null ||!value.isBlank() || value.isEmpty()? "default": value;
    }
    public int validateIntParameters(int value) {
        return value == 0 ? 0 : Math.abs(value);
    }
    public double validateDoubleParameters(double value){
        return value == 0 ? 0 : Math.abs(value);
    }

    public Transport(String brand, String model, int yearOfRelease, String country, String colorBody, double maxSpeed) {
        validateStringParameters(this.brand = brand);
        validateStringParameters(this.model = model);
        validateIntParameters(this.yearOfRelease = yearOfRelease);
        validateStringParameters(this.country = country);
        validateStringParameters(this.colorBody = colorBody);
        validateDoubleParameters(this.maxSpeed = maxSpeed);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", country='" + country + '\'' +
                ", colorBody='" + colorBody + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public void setColorBody(String colorBody) {
        if (colorBody!=null && !colorBody.isEmpty() && !colorBody.isBlank()) {this.colorBody = colorBody;
        }
    }
    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed>0) { this.maxSpeed = maxSpeed;
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    public String getCountry() {
        return country;
    }
    public String getColorBody() {
        return colorBody;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
}

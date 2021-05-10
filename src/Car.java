public class Car extends Vehicle {
    private int numberOfSeats;
    private String engineType;

    public Car(int numberOfSeats, String engineType) {
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }

    public Car(int id, String carName, String manufacturer, String yearOfManufacturer, double price, String vehicleColor, int numberOfSeats, String engineType) {
        super(id, carName, manufacturer, yearOfManufacturer, price, vehicleColor);
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return  "Car       {" +super.toString()+
                "numberOfSeats=" + numberOfSeats +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}

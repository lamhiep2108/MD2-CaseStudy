public class Motorcycle extends Vehicle {
    private String capacity;

    public Motorcycle() {}

    public Motorcycle(int id, String carName, String manufacturer, String yearOfManufacturer, double price, String vehicleColor, String capacity) {
        super(id, carName, manufacturer, yearOfManufacturer, price, vehicleColor);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +super.toString()+
                "capacity='" + capacity  +
                '}';
    }
}

public class Truck extends Vehicle{
    private double payload;

    public Truck() { }
    public Truck(int id, String carName, String manufacturer, String yearOfManufacturer, double price, String vehicleColor, double payload) {
        super(id, carName, manufacturer, yearOfManufacturer, price, vehicleColor);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return"Truck     {"+ super.toString()+
                "payload=" + payload +
                '}';
    }
}

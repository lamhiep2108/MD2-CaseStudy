import java.io.Serializable;

public class Vehicle implements Serializable {
    private int id;
    private String carName;
    private String manufacturer;
    private String yearOfManufacturer;
    private double price;
    private String vehicleColor;

    public Vehicle() {
    }

    public Vehicle(int id, String carName, String manufacturer, String yearOfManufacturer, double price, String vehicleColor) {
        this.id = id;
        this.carName = carName;
        this.manufacturer = manufacturer;
        this.yearOfManufacturer = yearOfManufacturer;
        this.price = price;
        this.vehicleColor = vehicleColor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(String yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setCarColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", carName='" + carName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacturer='" + yearOfManufacturer + '\'' +
                ", price=" + price +
                ", vehicleColor='" + vehicleColor + '\'' ;

    }
}

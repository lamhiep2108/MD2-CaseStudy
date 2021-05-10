import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VehicleManagement {
    List<Vehicle> vehicles = new ArrayList<>();

    public void add(Vehicle vehicle) {
        while (true) {
            boolean isFind = false;
            for (Vehicle vehicle1 : vehicles) {
                if (vehicle.getId() == vehicle1.getId()) {
                    isFind = true;
                }
            }
            if (isFind) {
                System.err.println(" id đã tồn tại!");
            } else {
                vehicles.add(vehicle);
            }
            break;
        }
    }

    public void update(int id, Vehicle vehicle) {
        for (Vehicle vehicle1 : vehicles) {
            if (id == vehicle1.getId()) {
                if (vehicle1 instanceof Motorcycle && vehicle instanceof Motorcycle) {
                    vehicle1.setManufacturer(vehicle.getManufacturer());
                    vehicle1.setYearOfManufacturer(vehicle.getYearOfManufacturer());
                    vehicle1.setPrice(vehicle.getPrice());
                    vehicle1.setVehicleColor(vehicle.getVehicleColor());
                    ((Motorcycle) vehicle1).setCapacity(((Motorcycle) vehicle).getCapacity());
                } else if (vehicle1 instanceof Truck && vehicle instanceof Truck) {
                    vehicle1.setManufacturer(vehicle.getManufacturer());
                    vehicle1.setYearOfManufacturer(vehicle.getYearOfManufacturer());
                    vehicle1.setPrice(vehicle.getPrice());
                    vehicle1.setVehicleColor(vehicle.getVehicleColor());
                    ((Truck) vehicle1).setPayload(((Truck) vehicle).getPayload());
                } else if (vehicle1 instanceof Car && vehicle instanceof Car) {
                    vehicle1.setId(vehicle.getId());
                    vehicle1.setManufacturer(vehicle.getManufacturer());
                    vehicle1.setYearOfManufacturer(vehicle.getYearOfManufacturer());
                    vehicle1.setPrice(vehicle.getPrice());
                    vehicle1.setVehicleColor(vehicle.getVehicleColor());
                    ((Car) vehicle1).setNumberOfSeats(((Car) vehicle).getNumberOfSeats());
                    ((Car) vehicle1).setEngineType(((Car) vehicle).getEngineType());
                }
            }
        }
    }

    public void delete(int id) {
        vehicles.removeIf(vehicle -> id == vehicle.getId());
    }

    public void showAll() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }


    public int searchToManufacturer(int i, int size, String manufacturer) {
        int index = -1;
        for (i = 0; i < vehicles.size(); i++) {
            String manufacturers = vehicles.get(i).getManufacturer();
            if (manufacturers.equals(manufacturer)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void sortById(List<Vehicle> vehicles) {
        for (int i = 0; i < vehicles.size() - 1; i++) {
            for (int j = vehicles.size() - 1; j > i; j--) {
                if (vehicles.get(j).getId() < vehicles.get(j - 1).getId()) {
                    Vehicle temp = vehicles.get(j);
                    vehicles.set(j, vehicles.get(j - 1));
                    vehicles.set((j - 1), temp);
                }
            }
        }
    }


    public List<Vehicle> readDateFromFile(String path) {
        List<Vehicle> vehicles = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            vehicles = (List<Vehicle>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    public void writeToFile(String path) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(vehicles);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void  logIn(){
        while (true){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tài khoản: ");
        String account=scanner.nextLine();
        if (account.equals("ADMIN")){
            System.out.println("Mật khẩu: ");
            String password=scanner.nextLine();
            if (password.equals("ADMIN")){
                System.out.println("đăng nhập thành công!");
                break;
            }else {
                System.out.println("sai mật khẩu!");
            }
        }else {
            System.out.println("sai tài khoản!!");
        }
    }}
}

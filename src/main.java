import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Menus menus = new Menus();
        VehicleManagement vm = new VehicleManagement();
        Scanner scanner = new Scanner(System.in);
        vm.logIn();
        do {
            menus.menus();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    Vehicle vehicle = menus.getVehicle();
                    vm.add(vehicle);
                    break;
                case "2":
                    update(menus, vm, scanner);
                    break;
                case "3":
                    vm.showAll();
                    break;
                case "4":
                    searchByManufacturer(vm, scanner);
                    break;
                case "5":
                    remove(vm, scanner);
                    break;
                case "6":
                    sort(vm);
                    break;
                case "7":
                    carForSale(vm, scanner);

                    break;
                case "8":
                    vm.writeToFile("vehicle.txt");
                    break;
                case "9":
                    System.out.println(vm.readDateFromFile("vehicle.txt"));
                    break;
                case "10":
                    logIn();
                    vm.logIn();
                    break;
                case "11":
                    System.exit(0);
                    break;
                default:
                    System.err.println("!!!Không có lựa chọn trên!!!");
                    System.err.println("Mời bạn nhập lại!");
            }
        } while (true);
    }

    private static void logIn() {
        System.out.println("Đã đăng xuất!!!");
        System.out.println("Mời bạn đăng nhập lại");
    }

    private static void searchByManufacturer(VehicleManagement vm, Scanner scanner) {
        System.out.println("nhập hãng bạn muốn tìm: ");
        String manufacturers = scanner.nextLine();
        int index = vm.searchToManufacturer(0, vm.vehicles.size(), manufacturers);
        if (index == -1) {
            System.err.println("không có hãng này");
        } else {
            System.out.println(vm.vehicles.get(index));
        }
    }

    private static void carForSale(VehicleManagement vm, Scanner scanner) {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Tuổi: ");
        int yearOld = Integer.parseInt(scanner.nextLine());
        System.out.println("Số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập id xe cần mua: ");
        int vehicleId = Integer.parseInt(scanner.nextLine());
        System.out.println("Biển số xe: ");
        String licensePlates = scanner.nextLine();

        for (Vehicle vehicle1 : vm.vehicles) {
            if (vehicleId != vehicle1.getId()) {
                System.err.println("Xe ko tồn tại!!!");
                break;
            }
            if (vehicleId == vehicle1.getId()) {
                System.out.println("Chúc mừng ông: " + name + "-" + "Tuổi: " + yearOld + "-" + "Số điện thoại: " + phoneNumber);
                System.out.println("Đã sở hũu xe: " + vehicle1 + "Biển số xe là: " + licensePlates);
                vm.vehicles.remove(vehicle1);
                break;
            }
        }
    }

    private static void sort(VehicleManagement vm) {
        vm.sortById(vm.vehicles);
        for (int i = 0; i < vm.vehicles.size(); i++) {
            System.out.println(vm.vehicles.get(i));
        }
    }

    private static void remove(VehicleManagement vm, Scanner scanner) {
        try {
            System.out.println("Nhập id cần xóa");
            int id = Integer.parseInt(scanner.nextLine());
            vm.delete(id);
        } catch (Exception e) {
            System.err.println("Lỗi rồi !!!");
            System.err.println("Mời bạn nhập lại !!!");
        }
    }

    private static void update(Menus menus, VehicleManagement vm, Scanner scanner) {
        try {
            System.out.println("Nhập id muốn sửa: ");
            int id = Integer.parseInt(scanner.nextLine());
            Vehicle v = menus.getVehicle();
            vm.update(id, v);
        } catch (Exception e) {
            System.err.println("Lỗi rồi !!!");
            System.err.println("Mời bạn nhập lại !!!");
        }
    }
}

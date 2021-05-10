import java.util.Scanner;

public class Menus {
    public void menus() {
        System.out.println("1.Thêm xe");
        System.out.println("2.Chỉnh sửa thông tin xe");
        System.out.println("3.Hiển thị tất cả xe trong cửa hàng");
        System.out.println("4.Tìm kiếm xe theo hãng");
        System.out.println("5.Xóa xe");
        System.out.println("6.Sắp xếp");
        System.out.println("7.Bán xe");
        System.out.println("8.Luu file");
        System.out.println("9.Đoc file");
        System.out.println("10.Đăng xuất");
        System.out.println("11.Exit");
    }

    Scanner scanner = new Scanner(System.in);

    public void vehicle() {
            System.out.println("1.Ô tô");
            System.out.println("2.Xe máy");
            System.out.println("3.Xe tải");
        }


    public Vehicle getVehicle() {
        while (true) {
            try {
                System.out.println("Nhập id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên xe: ");
                String carName = scanner.nextLine();
                System.out.println("Nhập hãng sản xuất: ");
                String manufacturer = scanner.nextLine();
                System.out.println("Năm sản xuất: ");
                String yearOfManufacture = scanner.nextLine();
                System.out.println("Giá bán: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Màu xe: ");
                String vehicleColor = scanner.nextLine();
                System.out.println("Chọn loại xe:  ");
                vehicle();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Số chỗ ngồi: ");
                        int numberOfSeats = Integer.parseInt(scanner.nextLine());
                        System.out.println("Kiểu động cơ: ");
                        String engineType = scanner.nextLine();
                        return new Car(id, carName, manufacturer, yearOfManufacture, price, vehicleColor, numberOfSeats, engineType);
                    case 2:
                        System.out.println("Công suất: ");
                        String capacity = scanner.nextLine();
                        return new Motorcycle(id, carName, manufacturer, yearOfManufacture, price, vehicleColor, capacity);
                    case 3:
                        System.out.println("Trọng tải: ");
                        double payload = Double.parseDouble(scanner.nextLine());
                        return new Truck(id, carName, manufacturer, yearOfManufacture, price, vehicleColor, payload);
                    default:
                        System.err.println("Thử lại !!!");
                }
                return null;
            } catch (Exception e) {
                System.err.println("Lỗi rồi !!!");
                System.err.println("Mời bạn nhập lại !!!");
            }
        }
    }
}

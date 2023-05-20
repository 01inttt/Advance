package tin.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IManager manager = new Manager();
		showMenu(manager);
	}

	private static void showMenu(IManager manager) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("==========Menu==========");
			System.out.println("1.Thêm");
			System.out.println("2.Xóa");
			System.out.println("3.Sửa");
			System.out.println("4.Hiển Thị Danh Sách");
			System.out.println("5.Thoát");
			System.out.println("=============================");
			System.out.println("Nhập Lựa Chọn");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				manager.add(addFruit(sc));
				break;
			case 2:
				System.out.println("Nhập Tên Cần Xóa");
				String name = sc.next();
				manager.remove(name);
				break;
			case 3:
				System.out.println("VUi Lòng Chọn Số Khác");
				break;
			case 4:
				print(manager);
				break;
			case 5:
				System.out.println("Đã Thoát Chương Trình");
				System.exit(0);
				break;
			default:
				System.out.println("Vui Lòng Nhập Lại");
				break;
			}
		} while (choice != 5);
		
		
		
	}

	private static void print(IManager manager) {
		// TODO Auto-generated method stub
		for (Fruit fruit : manager.all()) {
			System.out.println(fruit.toString());
		}
	}

	private static Fruit addFruit(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("===Nhập Thông Tin===");
		System.out.println("Nhập Tên: ");
		String name = sc.next();
		
		System.out.println("Nhập Số Kg: ");
		double kg = sc.nextDouble();
		
		System.out.println("Nhập Giá: ");
		double cost = sc.nextDouble();
		
		System.out.println("Đã Thêm");
		return new Fruit(kg, name, cost);
	}

}

package lecongchanh;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham{
    public String tensp;
    public Double giasp;

    public SanPham(String tensp, Double giasp) {
        this.tensp = tensp;
        this.giasp = giasp;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm: " + tensp + '\n' +
                "Giá sản phẩm: " + giasp;
    }
}

public class Lab5_Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> ls = new ArrayList<>();
        while (true){
            int choose = menu();

            switch (choose){
                case 1:
                    nhap(ls, scanner);
                    break;
                case 2:
                    sapxep(ls);
                    break;
                case 3:
                    xoa(ls, scanner);
                    break;
                case 4:
                    tinhtrungbinh(ls);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static int menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------ MENU ------");
        System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4. Xuất giá trung bình của các sản phẩm");
        System.out.println("5. Kết thúc");
        System.out.println("------ END ------");
        System.out.print("Nhập lựa chọn: ");
        return scanner.nextInt();
    }

    public static void nhap(ArrayList<SanPham> ls, Scanner sc) {
        System.out.println("----- LỰA CHỌN 1: NHẬP DANH SÁCH SẢN PHẨM -----");
        int i = 1;
        while (true) {
            System.out.println("Nhập thông tin sản phẩm thứ " + i);
            System.out.print("Nhập tên sản phẩm: ");
            String name_prod = sc.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            Double price_prod = sc.nextDouble();
            sc.nextLine();
            SanPham sp = new SanPham(name_prod, price_prod);
            ls.add(sp);
            String confirm;
            do{
                System.out.print("Bạn có muốn nhập tiếp không? (Y/N): ");
                confirm = sc.nextLine().toUpperCase();
                if (!(confirm.equalsIgnoreCase("Y") || confirm.equalsIgnoreCase("N"))){
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập 'Y' hoặc 'N'");
                }
            } while (!(confirm.equalsIgnoreCase("Y") || confirm.equalsIgnoreCase("N")));
            if (confirm.equals("N")) {
                break;
            }
            i++;
        }
        System.out.println("----- HOÀN THÀNH NHẬP DANH SÁCH -----");
    }

    public static void sapxep(ArrayList<SanPham> ls)
    {
        System.out.println("----- LỰA CHỌN 2: SẮP XẾP GIẢM DẦN THEO GIÁ & XUẤT DANH SÁCH -----");
        int i = 1;
        Comparator<SanPham> comparator = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.giasp, o2.giasp);
            }
        };
        ls.sort(comparator);
        Collections.reverse(ls);
        for (SanPham sp : ls){
            System.out.println("Thông tin sản phẩm thứ " + i);
            System.out.println(sp);
            i++;
        }
        System.out.println("----- HOÀN THÀNH SẮP XẾP & XUẤT DANH SÁCH -----");
    }

    public static void xoa(ArrayList<SanPham> ls, Scanner sc){
        System.out.println("----- LỰA CHỌN 3: TÌM VÀ XÓA SẢN PHẨM THEO TÊN -----");
        boolean found = false;
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String name_prod = sc.nextLine();
        for(int i = 0; i < ls.size(); i++){
            if(ls.get(i).tensp.equals(name_prod)){
                ls.remove(i);
                System.out.println("Đã xóa " + name_prod + " ra khỏi danh sách");
                found = true;
                break;
            }
        }
        if(!found)  System.out.println("Không tìm thấy " + name_prod + " trong danh sách");
        System.out.println("----- HOÀN TẤT TÌM & XÓA SẢN PHẨM -----");
    }

    public static void tinhtrungbinh(ArrayList<SanPham> ls){
        System.out.println("----- LỰA CHỌN 4: TÍNH GIÁ TRUNG BÌNH CÁC SẢN PHẨM -----");
        double sum = 0;
        int count = 0;
        for(SanPham sp : ls){
            sum += sp.giasp;
            count++;
        }
        System.out.println("Giá trung bình của các sản phẩm = " + sum/count);
        System.out.println("----- HOÀN TẤT TÍNH GIÁ TRUNG BÌNH CÁC SẢN PHẨM -----");
    }
}

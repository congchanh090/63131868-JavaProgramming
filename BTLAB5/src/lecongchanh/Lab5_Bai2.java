package lecongchanh;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5_Bai2 {
    public static void main(String[] args){
        ArrayList<String> ls = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            int choose = menu();
            switch (choose){
                case 1:
                    nhap(ls, scanner);
                    break;
                case 2:
                    xuat(ls);
                    break;
                case 3:
                    ngaunhien(ls);
                    break;
                case 4:
                    sapxep(ls);
                    break;
                case 5:
                    xoa(ls, scanner);
                    break;
                case 6:
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
        System.out.println("-------- MENU --------");
        System.out.println("1. Nhập danh sách họ và tên");
        System.out.println("2. Xuất danh sách vừa nhập");
        System.out.println("3. Xuất danh sách ngẫu nhiên");
        System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
        System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
        System.out.println("6. Kết thúc");
        System.out.print("Nhập lựa chọn của bạn: ");
        return scanner.nextInt();
    }

    public static void nhap(ArrayList<String> ls, Scanner sc) {
        System.out.println("----- LỰA CHỌN 1: NHẬP DANH SÁCH HỌ TÊN -----");
        int i = 1;
        while (true){
            System.out.print("Nhập họ và tên của người thứ " + i + ": ");
            String hoten = sc.nextLine();
            ls.add(hoten);
            i++;
            String confirm;
            do{
                System.out.print("Bạn có muốn nhập tiếp không? (Y/N): ");
                confirm = sc.nextLine().toUpperCase();
                if(!(confirm.equalsIgnoreCase("Y") || confirm.equalsIgnoreCase("N"))){
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập 'Y' hoặc 'N'");
                }
            }while (!(confirm.equalsIgnoreCase("Y") || confirm.equalsIgnoreCase("N")));
            if(confirm.equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("----- HOÀN THÀNH NHẬP DANH SÁCH -----");
    }

    public static void xuat(ArrayList<String> ls) {
        System.out.println("----- LỰA CHỌN 2: XUẤT DANH SÁCH HỌ TÊN -----");
        for (String hoTen : ls) {
            System.out.println(hoTen);
        }
        System.out.println("----- HOÀN THÀNH XUẤT DANH SÁCH -----");
    }

    public static void ngaunhien(ArrayList<String> ls){
        System.out.println("----- LỰA CHỌN 3: XUẤT DANH SÁCH NGẪU NHIÊN -----");
        Collections.shuffle(ls);
        for(String hoTen : ls)
        {
            System.out.println(hoTen);
        }
        System.out.println("----- HOÀN TẤT XUẤT DANH SÁCH NGẪU NHIÊN -----");
    }

    public static void sapxep(ArrayList<String> ls){
        System.out.println("----- LỰA CHỌN 4: SẮP XẾP GIẢM DẦN & XUẤT DANH SÁCH -----");
        Collections.sort(ls);
        Collections.reverse(ls);
        for(String hoTen : ls)
        {
            System.out.println(hoTen);
        }
        System.out.println("----- HOÀN TẤT SẮP XẾP GIẢM DẦN & XUẤT DANH SÁCH -----");
    }

    public static void xoa(ArrayList<String> ls, Scanner sc){
        System.out.println("----- LỰA CHỌN 5: TÌM & XÓA HỌ TÊN -----");
        boolean found = false;
        System.out.print("Nhập họ và tên cần xóa: ");
        String del_name = sc.nextLine();
        for(int i = 0; i < ls.size(); i++) {
            if (ls.get(i).equals(del_name)) {
                ls.remove(i);
                System.out.println("Đã xóa " + del_name + " trong danh sách");
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Không tìm thấy " + del_name + " trong danh sách");
        System.out.println("----- HOÀN TẤT TÌM & XÓA HỌ TÊN -----");
    }
}

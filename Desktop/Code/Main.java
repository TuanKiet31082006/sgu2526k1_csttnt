import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Danhsachsinhvien dssv = new Danhsachsinhvien();
        while (true) {
            System.out.println("\n1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ho");
            System.out.println("4. Tim kiem sinh vien theo ten");
            System.out.println("5. Tim kiem sinh vien theo ma");
            System.out.println("6. Xoa sinh vien theo ma");
            System.out.println("7. Sua sinh vien theo ma");
            System.out.println("8. Thong ke gioi tinh");
            System.out.println("9. Thong ke do tuoi");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    dssv.nhap();
                    break;
                case 2:
                    dssv.xuat();
                    break;
                case 3:
                    dssv.timkiemsvtheoho();
                    break;
                case 4:
                    dssv.timkiemsvtheoten();
                    break;
                case 5:
                    dssv.timkiemsvtheoma();
                    break;
                case 6:
                    dssv.xoatheoma();
                    break;
                case 7:
                    dssv.suatheoma();
                    break;
                case 8:
                    dssv.thongkegioitinh();
                    break;
                case 9:
                    dssv.thongkedotuoi();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
    }
}

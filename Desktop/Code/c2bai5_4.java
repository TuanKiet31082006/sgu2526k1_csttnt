import java.util.Scanner;

public class c2bai5_4{
    Scanner sc = new Scanner(System.in);
    private String maHV;
    private String Ho;
    private String Ten;
    private String lop;
    private float diem1, diem2, diem3;

    // Hàm thiết lập không tham số
    public c2bai5_4() {
        maHV = "";
        Ho = "";
        Ten = "";
        lop = "";
        diem1 = diem2 = diem3 = 0;
    }

    // Hàm thiết lập có tham số
    public c2bai5_4(String maHV,String Ho, String Ten, String Lop, float diem1, float diem2, float diem3) {
        this.maHV = maHV;
        this.Ho=Ho;
        this.Ten = Ten;
        this.lop = Lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    // Hàm thiết lập get/set
    public  String getMaHV(){
        return maHV;
    }
    
    public void setMaHV(String maHV){
        this.maHV = maHV;
    } 
    
    public String getHo(){
        return Ho;
    }

    public void setHo(String Ho){
        this.Ho = Ho;
    }
    
    public String getTen(){
        return Ten;
    }

    public void setTen(String Ten){
        this.Ten=Ten;
    }
    public String getLop(){
        return lop;
    }

    public void setLop(String lop){
        this.lop = lop;
    }

    public float getDiem1(){
        return diem1;
    }

    public void setDiem1(float diem1){
        this.diem1 = diem1;
    }
    
    public float getDiem2(){
        return diem2;
    }

    public void setDiem2(float diem2){
        this.diem2 = diem2;
    }
    
    public float getDiem3(){
        return diem3;
    }

    public void setDiem3(float diem3){
        this.diem3 = diem3;
    }
    public void nhap() {
        System.out.print("Nhap ma: ");
            maHV = sc.nextLine();
        System.out.print("Nhap ho: ");
            Ho = sc.nextLine();
        System.out.print("Nhap ten: ");
            Ten = sc.nextLine();
        System.out.print("Nhap lop: ");
            lop = sc.nextLine();
        System.out.print("Diem mon 1: ");
            diem1 = sc.nextFloat();
        System.out.print("Diem mon 2: ");
            diem2 = sc.nextFloat();
        System.out.print("Diem mon 3: ");
            diem3 = sc.nextFloat();
    }

    public void xuat() {
        System.out.println("Ma hoc vien:" + maHV);
        System.out.println("Ho hoc vien:" + Ho);
        System.out.println("Ten hoc vien:"+Ten);
        System.out.println("Lop:"+ lop);
        System.out.println("Diem mon 1:" + diem1);
        System.out.println("Diem mon 2:" + diem2);
        System.out.println("Diem mon 3:" + diem3);
    }

    public float diemtrungbinh() {
        return (diem1 + diem2 + diem3) / 3;
    }

    public String xepLoai() {
       if(diemtrungbinh()>=8)
            return "gioi";
        if(diemtrungbinh()>=6.5)
            return "kha";
        if(diemtrungbinh()>=5)
            return "trung binh";
        if(diemtrungbinh()>=3.5)
            return "yeu";
        else
            return "kem";
    }

    public static void main(String[] args) {
    // Hàm thiết lập tham số có sẵn
        c2bai5_4 hv1 = new c2bai5_4();
        hv1.nhap();
        hv1.xuat();
        System.out.println("Diem trung binh:" + hv1.diemtrungbinh());
        System.out.println("Xep loai:" + hv1.xepLoai());

        // Hàm thiết lập không tham số và nhập từ bàn phím
        c2bai5_4 hv2 = new c2bai5_4();
        hv2.nhap();
        hv2.xuat();
        System.out.println("Diem trung binh:" + hv2.diemtrungbinh());
        System.out.println("Xep loai:" + hv2.xepLoai());
    }
}
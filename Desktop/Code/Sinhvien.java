import java.util.Scanner;
public class Sinhvien{
    Scanner sc=new Scanner(System.in);
    private String MaSV;
    private String Ho;
    private String Ten;
    private int nam;
    private String lop;
    private String gioitinh;
    
    public Sinhvien(){
        MaSV=" ";
        Ho=" ";
        Ten=" ";
        nam=0;
        lop=" ";
        gioitinh=" ";
    }

    public Sinhvien(String MaSV, String Ho,String Ten,int nam, String lop,String gioitinh){
        this.MaSV=MaSV;
        this.Ho=Ho;
        this.Ten=Ten;
        this.nam=nam;
        this.lop=lop;
        this.gioitinh=gioitinh;
    }
    public void nhap(){
        System.out.print("Ma sinh vien: ");
            MaSV=sc.nextLine();
        System.out.print("Ho: ");
            Ho=sc.nextLine();
        System.out.print("Ten: ");
            Ten=sc.nextLine();
        System.out.print("Nam: ");
            nam=sc.nextInt();
            sc.nextLine();
        System.out.print("Lop: ");
            lop=sc.nextLine();
        System.out.print("Gioi tinh: ");
            gioitinh=sc.nextLine();
            sc.nextLine();
    }

    public void xuat(){
        System.out.println("Ma: "+MaSV);
        System.out.println("Ho: "+Ho);
        System.out.println("Ten: "+Ten);
        System.out.println("Nam sinh:"+nam);
        System.out.println("Lop: "+lop);
        System.out.println("Gioi tinh: "+gioitinh);
        System.out.println("Tuoi: " + gettuoi());
    }

    public String getMaSV(){
        return MaSV;
    }
    public String getHo(){
        return Ho;
    }
    public String getTen(){
        return Ten;
    }
    public int getnam(){
        return nam;
    }
    public String getlop(){
        return lop;
    }
    public String getgioitinh(){
        return gioitinh;
    }
    public int gettuoi(){
        return 2025 - nam;
    }
    public void setMaSV(String MaSV){
        this.MaSV=MaSV;
    }
    public void setHo(String Ho){
        this.Ho=Ho;
    }
    public void setTen(String Ten){
        this.Ten=Ten;
    }
    public void setnam(int nam){
        this.nam=nam;
    }
    public void setlop(String lop){
        this.lop=lop;
    }
    public void setgioitinh(String gioitinh){
        this.gioitinh=gioitinh;
    }
}
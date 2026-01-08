import java.util.Scanner;
class Danhsachsinhvien {
    Scanner sc=new Scanner(System.in);
    private int n;
    private Sinhvien[] dssv =new Sinhvien[100];
    public void nhap(){
        System.out.print("Nhap so sinh vien: ");
        n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Nhap sinh vien thu "+(i+1)+"\n" );
            dssv[i]= new Sinhvien();
            dssv[i].nhap();
        }
    }
    public void xuat(){
        System.out.println("Danh sach sinh vien");
        for (int i=0;i<n;i++){
            dssv[i].xuat();
        }
    }
    public void timkiemsvtheoho(){
        System.out.println("Nhap ho sinh vien can tim: ");
        String hocantim=sc.nextLine();
        boolean timkiem=false;
        for(int i=0;i<n;i++){
            if(dssv[i].getHo().equalsIgnoreCase(hocantim)){
                timkiem=true;
                dssv[i].xuat();
            }
        }
        if(!timkiem){
            System.out.print("Khong co trong danh sach");
        }
    }
    public void timkiemsvtheoten(){
        System.out.println("Nhap ten sinh vien can tim: ");
        String tencantim=sc.nextLine();
        boolean timkiem=false;
        for(int i=0;i<n;i++){
            if(dssv[i].getTen().equalsIgnoreCase(tencantim)){
                timkiem=true;
                dssv[i].xuat();
            }
        }
        if(!timkiem){
            System.out.print("Khong co trong danh sach");
        }
    }
    public void timkiemsvtheoma(){
        System.out.println("Nhap ma sinh vien can tim: ");
        String macantim=sc.nextLine();
        boolean timkiem=false;
        for(int i=0;i<n;i++){
            if(dssv[i].getMaSV().equalsIgnoreCase(macantim)){
                timkiem=true;
                dssv[i].xuat();
            }
        }
        if(!timkiem){
            System.out.println("Khong co trong danh sach");
        }
    }
    public void xoatheoma(){
        System.out.print("Nhap ma can xoa: ");
        String macanxoa=sc.nextLine();
        boolean daxoa = false;
        for(int i=0;i<n;i++){
            if(dssv[i].getMaSV().equalsIgnoreCase(macanxoa)){
                for(int j=i;j<n-1;j++){
                    dssv[j]=dssv[j+1];
                }
                dssv[n-1]=null;
                n--;
                daxoa=true;
                System.out.println("Da xoa sinh vien co ma: "+macanxoa);
                break;
            }
        }
        if(!daxoa){
            System.out.println("Khong tim thay sinh vien co ma: "+macanxoa);
        }
    }
    public void suatheoma(){
        System.out.println("Nhap ma sinh vien can sua: ");
        String macansua=sc.nextLine();
        boolean dasua = false;
        for(int i = 0; i < n; i++){
            if(dssv[i].getMaSV().equalsIgnoreCase(macansua)){
                System.out.println("Tim thay sinh vien: ");
                dssv[i].xuat();
                System.out.println("Nhap thong tin can them cho sinh vien: ");
                dssv[i] = new Sinhvien();
                dssv[i].nhap();
                System.out.println("Da sua thong tin sinh vien co ma: "+macansua);
                dasua = true;
                break;
            }
        }
        if(!dasua){
            System.out.println("Khong tim thay sinh vien co ma: "+macansua);
        }
    }
    public void thongkegioitinh(){
        int nam = 0,nu = 0;
        for (int i = 0; i < n; i++) {
            String gtinh=dssv[i].getgioitinh().trim().toLowerCase();
            if(gtinh.equals("nam")){
                nam++;
            }else if(gtinh.equals("nu")){
                nu++;
            }
        }
        System.out.println("Thong ke gioi tinh:");
        System.out.println("So luong nam: "+nam);
        System.out.println("So luong nu: "+nu);
    }
    public void thongkedotuoi(){
        if(n==0){
            System.out.print("danh sach rong!!!");
            return;
        }
        int dem[] = new int[100];
        for(int i=0;i<n;i++){
            int tuoi = dssv[i].gettuoi();
            if(tuoi>=0 && tuoi<100){
                dem[tuoi]++; 
            }
        }
            System.out.println("Thong ke so sinh vien theo do tuoi:");
        for (int i = 0; i < 100; i++) {
        if (dem[i] > 0) {
            System.out.println("Tuoi " + i + ": " + dem[i] + " sinh vien");
            }
       }
    }
}

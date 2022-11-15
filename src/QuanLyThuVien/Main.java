package QuanLyThuVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        QuanLy themuon = new QuanLy();
        themuon.themSinhVien();

        while (true) {

            System.out.println("------------------");
            System.out.println("quan ly thu vien");
            System.out.println("chon chuc nang");
            System.out.println("1. them moi phieu muon");
            System.out.println("2. xoa phieu muon theo ma");
            System.out.println("3. in thong tin cac the muon");
            System.out.println("4. exit");
            String luachon = sc.nextLine();

            switch (luachon) {
                case "1": {
                    System.out.println("nhap ma phieu muon");
                    String maphieumuon = sc.nextLine();
                    System.out.println("nhap ngay muon");
                    int ngaymuon = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap han tra");
                    int hantra = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap so hieu sach");
                    String sohieusach = sc.nextLine();
                    System.out.println("nhap sinh vien muon sach");
                    String tensv = sc.nextLine();
                    SinhVien sinhVienmuon = themuon.timkiemtheoten(tensv);

                    TheMuon theMuon = new TheMuon(maphieumuon, ngaymuon, hantra, sohieusach, sinhVienmuon);
                    themuon.themSachChoMuon(theMuon);
                    break;
                }
                case "2": {
                    System.out.println("nhap ma phieu muon");
                    String maphieumuon = sc.nextLine();
                    themuon.xoaPhieuMuon(maphieumuon);
                    break;
                }
                case "3": {
                    themuon.inThongTin();
                    break;
                }
                case "4": {
                    return;
                }
                default: {
                    System.out.println("chon sai lua chon");
                    break;
                }
            }
        }


    }
}

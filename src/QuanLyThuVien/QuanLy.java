package QuanLyThuVien;

import java.util.ArrayList;

public class QuanLy {

    SinhVien sv1 = new SinhVien("Bui Duy Quang", 25, "2n");
    SinhVien sv2 = new SinhVien("Ho Ngoc Khanh", 24, "2k");

    ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();

    public void themSinhVien() {
        dsSinhVien.add(sv1);
        dsSinhVien.add(sv2);
    }

    //them ma phieu muon
    ArrayList<TheMuon> dsTheMuon = new ArrayList<TheMuon>();

    public boolean themSachChoMuon(TheMuon sachMuon) {
        return dsTheMuon.add(sachMuon);
    }

    //xoa theo ma phieu muon

    public boolean xoaPhieuMuon(String maphieu) {
        int solanxoa = 0;

        for (int i = 0; i < dsTheMuon.size(); ) {
            if (maphieu.equals(dsTheMuon.get(i).getMaPhieuMuon())) {
                if (!dsTheMuon.remove(dsTheMuon.get(i))) {
                    return false;
                }
                solanxoa++;
            } else {
                i++;
            }
        }
        return solanxoa > 0;
    }

    // tim kiem sinh vien theo ten

    public SinhVien timkiemtheoten(String tensv) {
        for (int i = 0; i < dsSinhVien.size(); ) {
            if (tensv.equals(dsSinhVien.get(i).getHoTen())) {
                return dsSinhVien.get(i);
            }

        }

        return null;
    }
    // in thong tin phieu muon


    public void inThongTin() {
        for (TheMuon temp : dsTheMuon
        ) {
            System.out.println(temp);
        }

    }

}

package hinhchunhat_object;

public class HinhChuNhat {
    int chieudai;
    int chieurong;

    HinhChuNhat(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    int dienTich() {
        return chieudai * chieurong;
    }

    double chuVi() {
        double P = (double) (chieudai * chieurong) / 2;
        return P;
    }
}

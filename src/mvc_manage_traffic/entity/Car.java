package mvc_manage_traffic.entity;

public class Car extends Vehicle {
    private int soChoNgoi;
    private String kieuXe;

    public Car(String bienKS, String tenHSX, int namSX, String chuSH,int soChoNgoi, String kieuXe){
        super(bienKS,tenHSX, namSX,chuSH);
        this.soChoNgoi=soChoNgoi;
        this.kieuXe=kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
    public void displayInfo(){
        System.out.println("Bien kiem soat: " +getBienKS() +"| Hang SX: " +getTenHSX() +"| Nam SX: " +getNamSX() +"| Chu so huu: " +getChuSH() +"| So cho ngoi: " +this.soChoNgoi +"| Kieu Xe: " +this.kieuXe);
    }
}

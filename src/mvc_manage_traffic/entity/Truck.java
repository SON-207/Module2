package mvc_manage_traffic.entity;

public class Truck extends Vehicle {
    private double trongTai;

    public Truck(String bienKS, String tenHSX, int namSX, String chuSH, double trongTai){
        super(bienKS, tenHSX, namSX, chuSH);
        this.trongTai=trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    public void displayInfo(){
        System.out.println("Bien kiem soat: " +getBienKS() +"| Hang SX: " +getTenHSX() +"| Nam SX: " +getNamSX() +"| Chu so huu: " +getChuSH() +"| Trong tai: " +this.trongTai);
    }
}

package mvc_manage_traffic.entity;

public class Motorbike extends Vehicle {
    private double congSuat;

    public Motorbike(String bienKS, String tenHSX, int namSX, String chuSH, double congSuat){
        super(bienKS, tenHSX, namSX, chuSH);
        this.congSuat=congSuat;
    }
    public void displayInfo(){
        System.out.println("Bien kiem soat: " +getBienKS() +"| Hang SX: " +getTenHSX() +"| Nam SX: " +getNamSX() +"| Chu so huu: " +getChuSH() +"| Cong Suat: " +this.congSuat);
    }
}

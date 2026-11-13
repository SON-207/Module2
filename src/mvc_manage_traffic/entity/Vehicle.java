package mvc_manage_traffic.entity;

public abstract class Vehicle {
    protected String bienKS; //
    protected String tenHSX;
    protected int namSX;
    protected String chuSH;

    public Vehicle(String bienKS, String tenHSX, int namSX, String chuSH) {
        this.bienKS = bienKS;
        this.tenHSX = tenHSX;
        this.namSX = namSX;
        this.chuSH = chuSH;
    }

    public String getBienKS() {
        return bienKS;
    }

    public void setBienKS(String bienKS) {
        this.bienKS = bienKS;
    }

    public String getTenHSX() {
        return tenHSX;
    }

    public void setTenHSX(String tenHSX) {
        this.tenHSX = tenHSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSH() {
        return chuSH;
    }

    public void setChuSH(String chuSH) {
        this.chuSH = chuSH;
    }

    public void displayInfo(){
        System.out.println("Bien kiem soat: " +bienKS +"| Hang SX: " +tenHSX +"| Nam SX: " +namSX +"| Chu so huu: " +chuSH);
    }
}

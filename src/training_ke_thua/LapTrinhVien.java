package training_ke_thua;

public class LapTrinhVien extends NhanVien{
    private String ngonNgu;
    public LapTrinhVien(String ten, double luong, String ngonNgu){
        super(ten,luong);
        this.ngonNgu = ngonNgu;
    }

    public void code(){
        System.out.println("Ten: "+ten +" Luong: " +luong +" Ngon Ngu: "+ngonNgu);
    }
}

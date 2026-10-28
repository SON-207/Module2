package training_ke_thua;

public class Run {
    public static void main(String[] args) {
        LapTrinhVien ltv = new LapTrinhVien("Son", 150000, "vietnamese");
        //-------
        ltv.hienthi();;
        //--------
        System.out.println("");
        ltv.code();
    }
}

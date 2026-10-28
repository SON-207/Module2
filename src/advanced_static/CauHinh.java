package advanced_static;

public class CauHinh {
    public static String tenApp ;
    public static String phienBan ;

    static{
        tenApp = "Ung Dung java";
        phienBan = "1.0.0";
        System.out.println("da khoi tao cau hinh");
    }

    public static void inCauHinh(){
        System.out.println("Ten APP: "+tenApp);
        System.out.println("Phien ban"+phienBan);
    }
    public static class TienIch{
        public void xinChao(){
            System.out.println("chao mung ban den voi tien ich");
        }
    }
}

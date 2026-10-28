package first_time_training_static;

public class HocSinh {
    private String ten; //(non-static)
    public static int tongHocSinh = 0; //(static)

    public HocSinh(String ten){
        this.ten = ten;
        tongHocSinh++;
    }
    public void hienThi(){
        System.out.println("Ten: "+ten +"- TONG SO HOC SINH :" +tongHocSinh);
    }

}

package ss1_Java_Overview;
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap so usd");
        int usd = sc.nextInt();
        System.out.println("so tien vua nhap la "+usd);
        int rate;
        rate = usd*26000;
        System.out.println("so tien doi sang vnd = "+rate +" dong");
    }
}

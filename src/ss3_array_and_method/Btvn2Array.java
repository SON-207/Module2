package ss3_array_and_method;
import java.util.Scanner;
public class Btvn2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = {10,4,6,7,8,0,0,0,0,0};
        System.out.println("nhap X la so can chen");
        int X = sc.nextInt();
        System.out.println("nhap vi tri index muon chen ");
        int index = sc.nextInt();
        if(index <=-1 || index >= N.length-1){
            System.out.println("loi chi so index");
        }
        else{
            for(int i = N.length - 1; i > index; i--){
                N[i] = N[i-1];
            }

        }
        N[index] = X;
        System.out.println("New array = ");
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");
        }
    }
}

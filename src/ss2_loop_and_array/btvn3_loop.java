package ss2_loop_and_array;
public class btvn3_loop {
    public static void main(String[] args) {
        int n = 2;
        while(n < 100){
            boolean tam = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0){
                    tam = false;
                    break;
                }
            }
            if(tam){
                System.out.println("so " +n +" la so nguyen to be hon 100");
            }
            n++;
        }
    }
}

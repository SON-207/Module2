package ss3_array_and_method;

import java.util.Scanner;

public class Btvn4Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang ");
        int r = sc.nextInt();
        System.out.println("nhap so cot");
        int h = sc.nextInt();
        int[][] m = new int[r][h];

        for(int i = 0; i< m.length;i++){
            for(int j = 0; j< m[i].length;j++){
                System.out.println("m = ["+i+"]["+j+"]");
                m[i][j] = sc.nextInt();
            }
        }
        int max = m[0][0];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(max < m[i][j]){
                    max = m[i][j];
                }
            }
        }
        System.out.println("so lon nhat trong mang la " +max);
    }
}

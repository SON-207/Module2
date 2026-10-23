package ss3_array_and_method;
import java.util.Scanner;
public class CalculateSumOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang ");
        int rows = scanner.nextInt();
        System.out.println("nhap so cot");
        int col = scanner.nextInt();
        int[][] matrix = new int[rows][col];
        //in ra mang
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println("m =["+i+"]"+"["+i+"]");
                matrix[i][j]= scanner.nextInt();

            }
        }
    }
}

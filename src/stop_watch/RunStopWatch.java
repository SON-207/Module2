package stop_watch;

import java.util.Random;

public class RunStopWatch {

    /** Thuật toán sắp xếp chọn */
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // hoán đổi
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int n = 100_000;
        int[] arr = new int[n];
        Random rand = new Random();

        // 1. Sinh mảng ngẫu nhiên 100.000 số
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1_000_000);
        }

        // 2. Bắt đầu đo thời gian
        StopWatch sw = new StopWatch();   // constructor đã set startTime = now

        // 3. Chạy selection sort
        selectionSort(arr);

        // 4. Kết thúc đo
        sw.stop();

        // 5. In kết quả
        System.out.println("Số phần tử: " + n);
        System.out.println("Thời gian thực thi: " + sw.getElapsedTime() + " ms");
    }
}
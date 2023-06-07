import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //xóa phần tử đã có trong mảng
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số bạn muốn xóa");
//        int arr[] = {1, 2, 3, 4, 5, 6, 3, 8, 9, 10};
//        int num = scanner.nextInt();
//        int[] in = new int[arr.length-1];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < num) {
//                in[i] = arr[i];
//            }
//            else if (arr[i] > num){
//                in[i-1] = arr[i];
//            }
//        }
//        System.out.println("dãy sô mới là" + Arrays.toString(in));



        //thêm phần tử vào trong mảng
//        System.out.println("nhập số bạn muốn thêm vảo mảng");
//        int num1 = scanner.nextInt();
//        System.out.println("nhập vị trí bạn muốn thêm vảo mảng");
//        int index = scanner.nextInt();
//        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arrUdate = new int[11];
//        for (int i = 0; i <= arr1.length; i++){
//            if (i < index) {
//                arrUdate[i] = arr1[i];
//            } else if (i == index) {
//                arrUdate[i] = num1;
//            }else{
//                arrUdate[i] = arr1[i-1];
//            }
//        }
//        System.out.println("mảng mới là " + Arrays.toString(arrUdate));


        //gộp 2 mảng
//        Scanner scanner = new Scanner(System.in);
//        // Nhập kích thước mảng 1
//        System.out.print("Nhập kích thước mảng 1: ");
//        int size1 = scanner.nextInt();
//        // Nhập các phần tử của mảng 1
//        int[] array1 = new int[size1];
//        System.out.println("Nhập các phần tử của mảng 1:");
//        for (int i = 0; i < size1; i++) {
//            System.out.print("Phần tử thứ " + (i + 1) + ": ");
//            array1[i] = scanner.nextInt();
//        }
//        // Nhập kích thước mảng 2
//        System.out.print("Nhập kích thước mảng 2: ");
//        int size2 = scanner.nextInt();
//        // Nhập các phần tử của mảng 2
//        int[] array2 = new int[size2];
//        System.out.println("Nhập các phần tử của mảng 2:");
//        for (int i = 0; i < size2; i++) {
//            System.out.print("Phần tử thứ " + (i + 1) + ": ");
//            array2[i] = scanner.nextInt();
//        }
//        // Tính kích thước mảng 3
//        int size3 = size1 + size2;
//        // Gộp hai mảng thành mảng thứ ba
//        int[] array3 = new int[size3];
//        for (int i = 0; i < size1; i++) {
//            array3[i] = array1[i];
//        }
//        for (int i = 0; i < size2; i++) {
//            array3[size1 + i] = array2[i];
//        }
//        // Hiển thị mảng thứ ba sau khi gộp
//        System.out.println("Mảng sau khi gộp:");
//        for (int i = 0; i < size3; i++) {
//            System.out.print(array3[i] + " ");
//        }


        // tìm nhỏ nhất và lớn nhất
        // Tạo mảng hai chiều cố định
//        int[][] matrix = {
//                {5, 2, 7, 3, 1},
//                {9, 4, 8, 6, 2},
//                {3, 6, 1, 9, 5},
//                {7, 2, 4, 8, 3}
//        };
//
//        // Tìm giá trị nhỏ nhất trong ma trận
//        int minValue = matrix[0][0];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] < minValue) {
//                    minValue = matrix[i][j];
//                }
//            }
//        }
//        // Hiển thị kết quả
//        System.out.println("Giá trị nhỏ nhất trong mảng hai chiều là: " + minValue);


        // Tạo mảng hai chiều cố định
//        int[][] matrix1 = {
//                {5, 2, 7, 3, 1},
//                {9, 4, 8, 6, 2},
//                {3, 6, 1, 9, 5},
//                {7, 2, 4, 8, 3}
//        };
//        // Tìm giá trị nhỏ nhất trong ma trận
//        int maxValue = matrix1[0][0];
//
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                if (matrix1[i][j] > maxValue) {
//                    maxValue = matrix1[i][j];
//                }
//            }
//        }
        // Hiển thị kết quả
//        System.out.println("Giá trị nhỏ nhất trong mảng hai chiều là: " + maxValue);



        // Tính tổng các số ở một cột xác định
        // Tạo mảng hai chiều cố định
//        int[][] array = {
//                {2, 4, 6, 8, 10},
//                {1, 3, 5, 7, 9},
//                {11, 13, 15, 17, 19}
//        };
//        // Chỉ số cột muốn tính tổng
//        int columnIndex = 2; // Chỉ số cột 2 (tính từ 0)
//
//        // Tính tổng các số trong cột
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i][columnIndex];
//        }
//        // Hiển thị kết quả
//        System.out.println("Tổng các số trong cột là: " + sum);




        //Mảng hai chiều - tính tổng các số ở đường chéo chính của ma trận vuông
        // Tạo mảng hai chiều cố định
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        // Tính tổng các số ở đường chéo chính
//        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            sum += matrix[i][i];
//        }
//        // Hiển thị kết quả
//        System.out.println("Tổng các số ở đường chéo chính là: " + sum);



        //Tìm phần tử lớn thứ 2 trong Mảng
        int[] arr = {2, 1, 34, 52, 52, 74, 54};
        int max1 = Integer.MIN_VALUE; // Số lớn nhất
        int max2 = Integer.MIN_VALUE; // Số lớn thứ hai

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }

        System.out.println("Số lớn thứ hai trong mảng là: " + max2);
    }
}
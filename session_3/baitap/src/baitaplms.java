public class baitaplms {
    public static void main(String[] args) {
        //hiển thị hình chữ nhật
        int rows = 3; // số hàng
        int cols = 7; // số cột

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* "); // in dấu '*' ra màn hình
            }
            System.out.println(); // in xuống dòng sau khi hoàn thành một hàng
        }
        // in hình tam giác
        int rows1 = 5; // số hàng

        for (int i = 1; i <= rows1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // in dấu '*' ra màn hình với khoảng trắng sau mỗi dấu '*'
            }
            System.out.println(); // in xuống dòng sau khi hoàn thành một hàng
        }
        // in hình tam giác đảo ngược
        int rows2 = 5; // số hàng

        for (int i = rows2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // in dấu '*' ra màn hình với khoảng trắng sau mỗi dấu '*'
            }
            System.out.println(); // in xuống dòng sau khi hoàn thành một hàng
        }
    }
}

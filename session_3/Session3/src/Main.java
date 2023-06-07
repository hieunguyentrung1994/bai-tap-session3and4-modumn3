import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.xml.bind.SchemaOutputResolver;
import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //loop
        // vòng lặp for  .. i
        for (int i = 0; i <10; i++) {
            System.out.println("gias trij cuar i laf: "+ i);
        }
        // Array(mảng) - collecttion (danh sách)
        int[] array = {1,2,3,4,5,6,7,8};
        // vòng lặp for-each
        for (int number : array){
            System.out.println("Number: "+ number);
        }
        //vòng lặp while.
        int so = 0;
        boolean check = true;
        while (check == true){
            System.out.println("vòng lặp hoạt động ");
            if (so >= 10){
                check = false;
            }
            so++;
        }
        Scanner sc = new Scanner(System.in);
        //vòng lặp do .... while
        int number =0 ;
        do {
            System.out.println("hãy nhạp vào 1 số tự nhiên");
            number =Integer.parseInt(sc.nextLine());
            System.out.println("số bạn vừa nhập là" + number);
//            if (number == 9){
//                break;   // break
//            }
            if (number > 5){
                continue; // continue: nếu nhập vào trên 5 xẽ bỏ qua các câu lệnh đằng sau nều nhập dưới vẫn chạy các câu lệnh đằng sau

            }
            System.out.println("vòng lặp hoạt động ");
        }while (number !=10);
        // các lệnh để  Break / Continue


    }
}
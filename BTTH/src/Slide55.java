import java.util.Scanner;
public class Slide55 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("Cac so chia het cho 5: ");
     for (int i = 0; i <= 20; i++) {
        if(i % 5 !=0) {
            continue;
        }
        System.out.println(i);
     }
     sc.close();
    }
}   
import java.util.Scanner;
public class Slide95B8 {
public static void main(String[] args) {
    int n,sum = 0 ,number;
    float avgr;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao cac so nguyen co trong day: ");
    n = sc.nextInt();
    for (int count = 1;count <=n;count++) {
        System.out.println("Nhap so thu" + count + ":");
        number = sc.nextInt();
        sum += number;
    }
    avg = sum /n;
    System.out.println("Trung binh cong=");
    sc.close();
}
}

import java.util.Scanner;
public class PTB1 {
    public static void main(String[] args){
        double hesoA,hesoB,nghiemX;
        Scanner sc = new Scanner(System.in);
        System.out.println("A=");
        hesoA = sc .nextDouble();
        System.out.println("B=");
        hesoB = sc .nextDouble();
    if(hesoA == 0 ){
        System.out.println("Khong phai phuong trinh bac nhat");
    }else{
        nghiemX = -hesoB/hesoA;
    }
   }
}

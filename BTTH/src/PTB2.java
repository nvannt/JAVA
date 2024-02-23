import java.util.Scanner;
public class PTB2 {
    public static void main(String[] args){
        double hesoA,hesoB,x1,x2,hesoC,delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("A=");
        hesoA = sc.nextDouble();
        System.out.println("B=");
        hesoB = sc.nextDouble();
        System.out.println("C=");
        hesoC = sc.nextDouble();
    if(hesoA == 0) {
        System.out.println("Khong phai phuong trinh bac nhat");
    }else{
        delta = Math.pow(hesoB,2) - 4 * hesoA * hesoC;
       if(delta < 0) {
        System.out.println("Phuong trinh vo nghiem");
       }else if (delta == 0) {
        nghiemX1 = nghiemX2 =(-hesoB/(2*hesoA));
        System.out.println("Phuong trinh co nghiem kep");
       }else{
        x1=(-hesoB + Math.sqrt(delta))/(2*hesoA);
        x2=(-hesoB - Math.sqrt(delta))/(2*hesoA);
        System.out.println("Phuong trinh co 2 nghiem kep");
       }
    }
       Scanner.close();
}
   }
    

import java.util.Scanner;
public class hinhtron {
    public static void main(String [] args){
    }
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;
    void nhapBanKinh () {
        System.out.print("Hay nhap vao ban kinh hin tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
        sc.close();
    }
    void tinhChuVi() {
        cv = 2 * PI * r;
    } 
    void tinhDienTich() {
        dt = PI * r * r;
    }
    void inChuVi() {
        System.out.print("Chu vi hinh tron: " +cv);
    }
    void inDienTich() {
        System.out.print("Dien tich hinh tron: "+dt);
    }
}


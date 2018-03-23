import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a ,b ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập a=");
        a = scanner.nextInt();
        System.out.println("nhập b=");
        b = scanner.nextInt();

        a = Math.abs(a);
        b= Math.abs(b);

        if (a==0 || b ==0) {
            System.out.println("ko có giá trị");
        }
        while ( a !=b) {
            if (a<b) {
                a=a-b;
                System.out.println("ước của a =" +a);
            }else {
                b = b-a ;
                System.out.println("ước của b ="+b);
            }
            break;
        }



    }
}

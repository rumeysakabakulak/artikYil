import java.util.Scanner;
public class artikYıl {
    public static void main(String[] args) {

        int yil;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = inp.nextInt();

        if ((yil%100==0) && (yil%400==0)) {
            System.out.println("Artık Yıldır");
        }else if (yil%4==0){
            System.out.println("Artık Yıldır");
        }else{
            System.out.println("Artık Yıl Değildir");
        }

    }
}

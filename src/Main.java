import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,teta,Alan,DilimAlan,pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap Giriniz: ");
        r = input.nextDouble();
        System.out.print("Açı Giriniz: ");
        teta = input.nextDouble();

        Alan=pi*r*r;
        DilimAlan=Alan/360*teta;

        System.out.println("Daire Alan:"+Alan);
        System.out.println("Dilim Alan:"+DilimAlan);
    }
}

import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;
        System.out.print("Lütfen a kenarının uzunluğunu girin :");
        a = input.nextInt();

        System.out.println("Lütfen b kenarının uzunluğunu girin :");
        b = input.nextInt();

       double hipo = Math.sqrt((a*a)+(b*b));

        System.out.print("Hipotenus :"+hipo);


        System.out.println("Hello world!");
    }
}

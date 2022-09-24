import java.util.Scanner;

public class InventoryManagement1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int neededA = scanner.nextInt();
            int neededB = scanner.nextInt();
            int neededC = scanner.nextInt();
            if (a<0 || b<0 || c<0 || neededA<0 || neededB<0 || neededC<0){
                System.out.println("Invalid Input");
                return;
            }
            int created =0;
            while (a>=neededA && b>=neededB && c>=neededC){
                created++;
                a-=neededA;
                b-=neededB;
                c-=neededC;
            }
            System.out.println(created);
            System.out.printf("%d %d %d",a,b,c);
        }catch (Exception e){
            System.out.println("Invalid Input");
            return;
        }
    }
}
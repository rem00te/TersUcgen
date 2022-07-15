import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("basamak girin :");
        int n = input.nextInt();


        for (int i = 1;i <=n; i++){
            for(int bsmk=1; bsmk<=i; bsmk++){
                System.out.print(" ");
            }
            for (int sira=1;sira<=(2*(n-i+1)-1);sira++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

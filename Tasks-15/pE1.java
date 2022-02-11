import java.util.Scanner;

public class pE1 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        int sum = 0;
        for (int i = 3; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
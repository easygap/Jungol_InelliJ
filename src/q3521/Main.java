package q3521;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chuA = sc.nextInt();
        int chuB = sc.nextInt();
        int chuC = sc.nextInt();
        int chuD = sc.nextInt();
        int chuE = sc.nextInt();

        int result = sc.nextInt();

        char check = 'Y';

        sc.close();

        int count = 0;


            while (result >= 0) {
                if (chuA <0 || chuB < 0 || chuC < 0 || chuD < 0 || chuE < 0) {
                    System.out.println("impossible");
                    check = 'N';
                    break;
                } else if (result / 16 >= 1 && chuE != 0) {
                    result = result - 16;
                    chuE--;
                    count++;
                } else if (result / 8 >= 1 && chuD != 0) {
                    result = result - 8;
                    chuD--;
                    count++;
                } else if (result / 4 >= 1 && chuC != 0) {
                    result = result - 4;
                    chuC--;
                    count++;
                } else if (result / 2 >= 1 && chuB != 0) {
                    result = result - 2;
                    chuB--;
                    count++;
                } else {
                    result = result - 1;
                    chuA--;
                    count++;
                }
            }
            if (check == 'Y')
                System.out.println(count - 1);
        }

}

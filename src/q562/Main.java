package q562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 크기 10의 배열 선언 */
        int[] num = new int[10];

        /* 짝수 합 */
        int evenSum = 0;

        /* 홀수 합 */
        int oddSum = 0;

        /* 홀수 평균 */

        /* 배열 값 입력받기 */
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        sc.close();

        /* sum 값 구하기 */
        for (int i = 0; i < num.length; i++)
            if (i % 2 == 0)
                oddSum = oddSum + num[i];
            else
                evenSum = evenSum + num[i];

        /* 홀수 평균 구하기 */
        float avg = (float) oddSum / 5;

        /* 출력 */
        System.out.println("sum : " + evenSum);
        System.out.printf("avg : %.1f", avg);
    }
}
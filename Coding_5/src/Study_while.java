import java.util.Scanner;

public class Study_while {
    public static void main(String[] args) {
        // TODO: 2020/10/02
        Scanner sc = new Scanner(System.in); // 사용자에게 입력값을 요구.
        int i = sc.nextInt();
        while (i < 10) { // i가 10보다 작을때 까지 실행
            System.out.println(i);
            i++;
        }


    }
}

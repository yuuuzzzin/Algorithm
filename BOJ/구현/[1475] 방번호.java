import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.next();

        int[] arr = new int[9]; // 0, 1, 2, 3, 4, 5, 6, 7, 8

        n = n.replace('9', '6'); // 9를 6으로 변경

        // 배열을 돌면서 해당 숫자 인덱스의 arr 값 1씩 더해주기
        for(int i = 0; i < n.length(); i++) {
            arr[n.charAt(i) - '0']++;
        }

        // 짝수인 경우 2로 나눈 몫, 홀수인 경우 2로 나눈 몫 + 1
        if(arr[6] % 2 == 0) arr[6] = (arr[6] / 2);
        else arr[6] = (arr[6] / 2) + 1;

        Arrays.sort(arr); // 배열을 오름차순 정렬
        System.out.println(arr[8]);

        s.close();
    }
}
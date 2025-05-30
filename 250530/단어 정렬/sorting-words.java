import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n 입력 
        int n = sc.nextInt();
        String[] wordList = new String[n];
        for (int i = 0; i < n; i++) { 
            wordList[i] = sc.neㅁxt();
        }

        Arrays.sort(wordList);
         for (int i = 0; i < n; i++) {
            System.out.println(wordList[i]);
        }
        // Please write your code here.
    }
}
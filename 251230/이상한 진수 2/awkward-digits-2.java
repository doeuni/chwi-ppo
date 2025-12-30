import java.util.Scanner;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String binary = sc.next();
        
        // 각 i번째 자릿수를 바꾸었을 때의 십진수 값 구하기
        int ans = INT_MIN;
        for(int i = 0; i < (int) binary.length(); i++) {
            // i번째 자리변경
            binary = binary.substring(0, i) + (char)('0' + '1' - binary.charAt(i)) + binary.substring(i + 1);
            // 십진수
            int num = 0;
            for(int j = 0; j < (int) binary.length(); j++)
                num = num * 2 + (binary.charAt(j) - '0');
            
            
            ans = Math.max(ans, num);
            
            binary = binary.substring(0, i) + (char)('0' + '1' - binary.charAt(i)) + binary.substring(i + 1);
        }
        
        System.out.print(ans);
    }
}

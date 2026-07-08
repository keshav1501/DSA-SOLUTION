import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            
            String column1 = (s1 + "               ").substring(0, 15);
            
            String numStr = "00" + x;
            String column2 = numStr.substring(numStr.length() - 3);
            
            System.out.println(column1 + column2);
        }
        
        System.out.println("================================");
        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
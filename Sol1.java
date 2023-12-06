import java.util.*;

class Sol1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }
    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}

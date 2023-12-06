import java.util.*;
class Sol2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer>ans=new ArrayList<>();
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)ar[i]=s.nextInt();
        ans=me(ar);
        System.out.println(ans);
    }
    public static List<Integer> me(int[] nums) {
        int can1 = 0, can2 = 0, c1 = 0, c2 = 0;
        for (int num : nums) {
            if (can1 == num) c1++;
            else if (can2 == num) c2++;
            else if (c1 == 0) {
                can1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                can2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = c2 = 0;
        for (int num : nums) {
            if (num == can1) c1++;
            else if (num == can2) c2++;
        }
        List<Integer> ans = new ArrayList<>();
        if (c1 > nums.length / 3) ans.add(can1);
        if (c2 > nums.length / 3) ans.add(can2);
        return ans;
    }
}
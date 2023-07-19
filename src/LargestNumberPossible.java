import java.util.*;

public class LargestNumberPossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println(largestPosiible(A,n));
    }
    public static String largestPosiible(int A[],int n)
    {
        String s[] = new String[n];
        for(int i=0;i<n;i++) {
            s[i] = String.valueOf(A[i]);
        }
        Arrays.sort(s,(a,b)->(a+b).compareTo(b+a));
        StringBuilder sb = new StringBuilder();
        for(int i=s.length-1;i>=0;i--)
        {
            sb.append(s[i]);
        }
        return sb.toString();
    }
}

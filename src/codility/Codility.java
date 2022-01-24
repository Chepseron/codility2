class GFG {
    static int freqCount(String str, char k) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == k) {
                count++;
            }
        }
        return count;
    }
// Function to find two numbers
// whose sum is N and do not
// contain any digit as k
    public int[] solution(int N) {
        int flag = 0;
        int k = 0;
        int[] values = new int[2];
        // Check every number i and (n-i)
        for (int i = 1; i < N; i++) {
            // Check if i and n-i doesn't
            // contain k in them print i and n-i
            if (freqCount(Integer.toString(i), (char) (k + 48)) == 0 && freqCount(Integer.toString(N - i), (char) (k + 48)) == 0) {
                System.out.print("(" + i + ", "
                        + (N - i) + ")");
                flag = 1;
                break;
            }
        }
        // Check if flag is 0
        // then print -1
        if (flag == 0) {
            System.out.print(-1);
        }
        return values;
    }
// Driver code
    public static void main(String[] args) {
        // Given N and K
        int N = 104;
        int K = 0;
        GFG gfb = new GFG();
        // Function call
        gfb.solution(N);
    }
}

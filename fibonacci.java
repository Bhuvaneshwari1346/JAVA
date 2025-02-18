public class fibonacci {import java.util.Arrays;

    public class Memo {
        int fib(int n,int[]memo){
            if(memo[n]!=-1) return memo[n];
            if(n<=1) return n;
            memo[n] = fib(n-1, memo)+fib(n-2,memo);
            return memo[n];
        }
        int fibonacci(int n) {
            int[] memo = new int[n + 1];
            Arrays.fill(memo, -1);
            return fib(n, memo);
        }
        public static void main(String[] args) {
            Memo memo = new Memo();
            int n = 7;
            System.out.println("Fibonacci(" + n + ") = " + memo.fibonacci(n));
        }
    }
    
}

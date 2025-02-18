import java.util.Arrays;
public class Memo {
    int fib(int n,int[]memo){
        if(memo[n]!=-1) return memo[n];
        if(n<=1) return n;
        memo[n] = fib(n-1, memo)+fib(n-2,memo);
        return memo[n];
    }
    public static void main(string args[]){
     int n=10;
     System.
    }
}
    



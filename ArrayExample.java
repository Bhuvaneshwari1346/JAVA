public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5}; 
        int n=2;
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");      
        }
        for (int i = n+1; i < numbers.length; i++) {
            System.out.print(numbers[i] +" ");
        }
}
}
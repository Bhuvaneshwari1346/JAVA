public class Smallestnumer {
    public class SmallestNumber {
        public static void main(String[] args) {
            int[] arr = {5, 3, 6, 4, 7, 2, 8};  
            int temp = arr[0]; 
    
            for(int i = 0; i < arr.length; i++) { 
                if(arr[i] < temp) {  
                    temp = arr[i];
                }
            }
    
            System.out.println("Smallest number: " + temp); 
        }
    }
    
}

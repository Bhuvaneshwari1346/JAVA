public class Sorting {
    public static void main(String[] args) {
        int[] arr = {8, 10, 1, 2, 4}; 
        int temp = arr[0]; 
        for (int i = 0; i < arr.length - 1; i++) { 
            if (arr[i + 1] < temp)
                temp = arr[i + 1];
        }
        System.out.println("Smallest element: " + temp); 
    }
}


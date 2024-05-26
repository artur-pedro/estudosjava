package sum_arrays;

class GFG {
 
    static int sum(int[] arr, int n)
    {
 
        // base or terminating condition
        if (n <= 0) {
            return 0;
        }
 
        // Calling method recursively
        return sum(arr, n - 1) + arr[n - 1];
    }
 
    public static void main(String[] args)
    {
 
        int arr[] = {709800, 8900, 4500, 500, 500, 550, 500, 550, 500, 550, 500, 500, 550, 500, 550, 500, 550, 500, 500, 550, 1650, 550, 1650, 550, 1650, 500, 1700, 500, 1700, 500, 1650, 550, 1650, 550, 1650, 550, 500, 500, 1700, 500, 550, 500, 1700, 500, 1650, 550, 500, 550, 1650, 500, 550, 500, 1700, 500, 550, 500, 1650, 550, 500, 550, 500, 550, 1650, 500, 550, 500, 1700, 500};
        int s = sum(arr, arr.length);
 
        System.out.println(s);
    }
}

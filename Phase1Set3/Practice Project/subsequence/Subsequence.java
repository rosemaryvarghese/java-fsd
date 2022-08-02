package subsequence;

class Subsequence {
    static int max; 
    static int subsequence(int array[], int n)
    {
        if (n == 1)
            return 1;
        int res, maxend = 1;
        for (int i = 1; i < n; i++) {
            res = subsequence(array, i);
            if (array[i - 1] < array[n - 1]
                && res + 1 > maxend)
                maxend = res + 1;
        }
        if (max < maxend)
            max = maxend;
 
        return maxend;
    }
    static int lis(int array[], int n)
    {
        max = 1;
        subsequence(array, n);
        return max;
    }
 
    public static void main(String args[])
    {
        int array[] = { 12, 22, 49, 3, 15, 51, 40, 98 };
        int l = array.length;
        System.out.println("Length of the longest increasing subsequence is " + lis(array, l)+ "\n");
    }
}

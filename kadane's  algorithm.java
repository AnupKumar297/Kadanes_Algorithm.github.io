class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        // Your code here
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0; i<n; i++)
        {
             cursum=cursum+arr[i];
            if(maxsum<cursum)
            {
                maxsum=cursum;
            }
            if(cursum<0)
            {
                cursum=0;
            }
            
        }
        return maxsum;
    }
    
}
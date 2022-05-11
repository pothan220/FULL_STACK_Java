'''
  Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 

Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
  '''
  
  class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int p1=0,p2=n-1,lmax=arr[0],rmax=arr[n-1];
        long ans=0;
        while(p1<p2)
        {
            if(arr[p1]<arr[p2])
            {
                p1++;
                lmax=Math.max(lmax,arr[p1]);
                ans+=lmax-arr[p1];
            }
            else
            {
                p2--;
                rmax=Math.max(rmax,arr[p2]);
                ans+=rmax-arr[p2];
            }
        }
        return ans;
    } 
}

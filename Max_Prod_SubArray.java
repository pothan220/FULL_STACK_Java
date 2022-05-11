'''
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
  '''
  // { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends
class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        if(n==1){
            return arr[0];
        }
    long res=1;
    long max_prod=arr[0];
    
    for(int i=0;i<n;i++){
       
         if(res==0){
            
             res=1;
       
        }res*=arr[i];
        if(res>max_prod){
            max_prod=res;
             } 
    
        }
        res=1;
        for(int j=n-1;j>=0;j--){
            res*=arr[j];
            if(res>max_prod){
                max_prod=res;
            }
            if(res==0){
                res=1;
            }
        }
    return max_prod;
        
    }
    
    }



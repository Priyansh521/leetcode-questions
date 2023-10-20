class Solution {
    public int findPoisonedDuration(int[] arr, int duration) {
     int a = arr.length;
     int neg = 0;
     for(int i = 0; i<a-1; i++){
         if(arr[i+1]-arr[i]<duration){
             neg += duration-(arr[i+1]-arr[i]);
         }
     }
     return a*duration -neg;
    }
}

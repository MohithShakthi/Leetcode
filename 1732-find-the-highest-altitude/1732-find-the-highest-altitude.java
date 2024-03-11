class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length+1;
        int[] arr=new int[n];
        arr[0]=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            arr[i+1]=sum;
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
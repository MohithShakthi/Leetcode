int countPairs(int* nums, int numsSize, int target){
    int i=0;
    int j=0;
    int count=0;
    for(i=0;i<numsSize-1;i++){
        for(j=i+1;j<numsSize;j++){
            if(nums[i]+nums[j]<target){
                count++;
            }
        }
    }
    return (count);
}
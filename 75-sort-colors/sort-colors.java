class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int checker=0;
        int high =nums.length-1;
        while(checker<=high){
            if(nums[checker]==0){
                swap(nums,low,checker);
                low++;
                checker++;



            }
            else if (nums[checker]==2){
                swap(nums,checker,high);
                high--;
            }
            else{
                checker++;
            }
        }
        
    }
    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
class Solution {
    public int[] getConcatenation(int[] nums) {
        int l =nums.length;
        int[] arr=new int [l*2];
        // for(int i=0;i<l*2;i++){
        //         arr[i]=nums[i%l];
        // }

        // for(int i=0;i<l;i++){
        //     arr[i]=nums[i];
        //     arr[i+l]=nums[i];
        // }

        System.arraycopy(nums,0,arr,0,l);
        System.arraycopy(nums,0,arr,l,l);

        return arr;
    }
}
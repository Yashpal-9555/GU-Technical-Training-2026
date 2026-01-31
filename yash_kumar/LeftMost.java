public class LeftMost {

    public static int MiddleMost(int[] nums){
        int leftsum=0;
        int totalsum =0;

        for(int i=0; i<nums.length; i++){
            totalsum+= nums[i];
        }

        for(int i=0; i<nums.length; i++){

            if(leftsum == totalsum - nums[i]){
             return i;
            }
            leftsum += nums[i];
            totalsum = totalsum - nums[i];
        }

        return -1;
    }

    public static void main(String args[]){

        int[] nums = {2, 3 , -1, 8 , 4};
        int[] nums1 = {1, -1, 4};

        System.out.println(MiddleMost(nums));
        System.out.println(MiddleMost(nums1));

     // Time complexity O(2n) or O(n)
     // Space complexity O(1)
    }
    
}

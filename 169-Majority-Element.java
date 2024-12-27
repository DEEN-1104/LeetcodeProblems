class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int Totalcount=0;
        int numberCount=0;
        for(int i=0;i<n;i++){
            if(Totalcount==0){
                numberCount=nums[i];
                Totalcount++;
            }
            else if(numberCount==nums[i]){
                Totalcount++;
            }
            else{
                Totalcount--;
            }
            
        }
        return numberCount;
    }

}
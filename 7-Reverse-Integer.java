class Solution {
    public int reverse(int x) {
        boolean flag=true;
        if(x>0){
            flag=false;
        }

        x=Math.abs(x);
        long rev=0;

        while(x>0)
        {
            rev=(rev*10)+(x%10);
            x=x/10;
            if(rev<Integer.MIN_VALUE ||rev>Integer.MAX_VALUE)return 0;
        }
        if(flag)
        {
            return -1*(int)rev;
        }

        return (int)rev;
        
    }
}
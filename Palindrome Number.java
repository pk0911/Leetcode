class Solution{
    public boolean isPalindrome(int x){
        if(x<0|| (x%10==0 && x!=0)){ //if x is not less than 0 and if the no is divisible by 10 but not 0 then return false
            return false;
        }
        int revnum=0;
        while(x>revnum){
            revnum=revnum*10+x%10;
            x=x/10;
        }
        return x==revnum || x==revnum/10;
    }
}
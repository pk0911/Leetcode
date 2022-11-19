class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;

        int[] result = new int[2] ;
        int number1 = 0;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            number1 = numbers[i];

            for(int j = i+1; j < len; j++)
            {

                sum = number1+numbers[j];       
                if(sum == target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }
        
        }
        return result;
    }
}



//Brute force method
class Solution{
    public int[] twoSum(int[] num,int target){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[j]==target-num[i]){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}


//Efficient solution using hashmap
class Solution{
    public int[] twoSum(int[] num,int target){
        int[] result=new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<num.length;i++){
            if(map.containsKey(target-num[i])){
                return new int[] {map.get(target-num[i]),i};
            }
            else{
                map.put(num[i],i);
            }
           
        }
         throw new IllegalArgumentException("No two sum solution");
    }
}
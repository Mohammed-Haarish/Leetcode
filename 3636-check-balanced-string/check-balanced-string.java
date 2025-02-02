class Solution {
    public boolean isBalanced(String num) {
        int [] arr=new int[num.length()];
        for(int i=0;i<num.length();i++)
        {
            arr[i]=num.charAt(i)-'0';
        }
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even=even+arr[i];
            }
            else{
                odd=odd+arr[i];
            }
        }

        if(odd==even){
            return true;
        }
     return false;
    }
}
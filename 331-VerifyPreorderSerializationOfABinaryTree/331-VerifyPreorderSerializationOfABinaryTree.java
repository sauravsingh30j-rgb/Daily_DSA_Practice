// Last updated: 04/10/2025, 01:43:17
class Solution {
    public boolean isValidSerialization(String preorder) {
       String[] preOrdr=preorder.split(",");
       int len=1;
       for(String i :preOrdr){
            len--;
            if(len<0) return false;

            if(!i.equals("#")){
                len+=2;
            }
       }
       return len==0;
    }
}
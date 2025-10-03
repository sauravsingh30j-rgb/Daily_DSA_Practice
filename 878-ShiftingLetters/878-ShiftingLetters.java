// Last updated: 04/10/2025, 01:42:18
class Solution {  
    public String shiftingLetters(String s, int[] shifts) {  
        StringBuilder sb = new StringBuilder(); 
        long sum = 0;  
        for (int i = 0; i < shifts.length; i++) {  
            sum += shifts[i];  
        }
         
        for (int i =0;i<shifts.length;i++) {  
            
              long c=(s.charAt(i)-'a'); 
              c=(c+sum)%26;  
            char ch=(char)(c+'a');
                if(ch>'z'){
                    ch=(char)(ch-26);
                }
                sb.append(ch);
            sum -= shifts[i]; 
            
        }  
        
        return sb.toString(); 
         }  
}
// Last updated: 01/07/2026, 00:08:39
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] freqArray=new int[26]; 
4        int left=0, maxFreq=0,longestSubstring=0;
5        for(int right=0;right<s.length();right++){  
6            char ch=s.charAt(right);
7            freqArray[ch-'A']++;
8            maxFreq=Math.max(maxFreq,freqArray[ch-'A']);
9            while((right-left+1)-maxFreq>k){
10                freqArray[s.charAt(left)-'A']--;
11                left++;
12            } 
13            longestSubstring=Math.max(right-left+1,longestSubstring);
14        }
15        return longestSubstring;
16    }
17}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxlength= 0;
        for(int end = 0;end<s.length();end++){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0)+1);

            while(map.get(c)>1){
                char d = s.charAt(start);
                map.put(d, map.get(d)-1);
                start++;
                
            }
            maxlength = Math.max(maxlength, end-start+1);



            

        }
        return maxlength;

        
    }
}
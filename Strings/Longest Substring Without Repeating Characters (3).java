class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxlength = Math.min(s.length(),1);
        Set<Character> seen = new HashSet<>();
        
        while(end < s.length())
        {
            char c = s.charAt(end);

            while(seen.contains(c)){
                seen.remove(s.charAt(start));
                start = start+1;
            }
            seen.add(c);
            int windowsize = end - start + 1;
            maxlength = Math.max(maxlength,windowsize);
            end = end +1;
        }
        return maxlength;
    }
}
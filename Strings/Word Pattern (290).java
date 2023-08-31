class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length)
        {
            return false;
        }
        HashMap<Character,String> in = new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            boolean containsKey = in.containsKey(ch);
            if(in.containsValue(arr[i]) && !containsKey)
            {
                return false;
            }
            if(containsKey && !in.get(ch).equals(arr[i]))
            {
                return false;
            }
            else
            {
                in.put(ch,arr[i]);
            }
           
        }
         return true;
}
}

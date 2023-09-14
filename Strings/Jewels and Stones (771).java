class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelcount =0;
        HashSet<Character> set = new HashSet<>();
        for(char i: jewels.toCharArray()){
            set.add(i);
        }
        for(char i:stones.toCharArray()){
            if(set.contains(i))
            jewelcount++;
        }
        return jewelcount;
    }
}
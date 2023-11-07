class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

         Map<String,List<String>> map = new HashMap<>();

         for(String str : strs){  //"eat"

             char ch[] = str.toCharArray(); //{e,a,t}
             Arrays.sort(ch);    //{a,e,t}

             String sortedstring = new String(ch); //"aet"

             if(map.containsKey(sortedstring) == false){ //"aet" not in map 
                 map.put(sortedstring,new ArrayList<>()); //aet & new ArrayList[eat,]
             }
             map.get(sortedstring).add(str); //add original str in arraylist
         }
         
         result.addAll(map.values()); //all values from map
         return result;   //return it
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set  = new HashSet<>(); //creating a hashset
        ArrayList<Integer> ans  = new ArrayList<>(); //creating array list

        for(int i=0;i<nums1.length;i++){ //i for nums1  
            set.add(nums1[i]);        //add nums1 first array at set
        }
        for(int i=0;i<nums2.length;i++){ //i for nums2
            if(set.contains(nums2[i])){  //if set contains nums2
                ans.add(nums2[i]);      //add nums2 to ans
                set.remove(nums2[i]);   //remove nums from set
            }
        }
        int [] arr = new int[ans.size()]; //new array arr created
        for(int i=0;i<ans.size();i++){    //to the size of ans ,i++
            arr[i] = ans.get(i);         //get element from ans 
        }
        return arr; //return array
    }
}
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Boolean> m= new HashMap<>();
        for(int item: nums){
            if(!m.containsKey(item))
                m.put(item,true);
            else
                return true;
        }
        return false;
    }
}
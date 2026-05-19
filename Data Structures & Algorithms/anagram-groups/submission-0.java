class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List> map = new HashMap<>();
        for(String item: strs){
            String anagram = sortString(item);
            List<String> temp;
            if(!map.containsKey(anagram)){
                temp = new ArrayList<>();

            }
            else{
                temp = map.get(anagram);

            }
            temp.add(item);
            map.put(anagram, temp);
        }
        for(String key: map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }

     public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }
}

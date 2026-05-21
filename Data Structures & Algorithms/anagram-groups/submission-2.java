class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> m = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String s2 = new String(arr);
            if(!m.containsKey(s2)){
                List<String> l = new ArrayList<>();
                l.add(s);
                m.put(s2, l);
            }
            else{
                List<String> l = m.get(s2);
                l.add(s);
            }
        }

        for(String key: m.keySet()){
            ans.add(m.get(key));
        }
        return ans;
        
    }
}

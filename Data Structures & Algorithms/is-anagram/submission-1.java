class Solution {
    public Map populateMap(Map<Character,Integer> m, String s){
        for(Character ss : s.toCharArray()){
            if(!m.containsKey(ss))
                m.put(ss,1);
            else{
                int val = m.get(ss);
                m.put(ss,val+1);
            }
        }
        return m;
    }
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();
        m1 = populateMap(m1,s);
        m2 = populateMap(m2,t);
        return m1.equals(m2);
    }

}

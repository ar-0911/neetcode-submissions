class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> s1 = new HashMap<>();
        Map<Character,Integer> t1 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
            t1.put(t.charAt(i),t1.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i = 0;i<s.length();i++){
            char tmp = s.charAt(i);
            int s1val = s1.getOrDefault(tmp,0);
            int t1val = t1.getOrDefault(tmp,0);
            if(s1val!=t1val)
                return false;
        }
        return true;

    }
}

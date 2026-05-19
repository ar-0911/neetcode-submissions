class Solution {
    public String Ssort(String s){
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    public boolean isAnagram(String s, String t) {
        String s1 = Ssort(s);
        String s2 = Ssort(t);
        if(s1.equals(s2)) return true;
        return false;
    }
}

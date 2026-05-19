class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open = n;
        int close = n;
        StringBuilder sb = new StringBuilder();
        generate(ans,open,close,sb,n);
        return ans;
    }

    private static void generate(List<String> ans, int open, int close, StringBuilder sb, int n){
        if((open == 0 && close == 0) || sb.length() == 2*n){
            ans.add(sb.toString());
            return;
        }
        else if(open == close){
            generate(ans,open-1,close,sb.append("("),n);
            sb.deleteCharAt(sb.length() - 1);
            return;
        }
        if(open>0){
            generate(ans,open-1,close,sb.append("("),n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(open<close){
            generate(ans,open,close-1,sb.append(")"),n);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}

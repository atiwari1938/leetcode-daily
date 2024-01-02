class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentc=0;
        int cookieidx=0;
        while(cookieidx<s.length && contentc< g.length){
            if((s[cookieidx]>=g[contentc])){
                contentc++;
            }
            cookieidx++;
        }
        return contentc;
        
    }
}
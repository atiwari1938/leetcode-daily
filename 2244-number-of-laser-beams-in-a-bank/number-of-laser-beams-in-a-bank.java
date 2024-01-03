class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0, ans=0;
        
        for(String s:bank){
            int occ=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    occ++;
                }
            }
            if(occ!=0){
                ans +=(prev*occ);
                prev=occ;
            }
        }
        return ans;

    }
}
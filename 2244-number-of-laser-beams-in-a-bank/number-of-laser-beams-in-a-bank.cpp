class Solution {
public:
    int numberOfBeams(vector<string>& bank) {
        int ans=0,prev=0;
        
        for(string s:bank){
            int occ=0;
            for(char c:s){
                if(c=='1'){
                    occ++;
                }
            }
            if(occ !=0){
                ans +=(prev*occ);
                prev=occ;
            }
        }
        return ans;
    }
};
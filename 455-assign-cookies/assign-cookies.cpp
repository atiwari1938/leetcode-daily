class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(),g.end());
        sort(s.begin(),s.end());
        int contentc=0;
        int cookieidx=0;
        while(cookieidx<s.size() && contentc<g.size()){
            if(s[cookieidx]>=g[contentc])
                contentc++;
            cookieidx++;
        }
        return contentc;
    }
};
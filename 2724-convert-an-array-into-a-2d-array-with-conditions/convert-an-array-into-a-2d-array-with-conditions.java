class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        int freq[] = new int[nums.length+1];
        
        ArrayList<List<Integer>> ans =new ArrayList<>();
        
        for(int i:nums){
            if(freq[i]>=ans.size()){
                ans.add(new ArrayList<>());
            }
        ans.get(freq[i]).add(i);
        freq[i]++;
    }
        return ans;
    }
    
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();   
        List<Integer> result = new ArrayList();
        int para = (nums.length/3);
        for( int x : nums){
            map.put(x , map.getOrDefault(x, 0)+1); 
        } 

        for (int key : map.keySet()){
            if(map.get(key) > para)
            result.add(key);
        }
        return result;
    }
}
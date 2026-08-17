class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int arr: nums){
            if(set.contains(arr)){
                return true;
            }
            set.add(arr);
        }
        return false;
    }
}
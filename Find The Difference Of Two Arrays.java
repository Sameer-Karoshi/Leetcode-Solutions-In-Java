class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0;i < nums1.length;i++){
            set1.add(nums1[i]);
        }
        List<Integer> temp1 = new ArrayList<>();
        for(int i: set1){
            int j = 0;
            for(j = 0;j < nums2.length;j++){
                if(i == nums2[j]){
                    break;
                }
            }
            if(j == nums2.length){
                temp1.add(i);
            }
        }
        list.add(temp1);
        
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0;i < nums2.length;i++){
            set2.add(nums2[i]);
        }
        List<Integer> temp2 = new ArrayList<>();
        for(int i: set2){
            int j = 0;
            for(j = 0;j < nums1.length;j++){
                if(i == nums1[j]){
                    break;
                }
            }
            if(j == nums1.length){
                temp2.add(i);
            }
        }
        list.add(temp2);
        return list;
    }
}

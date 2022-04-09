class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums.length==1){
            return nums;
        }
        
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int i = 0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
               map.put(nums[i],map.get(nums[i])+1);
           } else {
               map.put(nums[i],1);
           }
        }
        List<Pair> list = new ArrayList<>();
            for (Map.Entry<Integer,Integer> m : map.entrySet()){
                
                list.add(new Pair(m.getKey(),m.getValue()));
            }
        
        Collections.sort(list,new sortByFreq());
        
        int arr[] = new int[k];
        int x =0;
        for(Pair p: list){
            arr[x++] = p.value;
            k--;
            if(k==0){
                return arr;
            }
        }
        
        return nums;
    }
}

class Pair{
    int value;
    int freq;
    public Pair(int value,int freq){
        this.value = value;
        this.freq = freq;
    }
}

class sortByFreq implements Comparator<Pair>{
    @Override
    public int compare(Pair p1,Pair p2){
        if(p1.freq<p2.freq){
            return 1;
        }  else if(p1.freq==p2.freq){
            if(p1.value<p2.value){
                return 1;
            } else{
                return -1;
            }
        }
        
        return -1;
    }
}

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replace("!"," ");
        paragraph = paragraph.replace("?"," ");
        paragraph = paragraph.replace("'"," ");
        paragraph = paragraph.replace(","," ");
        paragraph = paragraph.replace(";"," ");
        paragraph = paragraph.replace("."," ");
        String[] arr = paragraph.split("\\s");
        //System.out.println(arr);
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            map.put(arr[i],0);
        }
        for(int i = 0;i < arr.length;i++){
            int val = map.get(arr[i]);
            val++;
            map.put(arr[i],val);
        }
        
        for(int i = 0;i < banned.length;i++){
            map.put(banned[i],-1);
        }
        //System.out.println(map);
        int max = 0;
        String result = "";
        for(int i = 0;i < arr.length;i++){
            int val = map.get(arr[i]);
            if(val > max && arr[i].length() > 0){
                max = val;
                result = arr[i];
            }
        }
        return result;
    }
}

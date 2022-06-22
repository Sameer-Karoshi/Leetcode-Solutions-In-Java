class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i < cpdomains.length;i++){
            String[] temp1 = cpdomains[i].split(" ");
            String[] temp2 = temp1[1].split("\\.");
            int freq = Integer.parseInt(temp1[0]);
            //System.out.println(freq);
            //System.out.println(temp1[1]);
            for(int j = 0;j < temp2.length;j++){
                String str = "";
                for(int k = j;k < temp2.length;k++){
                    str = str + temp2[k] + ".";
                }
                if(str.endsWith(".")){
                    str = str.substring(0,str.length()-1);
                    //System.out.println(str);
                    if(map.containsKey(str)){
                        int val = map.get(str);
                        val = val + freq;
                        map.put(str,val);
                    }
                    else{
                        map.put(str,freq);
                    }
                }
                else{
                   System.out.println(str);
                   if(map.containsKey(str)){
                        int val = map.get(str);
                        val = val + freq;
                        map.put(str,val);
                    }
                    else{
                        map.put(str,freq);
                    } 
                }
            }
        }
        //System.out.println(map);
        List<String> res = new ArrayList<>();
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            String str = Integer.toString(entry.getValue()) + " "+ entry.getKey();
            res.add(str);
        }
        return res;
    }
}

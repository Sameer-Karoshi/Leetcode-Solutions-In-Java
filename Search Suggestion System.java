class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();
        for(int i = 0;i < searchWord.length();i++){
            String temp = searchWord.substring(0,i+1);
            List<String> list = new ArrayList<>();
            for(int j = 0;j < products.length;j++){
                if(list.size() != 3 && products[j].startsWith(temp)){
                    list.add(products[j]);
                }
                else if(list.size() > 3){
                    break;
                }
            }
            result.add(list);
        }
        return result;
    }
}

class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
        String a = "a"; 
        for(int i = 0;i < arr.length;i++){
            if(arr[i].startsWith("a") || arr[i].startsWith("e") || arr[i].startsWith("i") || arr[i].startsWith("o") || arr[i].startsWith("u") || arr[i].startsWith("A") || arr[i].startsWith("E") || arr[i].startsWith("I") || arr[i].startsWith("O") || arr[i].startsWith("U")){
                arr[i] = arr[i] + "ma" + a.repeat(i+1);
            }
            else{
                char ch = arr[i].charAt(0);
                arr[i] = arr[i].substring(1) + ch + "ma" + a.repeat(i+1);
            }
        }
        
        String res = "";
        for(int i = 0;i < arr.length;i++){
            res = res + arr[i] + " ";
        }
        return res.trim();
    }
}

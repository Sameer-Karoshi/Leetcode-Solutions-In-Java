class Solution {
    public int longestPalindrome(String s) {
    HashSet<Character> oddCharacters = new HashSet<>();
    for(int i = 0; i<s.length(); i++){
        char c = s.charAt(i);
        if(oddCharacters.contains(c)){
            oddCharacters.remove(c);
        }else{
            oddCharacters.add(c);
        }
    }
    if(oddCharacters.size()>0)
        return s.length()-oddCharacters.size()+1;
    else
        return s.length();
    }
}

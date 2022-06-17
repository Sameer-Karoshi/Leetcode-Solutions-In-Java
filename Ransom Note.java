class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magarray = new int[26];
        for(int i = 0;i < magazine.length();i++){
            int ch = magazine.charAt(i);
            magarray[ch-97]++;
        }
        for(int i = 0;i < ransomNote.length();i++){
            int ch = ransomNote.charAt(i);
            if(magarray[ch-97] > 0){
                magarray[ch-97]--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

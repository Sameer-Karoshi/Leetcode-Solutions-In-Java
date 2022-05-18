class Solution {
    public int compress(char[] chars) {
        char curr = chars[0];
        int count = 1;
        StringBuilder str = new StringBuilder();
        for(int i=1; i<chars.length; i++) {
            if (chars[i] == chars[i-1]) {
                count++;
            } else {
                str.append(curr);
                if (count > 1) str.append(count);
                count = 1;
                curr = chars[i];
            }
        }
        str.append(curr);
        if (count > 1) str.append(count);
        char[] c = str.toString().toCharArray();
        for(int i=0; i<c.length; i++){
            chars[i] = c[i];
        }
        return c.length;
    }
}

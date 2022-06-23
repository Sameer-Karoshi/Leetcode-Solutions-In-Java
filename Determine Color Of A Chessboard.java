class Solution {
    public boolean squareIsWhite(String coordinates) {
        int letter = 'h' - coordinates.charAt(0);
        System.out.println(letter);
        int number = 8 - Character.getNumericValue(coordinates.charAt(1));

        return ((number % 2 == 0 && letter % 2 == 1) || (number % 2 == 1 && letter % 2 == 0));
    }
}

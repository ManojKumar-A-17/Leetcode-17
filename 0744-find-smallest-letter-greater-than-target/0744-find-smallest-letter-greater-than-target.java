class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // Arrays.sort(letters);
        char a = letters[0];
        for(char c:letters){
            if(c > target){
                a=c;
                break;
            }
        }
        return a;
    }
}
class Solution {
    public String reverseWords(String s) {
        List<String> part = new ArrayList<>();
            String[] rev=s.split(" ");
            for(String word:rev){
                if(!word.isEmpty()){
                    part.add(word);
                }
            }
        Collections.reverse(part);
        return String.join(" ",part);
    }
}
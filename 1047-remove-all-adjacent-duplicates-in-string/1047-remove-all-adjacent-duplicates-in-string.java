class Solution {
    public String removeDuplicates(String s) {
        char[] a = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char e:a){
            if(!st.isEmpty() && st.peek() == e){
                st.pop();
            }
            else{
                st.push(e); 
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}
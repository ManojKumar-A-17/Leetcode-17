class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            st.push(c);
            if(st.peek() == '*'){
                st.pop();
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        List<Character> l = st.stream().collect(Collectors.toList());
        System.out.println("Using Stack: ");
        for(int i=0;i<l.size();i++){
            sb.append(l.get(i));
        }
        return sb.toString();
    }
}
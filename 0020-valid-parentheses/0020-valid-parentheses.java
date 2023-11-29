class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));

        for(int i = 1 ; i < s.length() ; i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                else if(s.charAt(i) == ')' && st.peek() == '('){
                    st.pop();
                }
                else if(s.charAt(i) == ']' && st.peek() == '['){
                    st.pop();
                }
                else if(s.charAt(i) == '}' && st.peek() == '{'){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        return st.isEmpty();







        //  Stack<Character> st = new Stack<>();
        // st.push(s.charAt(0));
        
        // for(int i = 1 ; i < s.length() ; i++){
        //     if(s.charAt(i) == ')' && st.peek() == '(' ){
        //         st.pop();
        //     }
        //     else if (s.charAt(i) == ']' && st.peek() == '[' ){
        //         st.pop();
        //     } 
        //     else if (s.charAt(i) == '}' && st.peek() == '{'){
        //         st.pop();
        //     }
        //     else{
        //         st.push(s.charAt(i));
        //     }
        // }
        
        // if(st.isEmpty()){
        //    return true;
        // }

        // return false;
    }

}
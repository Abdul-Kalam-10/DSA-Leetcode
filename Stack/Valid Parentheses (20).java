class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(')
                stack.push(ch);
            else{
                if(stack.isEmpty()) return false;
                
            if(ch == '}')
            {
                if(stack.peek() == '{')
                stack.pop();
                else return false;
            }
            if(ch == ']')
            {
                if(stack.peek() == '[')
                stack.pop();
                else return false;
            }
            if(ch == ')')
            {
                if(stack.peek() == '(')
                stack.pop();
                else return false;
            }
        }
    }
    if(stack.size()==0) return true;
    else return false;
}
}

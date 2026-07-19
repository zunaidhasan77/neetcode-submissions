class Solution {
    public boolean isValid(String s) {

        Stack<Character> characterStack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c =='(') characterStack.push(')');

            else if (c =='{') characterStack.push('}');

            else if (c == '[') characterStack.push(']');

            else{
                if (characterStack.isEmpty() || characterStack.pop() !=c){
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
        
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int firstOperand = stack.pop();
                    int secondOperand = stack.pop();
                    stack.push(secondOperand - firstOperand);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int firstOperand2 = stack.pop();
                    int secondOperand2 = stack.pop();
                    stack.push(secondOperand2 / firstOperand2);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

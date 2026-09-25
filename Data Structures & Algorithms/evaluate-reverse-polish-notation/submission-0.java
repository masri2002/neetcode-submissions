
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token) && stack.size() >= 2) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(n1 + n2);
                        break;
                    case "-":
                        stack.push(n2 - n1);
                        break;
                    case "/":
                        stack.push(n2 / n1);
                        break;
                    case "*":
                        stack.push(n2 * n1);
                        break;
                }
            } else if (!isOperator(token)) {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.peek();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}

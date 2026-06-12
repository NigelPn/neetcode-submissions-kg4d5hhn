class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int r ;
        int l ;
        for (String c : tokens){
            switch(c){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "-":
                    r = stack.pop();
                    l = stack.pop();
                    stack.push(l - r);
                    break;
                case "/":
                    r = stack.pop();
                    l = stack.pop();
                    stack.push(l / r);
                    break;
                default:
                    stack.push(Integer.parseInt(c));
                    break;
            }
        } 
        return stack.pop();
    }
}

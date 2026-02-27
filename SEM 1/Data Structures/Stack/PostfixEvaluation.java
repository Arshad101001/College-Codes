public class PostfixEvaluation {
    static int top = -1;

    public static int pop(int[] stack) {
        int num = stack[top];
        stack[top--] = 0;
        return num;
    }

    public static void main(String[] args) {
        String str = "12 3 4 * + 5 -";
        System.out.println("Postfix expression is: " + str);

        int[] stack = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                // use first method if your expression contain only single digit number else use second method that work for both

                // first method
                // stack[++top] = ((int) (str.charAt(i)) - 48);

                // second method
                int num = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }
                i--;
                stack[++top] = num;

            } else {
                int num1;
                int num2;
                switch (str.charAt(i)) {
                    case '+':
                        num2 = pop(stack);
                        num1 = pop(stack);
                        stack[++top] = num1 + num2;
                        break;

                    case '-':
                        num2 = pop(stack);
                        num1 = pop(stack);
                        stack[++top] = num1 - num2;
                        break;

                    case '*':
                        num2 = pop(stack);
                        num1 = pop(stack);
                        stack[++top] = num1 * num2;
                        break;

                    case '/':
                        num2 = pop(stack);
                        num1 = pop(stack);
                        stack[++top] = num1 / num2;
                        break;

                    default:
                        break;
                }
            }
        }
        System.out.println("Value of the postfix expression is: " + stack[0]);
    }
}

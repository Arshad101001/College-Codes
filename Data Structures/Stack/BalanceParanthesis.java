public class BalanceParanthesis {
    static int top = -1;
    static boolean status = true;

    public static void main(String[] args) {
        String str = "((1+2)*3";
        char[] stack = new char[str.length()];
        String open = "{[(}";
        for (int i = 0; i < str.length(); i++) {
            if (open.contains(String.valueOf(str.charAt(i)))) { // it allows only opening brackets
                stack[++top] = str.charAt(i);
            } else {
                switch (str.charAt(i)) {
                    case '}':
                        if (top >= 0) {
                            if (stack[top] == '{') {
                                top--;
                            } else {
                                status = false;
                            }
                        } else status = false;
                        break;

                    case ']':
                        if (top >= 0) {
                            if (stack[top] == '[') {
                                top--;
                            } else {
                                status = false;
                            }
                        } else status = false;

                        break;

                    case ')':
                        if (top >= 0) {
                            if (stack[top] == '(') {
                                top--;
                            } else {
                                status = false;
                            }
                        } else status = false;
                        break;

                    default:
                        break;
                }
            }
        }

        if (status && top < 0) {
            System.out.println("It is balanced");
        } else {
            System.out.println("It is not balanced");
        }
    }
}

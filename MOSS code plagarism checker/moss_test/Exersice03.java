package lab3;
import java.util.Scanner;
public class Exersice03 {
    // 1. We include our trusty CharStack class from the previous exercise
    static class CharStack {
        private int maxSize;
        private char[] stackArray;
        private int top;

        public CharStack(int size) {
            this.maxSize = size;
            this.stackArray = new char[maxSize];
            this.top = -1;
        }

        public void push(char item) {
            top++;
            stackArray[top] = item;
        }

        public char pop() {
            char poppedItem = stackArray[top];
            top--;
            return poppedItem;
        }

        public boolean isEmpty() {
            return (top == -1);
        }
    }

    public static boolean isBalanced(String str) {
        CharStack stack = new CharStack(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char topChar = stack.pop();

                if ((ch == ')' && topChar != '(') ||
                        (ch == '}' && topChar != '{') ||
                        (ch == ']' && topChar != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression with parentheses:");
        String input = scanner.nextLine();

        if (isBalanced(input)) {
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression has imbalanced parentheses.");
        }
    }
}
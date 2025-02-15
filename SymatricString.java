import java.util.*;
class SymatricString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input String from the user
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() / 2; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == '[') {
                char c = stack.peek();
                if (c == ']') {
                    stack.pop();
                } else {
                    break;
                }
            }
            if (s.charAt(i) == '(') {
                char c = stack.peek();
                if (c == ')') {
                    stack.pop();
                } else {
                    break;
                }
            }
            if (s.charAt(i) == '{') {
                char c = stack.peek();
                if (c == '}') {
                    stack.pop();
                } else {
                    break;
                }
            }
        }
        if (stack.size() == 0) {
            System.out.println("Your String is Symatric");
        } else {
            System.out.println("Your String is Not Symatric");
        }
    }
}

// import java.util.*;
// class SymmetricString {
//     public static boolean isSymmetric(String s) {
//         Stack<Character> stack = new Stack<>();
//         Map<Character, Character> bracketPairs = Map.of(')', '(', ']', '[', '}', '{');
//         for (char ch : s.toCharArray()) {
//             if (bracketPairs.containsValue(ch)) {
//                 stack.push(ch); // Push opening brackets
//             } else if (bracketPairs.containsKey(ch)) {
//                 if (stack.isEmpty() || stack.pop() != bracketPairs.get(ch)) {
//                     return false; // Mismatch found
//                 }
//             }
//         }
//         return stack.isEmpty(); // If empty, it's symmetric
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String: ");
//         String input = sc.nextLine();
//         sc.close();
//         if (isSymmetric(input)) {
//             System.out.println("Your String is Symmetric");
//         } else {
//             System.out.println("Your String is Not Symmetric");
//         }
//     }
// }

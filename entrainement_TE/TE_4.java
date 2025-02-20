import java.util.Stack;

interface Components {
    
}


class TE {
    private static /* ... */ parse(String s) {
        Stack</* ... */> stack = new Stack<>();

        String[] tokens = s.split("\\s+");

        for (String token : tokens) {
            /* ... */ current = null;
            if (token.matches("-?\\d+")) {
                int i = Integer.parseInt(token);
                /* ... */
                ;
            } else {
                /* ... */ b = stack.pop();
                /* ... */ a = stack.pop();
                switch (token.charAt(0)) {
                    case '+':
                        /* ... */
                        ;
                        break;
                    case '-':
                        /* ... */
                        ;
                        break;
                    case 'x':
                        /* ... */
                        ;
                        break;
                    case '/':
                        /* ... */
                        ;
                        break;
                }
            }
            stack.push(current);
        }
        return stack.pop();
    }

    private static void test(String input, int result) {
        int val = parse(input).evaluate();
        System.out.printf("%s -> %d : ys%b\n",
                input, val, val == result);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            test("0", 0);
            test("1 2 +", 3);
            test("-4 5 +", 1);
            test("5 2 /", 2);
            test("5 1 2 + 4 x 3 - +", 14);
            test("10 2 + 3 2 x /", 2);
            test("4 2 5 x + 1 3 2 x + /", 2);
        } else {
            String s = String.join(" ", args);
            /* ... */ expression = parse(s);

            System.out.println(expression);
            System.out.println("Result: " + expression.evaluate());
        }
    }
}

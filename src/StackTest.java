import java.util.Scanner;

public class StackTest {

    public static boolean isBalanced(String s)
    {
        StackReferenceBased stack = new StackReferenceBased();

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (ch == '{')
            {
                stack.push(ch);
            }
            else if (ch == '}')
            {
                if (stack.isEmpty())
                {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StackReferenceBased stack = new StackReferenceBased();

        int choice = 0;

        while (choice != 6)
        {
            System.out.println();
            System.out.println("Welcome to StackTest! Please select a number from the list.");
            System.out.println("1. Push a string on to the stack");
            System.out.println("2. Pop a string from the stack");
            System.out.println("3. Peek at the top of the stack");
            System.out.println("4. Empty the stack");
            System.out.println("5. Check if a string has balanced brackets.");
            System.out.println("6. Quit the program");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1)
            {
                System.out.print("Enter a string: ");
                String s = input.nextLine();

                stack.push(s);
                stack.displayStack();
            }
            else if (choice == 2)
            {
                if (!stack.isEmpty())
                {
                    System.out.println("Popped: " + stack.pop());
                }
                else
                {
                    System.out.println("Stack is empty.");
                }

                stack.displayStack();
            }
            else if (choice == 3)
            {
                if (!stack.isEmpty())
                {
                    System.out.println("Top: " + stack.peek());
                }
                else
                {
                    System.out.println("Stack is empty.");
                }

                stack.displayStack();
            }
            else if (choice == 4)
            {
                stack.popAll();
                System.out.println("Stack has been emptied.");
                stack.displayStack();
            }
            else if (choice == 5)
            {
                System.out.print("Enter a string: ");
                String s = input.nextLine();

                if (isBalanced(s))
                {
                    System.out.println("The brackets are balanced.");
                }
                else
                {
                    System.out.println("The brackets are not balanced.");
                }

                stack.displayStack();
            }
            else if (choice == 6)
            {
                System.out.println("Goodbye!");
            }
            else
            {
                System.out.println("Invalid choice.");
                stack.displayStack();
            }
        }

        input.close();
    }
}
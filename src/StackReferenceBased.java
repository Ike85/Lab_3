public class StackReferenceBased implements StackInterface
{
    private Node top;

    public StackReferenceBased()
    {
        top = null;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void push(Object newItem)
    {
        top = new Node(newItem, top);
    }

    public Object pop()
    {
        if (!isEmpty())
        {
            Node temp = top;
            top = top.getNext();
            return temp.getItem();
        }
        else
        {
            return null;
        }
    }

    public void popAll()
    {
        top = null;
    }

    public Object peek()
    {
        if (!isEmpty())
        {
            return top.getItem();
        }
        else
        {
            return null;
        }
    }

    public void displayStack()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            Node current = top;

            while (current != null)
            {
                System.out.println(current.getItem());
                current = current.getNext();
            }

            System.out.println("TOP");
        }
    }
}
// Copyright(c) 2016 Hung Ta
//
package SE330;

// Generic singly linked list class with head reference only
//
public class SLList
{
    protected SLLNode head = null;
    public SLList()
    {

    }
    public String toString()
    {
        String s = "";
        for (SLLNode tmp = head; tmp != null; tmp = tmp.next)
        {
            s += tmp.info.toString();
            if (tmp.next != null)
                s += ", ";
        }
        return s;
    }
    public void add(Object el)
    {
        head = new SLLNode(el,head);
    }
}

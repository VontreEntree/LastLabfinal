// Copyright(c) 2016 Hung Ta
// Modified by Josh
package SE330;

public class SLLNode
{
    public Object info;
    public SLLNode next;
    public SLLNode()
    {
        next = null;
    }
    public SLLNode(Object el)
    {
        info = el; next = null;
    }
    public SLLNode(Object el, SLLNode ptr)
    {
        info = el; next = ptr;
    }
}

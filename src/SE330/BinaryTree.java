// Copyright(c) 2016 Hung Ta
// Modified by Josh
// Simple binary tree interface

package SE330;

abstract public class BinaryTree
{
    protected BinaryTreeNode root = null;

    public BinaryTree()
    {

    }
    public boolean isEmpty()
    {
        return root == null;
    }

    abstract public Comparable search(Comparable el);
    abstract public void insert(Comparable el);
    abstract public void delete(Comparable el);

    public void inorder()
    {
        inorder(root);
    }

    ///////////////////////////////////////////////////////////////////

    // override visit() to implement node processing logic
    protected void visit(BinaryTreeNode p)
    {
        System.out.print(p.el + " ");
    }

    protected void inorder(BinaryTreeNode p)
    {
        if (p != null)
        {
            inorder(p.left);
            visit(p);
            inorder(p.right);
        }
    }

    ///////////////////////////////////////////
    // Pretty-print the tree - this code is modified from sample code on stackoverflow
    public StringBuilder toString(BinaryTreeNode node, StringBuilder prefix, boolean isNoMoreChild, StringBuilder sb) {
        if (node.right != null)
        {
            toString(node.right, new StringBuilder().append(prefix).append(isNoMoreChild ? "│   " : "    "), false, sb);
        }
        sb.append(prefix).append(isNoMoreChild ? "└── " : "┌── ").append(node.el.toString()).append("\n");
        if (node.left != null)
        {
            toString(node.left, new StringBuilder().append(prefix).append(isNoMoreChild ? "    " : "│   "), true, sb);
        }
        return sb;
    }

    @Override
    public String toString()
    {
        return this.toString(root, new StringBuilder(), true, new StringBuilder()).toString();
    }
}

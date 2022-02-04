package com.sparta.Sorting.Model;

public class BinaryTreeSearch implements SortInterface{
    @Override
    public SortInterface getInstance() {
        return new BinaryTreeSearch();
    }
    public node root;

    private void addVoid(int value)
    {
        node newNode = new node(value);
        if (root == null)
        {
            root = newNode;
        }
        else
        {
            node focus = root;

            node parent;
            while(true)
            {
                parent = focus;

                if(value < focus.value)
                {
                    focus = focus.leftChild;

                    if(focus == null)
                    {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else
                {
                    focus = focus.rightChild;
                    if(focus == null)
                    {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }
    private void inOrderTraverseTree(node focusNode)
    {
        if(focusNode != null)
        {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }
    public void buildTree(int[] incoming)
    {
        for (int i: incoming)
        {
            addVoid(i);
        }
    }
    @Override
    public void sort(int[] incoming) {
        buildTree(incoming);
        inOrderTraverseTree(root);
    }

    public class node
    {
        int value;
        node leftChild;
        node rightChild;
        node(int incoming)
        {
            value = incoming;
        }

        public String toString()
        {
            String amount = Integer.toString(value);
            return amount;
        }
    }
}



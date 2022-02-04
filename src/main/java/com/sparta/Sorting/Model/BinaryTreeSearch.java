package com.sparta.Sorting.Model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeSearch implements SortInterface{
    @Override
    public SortInterface getInstance() {
        return new BinaryTreeSearch();
    }
    public node root;
    @Override
    public String toString()
    {
        return "Binary Tree Search";
    }
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

                if(value <= focus.value)
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
    List<Integer> treeRebuild;

    private void inOrderTraverseTree(node focusNode)
    {
        if(focusNode != null)
        {
            inOrderTraverseTree(focusNode.leftChild);
            treeRebuild.add(focusNode.value);
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
        treeRebuild = new LinkedList<Integer>();
        inOrderTraverseTree(root);
        int j = 0;
        for (int i:
             treeRebuild) {

            incoming[j] = i;
            j++;

        }


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



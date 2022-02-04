#Sorting manager
This is an application that takes in an array, and sorts them in the way chosen by the user by a predefined set of sorting methods
##How to use it.
Clone a copy to your local machine, and run the display manager. You will need to enter a few pieces of information. The first is the amount of sorting types you would like to use. You can use everyone if you would like, however the system will not run the same sort multiple times. 
Then it will request the amount of numbers you would like to sort, followed by the elements that need sorting. The size of the list needs to be more than 0 or it will not continue.


##The Sorting Methods
The following are the available different sorting methods. As well as this, 

###Bubble Sort
The bubble sort goes through each of the integers in the array and compares it to the next, if it is bigger it swaps place, otherwise it leaves it. Once it has ran through the whole list and has no changes, it is complete.
````
while(swapping)
        {
            swapping = false;
            for (var i = 0; i < array.length-1; i++)
            {
                if(array[i] > array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapping = true;
                }
            }
        }
````

###Merge Sort
The merge sort is a little more complex. It continuely halfs the list until we are down to sets of two. Then it sorts each of the sets, and then places them back in order. In a divide and conquer technique. For more information on how this works see here: [Merge Sort](https://www.bbc.co.uk/bitesize/guides/z7kkw6f/revision/10#:~:text=A%20merge%20sort%20is%20a,placed%20into%20order%20and%20combined.) 

This is broken down into two different methods. The first is the sort that breaks the list and sorts is
````
int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        sort(leftHalf);
        sort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
````

Then the merge method is done at the end to bring it all back together.
````
int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
````
###Binary Tree Search
The final method provided is the Binary Tree search. This creates an unequal tree out of the numbers, starting with the first one as the root node. It then proceeds to place any smaller numbers on the left branch, and any larger numbers on the right branch. Making sure to move through the children so that each element only has two children at most. For more information on this you can see here: [Video](https://www.youtube.com/watch?v=M6lYob8STMI)

This was implemented first of all by creating the tree by adding each node to it using a for loop
````
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
````

Then we need a simple way to be able to traverse the new tree. This will go down to the furthers left node and print it, then move right before moving back up again, then move onto the right branch. 
````
 if(focusNode != null)
        {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
````
###How to add extras.
If you wish to add your own methods, this is fairly simple. The first is to make sure that the class you create inherits the SortInterface and implements all the methods. The getInstance method should return a new instance of your class.
You will need to make sure that the Sort Factory has your method included in the enum, and it is added to the return sort method.

If this is done, the user interface should be able to pick up this is availabe and make sure of it.


##Timing
For each method you can get back timing information, within the test folder there are some example timing tests of the provided sort methods to demonstrate the strength of the sorting methods at different lengths.

##Testing
Testing has been done through the model view with a 90% code coverage. Testing was done on each of the classes individually, then again on the sorting manager and factory to make sure the classes are used properly.
USer interface is not covered in this but has gone through manual testing.

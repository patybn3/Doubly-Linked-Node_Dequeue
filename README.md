<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 4 - Exercise 34 - c</h5>

####variables used:

```java
    protected LLNode<T> front;     // reference to the front of this queue
    protected LLNode<T> rear;      // reference to the rear of this queue
    protected int numElements = 0; // number of elements in this queue
    String getString = "";         // used to print the items as a string
    LLNode<T> newNodeBack;         // node for rear enqueue
    LLNode<T> newNodeFront;        // node for front queue
    T element;                     // front dequeue
    LLNode<T> element;             // rear dequeue

```

###Methods added to `DeQue.java` as required:

34) This exercise shares some content with Exercises 15 and 24. Create a class that
    implements the DequeInterface and a test driver that demonstrates it works
    correctly:
    
c. Create a doubly linked list–based implementation. Use the DLLNode class for
the nodes.

####added files from book:

- DLLNode.java      // doubly-linked node config
- QueueOverflowException.java
- QueueUnderflowException.java
- DequeInterface.java

`String toString()` creates and returns a string that correctly represents
the current queue. Such a method could prove useful for testing and debugging
the class and for testing and debugging applications that use the class. Assume
each stacked element already provided its own reasonable `toString` method.<br>
```java
    public String toString();     //will loop the array, turn it to a string and print it
```

```java
    //adding elements to the front and the rear    
    void enqueueFront(T element) throws QueueOverflowException;
    void enqueueRear(T element) throws QueueOverflowException;
    //removing elements from the front and the rear
    T dequeueFront() throws QueueUnderflowException;
    T dequeueRear() throws QueueUnderflowException;

    boolean isFull();
    boolean isEmpty();
    int size();
```

###Main class: Chapter4_34_PatriciaAntlitz.java

<hr>
<h5>Problems:</h5>

This problem is an adaptation of problem 24. This was extremely easy to convert.

<hr>

<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Chapter4_34_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../Chapter4_34_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac Chapter4_34_PatriciaAntlitz.java => compile
    * java Chapter4_34_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)

import java.util.*;

public class DoublyLinkedList
{
  private Node start=null; // Start node of the list
  private Node end=null;  // End Node of the list
  private int size=0; // Size of the list

  public void addFirst(Object t)
  {
    Node tmpNode=new Node(null,t,start);// Creates a new node with a previous of null, an object of t and a next of start
    if(start==null){end=tmpNode;} // If start is null, end will be the node
    else{start.prev=tmpNode;} // Else the previous is the node
    start=tmpNode; // Sets start to the created node
    size+=1; // Adds one to size
  }

  public Object removeFirst()
  {
    if(start==null){throw new NoSuchElementException();} // Checks to see if there is a first to remove
    else // If there is
    {
      Object tmpObj=start.data; // creates a temp object of the start data
      start=start.next; // Sets start to start.next
      if(start==null){end=null;} // If start is null then end should also be null
      else{start.prev=null;} // Else the previous is null
      size-=1; // Subtracts 1 from the size
      return tmpObj; // Returns the temp object
    }
  }

  public Object getFirst()
  {
    if(start==null){throw new NoSuchElementException();} // Checks to see if there is a first to get
    else{return start.data;}// If there is then return the start data
  }

  public void addLast(Object t)
  {
    Node tmpNode=new Node(end,t,null);// Creates a new node with a previous of null, an object of t and a next of start
    if(end==null){end=tmpNode;} // If the end is null, end is the temp node
    else{end.next=tmpNode;} // Else end.next is the new node
    end=tmpNode; //  Sets end to created node
    size+=1; // Add one to size
  }

  public Object removeLast()
  {
    if(end==null){throw new NoSuchElementException();} // Checks if there is a node to remove
    else // If there is
    {
      Object tmpObj = end.data; // Creates a temp obj to store end data
      end = end.prev; // Sets end to end previous
      if (end == null) {start=null;} // If end is null start is null
      else{end.next = null;} // Else end next is null
      size-=1; // Subtracts one from size
      return tmpObj; // Returns removed data
    }
  }
  public Object getLast()
  {
    if(end==null){throw new NoSuchElementException();} // Checks if there is an end to get
    else{return end.data;}// If so return data
  }
  public int getSize(){return size;} // returns the size

  public ListIterator listIterator(){return new DoublyLinkedListIterator();}// Returns a new DoublyLinkedListIterator

  class Node
  {
    public Node next; // Node for keeping track of next
    public Node prev;// Node for keeping track of previous
    public Object data; // Data of the node
    public Node(Node previousNode,Object data,Node nextNode)
    {
      this.data=data;//Sets this.data to data that is inputted
      next=nextNode; // sets next to the nextNode
      prev=previousNode; // sets prev to the previousNode
    }
  }

  class DoublyLinkedListIterator implements ListIterator
  {
    private boolean inext=false; // Iterator next
    private Node currentPosition=null; // Node to keep track of current position
    private boolean iprev=false; // Iterator previous
    private int index=0; // Index of the iterator

    public int getIndex(){return index;} // Returns the index

    public Object next()
    {
      if(!hasNext()){throw new NoSuchElementException();}// Checks if there is a next to go to
      inext=true; // Sets iterator next to true
      iprev=false; // Sets iterator previous to false
      if(currentPosition==null){currentPosition=DoublyLinkedList.this.start;} // If curent Positon is null, set it to the lists start
      else{currentPosition=currentPosition.next;} // Else currentPositon is current positions next
      index+=1; // Adds one to index
      return currentPosition.data; // Returns the current data
    }

    public boolean hasNext()
    {
      if(currentPosition==null){return DoublyLinkedList.this.start!=null;} // If the current position is null, check to see if the start is not null
      else{return currentPosition.next!=null;} // Else check is .next is not null
    }

    public Object previous()
    {
      if(!hasPrevious()){throw new NoSuchElementException();} // IF does not have previous
      inext=false; // iterator next is false
      iprev=true; // iterator previous is true
      Object tmpObj=currentPosition.data; // Creates an object to return
      currentPosition=currentPosition.prev; // Sets current position to previous
      index-=1; // Subtracts one from index
      return tmpObj; // Returns temp object
    }

    public boolean hasPrevious(){return currentPosition!=null;}// checks if current postion is not null

    public void add(Object t)
    {
      if(currentPosition==null) //Checks if current position is null
      {
        DoublyLinkedList.this.addFirst(t); // If so does addFirst
        currentPosition=DoublyLinkedList.this.start; // Sets current position to list start
      }
      else
      {
        Node tmpNode=new Node(currentPosition,t,currentPosition.next); // Else creates a temp node
        tmpNode.prev.next=tmpNode; // Temp node previous next is temp node
        tmpNode.next.prev=tmpNode; // Temp node next previous is temp node
        currentPosition=tmpNode; // Current position is temp node
      }
      index+=1; //Adds one to index
      inext=false; // Sets iterator next to false
      iprev=false;// Sets iterator previous to false
    }

    public void remove()
    {
      Node tmpNode=previousPos();// Gets previous position and creates temp Node
      if(tmpNode==DoublyLinkedList.this.start){DoublyLinkedList.this.removeFirst();} // If temp node is start do remove first
      else if(tmpNode==DoublyLinkedList.this.end){DoublyLinkedList.this.removeLast();}// If temp node is end do remove last
      else
      {
        tmpNode.prev.next=tmpNode.next;// Temp node previous next is temp node next
        tmpNode.next.prev=tmpNode.prev;// Temp node next previous is temp node previous
      }
      if(inext){currentPosition=currentPosition.prev;} // If inext is true currentPosition is currentPosition previous
      index-=1; // subtracts one from index
      inext=false;// Sets iterator next to false
      iprev=false;// Sets iterator previous to false
    }
    public void set(Object t){currentPosition.data=t;} // Sets current position data to Object t

    private Node previousPos()
    {
      if(!inext&&!iprev){throw new IllegalStateException();} // If not iterator next and not iterator previous, throw exception
      else if(inext){return currentPosition;} // Else if iterator next is tru return currentPosition
      else
      {
        if(currentPosition==null){return DoublyLinkedList.this.start;} // Else if currentPosition is null return list start
        else{return currentPosition.next;} // Else return currentPosition next
      }
    }
  }
}

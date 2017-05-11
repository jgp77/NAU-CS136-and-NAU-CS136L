package linkedlistpkg;
import static org.junit.Assert.*;
import org.junit.Test;

/**
Tests the functionality of the LinkedList class and
the functionality of the FaultyLinkedList class. Tests
these two by adding two objects to a LinkedList, stores
the first object as temp using .getFirst(), removes the
first object by using .removeFirst(), and finally
compares the new .getFirst() to the stored temp object
*/

public class LinkedTester
{
  /**
  Tests if the .addFirst(), .removeFirst(), and
  .getFirst() methods are functioning properly
  @param faultylist Linked list using FaultyLinkedList class
  @param temp stores .getFirst() object before .removeFirst()
  @return assertFalse if temp equals new .getFirst()

  */
  @Test
  public void testFaulty()
  {
    FaultyLinkedList faultylist = new FaultyLinkedList();
    faultylist.addFirst("Jim");
    faultylist.addFirst("Tim");
    Object temp=faultylist.getFirst();
    faultylist.removeFirst();
    assertFalse("Function is not correct.",temp.equals(faultylist.getFirst()));
  }

  /**
  Tests if the .addFirst(), .removeFirst(), and
  .getFirst() methods are functioning properly
  @param list Linked list using LinkedList class
  @param temp stores .getFirst() object before .removeFirst()
  @return assertFalse if temp equals new .getFirst()
  */
  @Test
  public void testFunctioning()
  {
    LinkedList list = new LinkedList();
    list.addFirst("Jim");
    list.addFirst("Tim");
    Object temp=list.getFirst();
    list.removeFirst();
    assertFalse("Function is not correct.",temp.equals(list.getFirst()));
  }
}

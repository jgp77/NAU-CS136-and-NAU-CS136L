public class DLLTester
{

  public static void main(String[] args)
  {
    DoublyLinkedList list=new DoublyLinkedList();
    list.addFirst("George");
    list.addFirst("Harry");
    list.addFirst("Tim");
    list.addFirst("Jim");
    ListIterator iterator=list.listIterator();
    String outStr=(String)iterator.next();
    // Jim is expected
    System.out.println("Returned after using .next():"+ outStr);

    outStr=(String)iterator.next();
    // Tim is expected`
    System.out.println("Returned after using .next():"+ outStr);
    System.out.println("List Size: "+list.getSize());

    iterator.add("Bob");
    System.out.println("Added Bob to list");
    iterator.add("Tina");
    System.out.println("Added Tina to list");


    //outStr=(String)iterator.previous();
    //System.out.println("Returned after using .previousxxxxx():"+ outStr);

    outStr=(String)iterator.next();
    // Harry is expected
    System.out.println("Returned after using .add() & .next():"+ outStr);

    outStr=(String)list.getFirst();
    System.out.println("Returned after using .getFirst():"+ outStr);

    outStr=(String)list.getLast();
    System.out.println("Returned after using .getLast():"+ outStr);




    // Creates a new iterator to test printing out the entire iterator
    iterator=list.listIterator();
    System.out.println("\nEntire list printed out:");
    while(iterator.hasNext())
    {
      System.out.print(iterator.next()+ " ");
    }
  }
}

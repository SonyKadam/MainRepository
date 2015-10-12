import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
 
/**
 * Collection program to copy elements from arraylist to other arraylist.
 * @author inskadam20
 * Date - 8/10/2015
 */
public class CopyElementsOfArrayListToArrayListExample {
 
  public static void main(String[] args) {
     
    ArrayList<String> arrayList1 = new ArrayList<String>();
   
    arrayList1.add("1");
    arrayList1.add("2");
    arrayList1.add("3");
    arrayList1.add(null);
    arrayList1.add(null);
    
    ArrayList<String> arrayList2 = new ArrayList<String>();
   
    arrayList2.add("One");
    arrayList2.add("Two");
    arrayList2.add("Three");
    arrayList2.add("Four");
    arrayList2.add("Five");
   
    System.out.println("Before copy, Second ArrayList Contains : " + arrayList2);
   
    Collections.copy(arrayList1,arrayList2);
   
    System.out.println("After copy, Second ArrayList Contains : " + arrayList2);
    
    List<String> list = new ArrayList<String>();
    
    list.add("This");
    list.add("is");
    list.add("Unmodifiable Collection");
 
    System.out.println("Element added to list: " + list.get(2));
 
    Collection<String> immutableCol = Collections.unmodifiableCollection(list);
 
    Iterator<String> iterator = immutableCol.iterator();
 
    while(iterator.hasNext())
    {
       System.out.println(iterator.next());
    }
    
  }
}
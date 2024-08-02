import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main( String args[])
    {
        HashSet <Integer> set =new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set+" "+ set.size());

        //search-contains
        if(set.contains(1))
        {
            System.out.println("contain 1");
        }
        if(!set.contains(6))
        {
            System.out.println("doest not contain 6");
        }
        set.remove(1);
        System.out.println(set);
        //itteration

        System.out.println("through iteration");
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

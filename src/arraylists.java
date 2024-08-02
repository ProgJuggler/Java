/*import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;*/

import java.util.*;



import java.util.ArrayList;
import java.util.Collections;

public class arraylists {
    public static void main(String args[] ) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(5);
        list.add(2);
        System.out.println(list);
        // get elements

        int ele =list.get(0);
        System.out.println(ele);

        //add in  between

        list.add(1,6);
        list.set(0,5);

        list.remove(0);
        System.out.println(list);
        //size

        System.out.println(list.size());

        //loop

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
// sorting
        Collections.sort(list);
        System.out.print(list);

    }
}

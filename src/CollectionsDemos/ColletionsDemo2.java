package CollectionsDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ColletionsDemo2 {

    public static void main(String[] args) {


        ArrayList<String> al  = new ArrayList();

        al.add("praful");
        al.add("usha");
        al.add("amol");
        al.add("rahul");
        al.add("mehul");
        al.add("mehul");

     //   System.out.println(al);

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(34); // 0
        al1.add(43); // 1
        al1.add(54); // 2
        al1.add(11); // 3
        al1.add(12); // 4

        System.out.println(al1);

        System.out.println(al1.get(3));

        al1.set(3,0);

        System.out.println(al1);
        System.out.println(al1.isEmpty());


        al1.remove(1);
        System.out.println("after remove:"+al1);
        /*al1.clear();

        System.out.println(al1);

        System.out.println(al1.isEmpty());*/

      /*  System.out.println("----------- using for loop ---------");

        for(int i =0 ;i<al1.size();i++)
         {
           System.out.println(al1.get(i));
          }

        System.out.println("----------- using Iterator ---------");

        Iterator itr = al1.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
*/




    }
}

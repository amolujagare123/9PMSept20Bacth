package CollectionsDemos;

import java.util.ArrayList;

public class RemoveIfDemo1 {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(34); // 0
        al1.add(43); // 1
        al1.add(54); // 2
        al1.add(11); // 3
        al1.add(12); // 4

        System.out.println("Before Remove If->"+al1);
        // remove elements which are less than '15'

        al1.removeIf(b -> b<15 );
        System.out.println("After RemoveIf->"+al1);


        ArrayList<String> al  = new ArrayList();

        al.add("praful");
        al.add("usha");
        al.add("amol");
        al.add("rahul");
        al.add("mehul");
        al.add("mehul");
        System.out.println("Before Remove If->"+al);
        // remove the elemts which ends with 'l'
        al.removeIf(str -> str.endsWith("l"));
        System.out.println("After RemoveIf->"+al);

        ArrayList<Character> al2  = new ArrayList();
        al2.add('a'); //
        al2.add('b');
        al2.add('c');
        al2.add('d');
        al2.add('e');//
        al2.add('f');
        al2.add('g');
        al2.add('h');
        al2.add('i');//
        al2.add('j');

// remove the elements having characters as vowels (a,e,i,o,u)
        System.out.println("Before Remove If->"+al2);

        al2.removeIf(ch -> ch=='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u');
        System.out.println("After Remove If->"+al2);
    }
}

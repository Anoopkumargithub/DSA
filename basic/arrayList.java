package basic;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add element
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get element
        int el = list.get(0);
        System.out.println(el);

        // add element at any index
        list.add(1, 1);

        // (index,value)
        System.out.println(list);

        // set element
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(3); // (index)
        System.out.println(list);

        // size of arraylist

        int size = list.size();
        System.out.println(size);

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();


        // sorting
        Collections.sort(list);
        System.out.println(list);

        
    }
}

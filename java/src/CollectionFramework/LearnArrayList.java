package CollectionFramework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        ArrayList<Float> list3 = new ArrayList<>();
//        ArrayList<Boolean> list4 = new ArrayList<>();

        //add element
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get Element

        int element = list.get(0);
        System.out.println(element);

        // add Element in Between

        list.add(1,1);
        System.out.println(list);

        // set element
        list.set(0,5);
        System.out.println(list);

        //loop

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

        // contains
        System.out.println(list.contains(2));
        

    }
}

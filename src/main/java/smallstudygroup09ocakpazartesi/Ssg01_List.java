package smallstudygroup09ocakpazartesi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ssg01_List {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        //ArrayList<Integer> list2 = new ArrayList<>();
        //Collection<Integer> list3 = new ArrayList<>();
        list1.add(10);
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);

        System.out.println(list1); // [10, 11, 12, 13, 14]

        // FOR ILE =
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " "); // 10 11 12 13 14
        }

        // FOR EACH ILE =
        for (Integer each : list1) {
            System.out.print(each + " "); // 10 11 12 13 14
        }


    }
}

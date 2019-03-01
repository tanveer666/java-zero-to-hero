package ee.itcollage.level5;

import java.util.ArrayList;
import java.util.List;

public class Squares {

    //todo fix tests

    /**
     * squares all numbers in a list, for example:
     * 1, 2, 3 will be
     * 1, 4, 9
     */
    public static List<Integer> square(List<Integer> integers){
        int size = integers.size();
        if(integers == null ) return null; //returns null of no list;
        else if(size == 0) return integers;

        ArrayList<Integer> square_value = new ArrayList<Integer>();

        for(int i = 0; i < size; i++)
        {
            int element = integers.get(i);
            element = element * element;
            square_value.add(element);
        }

        return square_value;


    }
}

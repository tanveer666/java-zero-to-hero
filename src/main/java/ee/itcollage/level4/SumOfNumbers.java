package ee.itcollage.level4;

import java.util.List;

public class SumOfNumbers {

    //todo make tests work
    public static Integer sum(List<Integer> integerList){
        if (integerList == null || integerList.isEmpty()) return null;

        int size = integerList.size();
        int sum = 0;
        for(int i = 0; i < size; i++)
        {
            sum += integerList.get(i);
        }

        //integerList.remove(0); //   Q:why cant i return an element from a list???
        //integerList.add(0,sum); //  Answer: THe list passed in the test class is an Array "converted" to arrayList,
        //sum = integerList.get(0);// which does not support the add() and remove() method due to its "immutable" nature! (only has set, get, size, contains, indexof and toArray method.
        return sum;

    }
}

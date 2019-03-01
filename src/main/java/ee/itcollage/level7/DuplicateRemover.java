package ee.itcollage.level7;

import java.util.List;
 // import java.util.Collections;

public class DuplicateRemover {

    //todo fix tests
    public static List<Integer> removeDuplicates(List<Integer> numbers){
       // Collections.sort(numbers); //sorts the list of integers. //evidently sorting is not required.

        int size = numbers.size(); //gets the size of the list, so that we don't go out of the list while iterating.

        for(int i = 0; i < size; i++) //goes through all the elements of the list.
        {
            int element = numbers.get(i); //gets the element at a particular index.

            int first_index;
            int last_index;
            for(  int j = i; j < size; j++ )
                {
                first_index = numbers.indexOf(element); //finds the index of the first occurrence of element.
                last_index = numbers.lastIndexOf(element); //finds the last occurrence.

                if (first_index != last_index) { //if they are not the same, meaning there are more than one duplicate value
                    numbers.remove(last_index); //remove the last value.
                    size--; //adjusts the size since List has 1 less value. Otherwise loop will go out of bounds.
                }
                else if(first_index == last_index) /* Q: why is first index always equals to last index? */
                {
                    break; //if they both have same index meaning no duplicate values remain, then break
                }

            }

        }


        return numbers;


    }
}

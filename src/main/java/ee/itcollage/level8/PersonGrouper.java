package ee.itcollage.level8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonGrouper {

    //todo fix tests
    public static Map<String, Person> groupPeopleByIdCode(List<Person> people){
        HashMap<String,Person> h_map = new HashMap<String, Person>(); //Creates a New Hashmap call h_map
                                                                    // The key is the String value of a person ID, value is the person obj itself.
        for(Person obj : people) //gets every (people)object from the people List
        {
            h_map.put( String.valueOf( obj.getIdCode()) , obj ); //Inserts object in to the list, Note that the key is the String value of the the int Id code of a person object.
        }

        return h_map;

    }

}

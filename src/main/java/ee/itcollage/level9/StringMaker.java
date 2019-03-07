package ee.itcollage.level9;


public class StringMaker {

    //todo fix tests
    /**
     * Gives you a text containing of x times of string c.
     * @param s the string to repeat
     * @param x how many times you want the string
     */
    public static String make(String s, int x) {
        StringBuilder sb = new StringBuilder( ); //creates an empty string builder
        int ctr = 0;
        if(x > 0) //if x > 0 then it will append itself with s; Otherwise, sb is still empty.
        {
            while(ctr < x) {
                sb.append(s); // if  x = 5, it will run 5 times from x = 0 to x = 4;
                ctr++;
            }
        }

        String chars = sb.toString(); //converts sb to immutable string
        return chars; //returns the appended string
    }

    /**
     * Gives you a text containing of x times of string c plus y times of string c.
     */
    public static String make(String s1, int x1, String s2, int x2) {

        String sb1 = make(s1, x1); //calls itself
        String sb2 = make(s2, x2); //calls itself

        String chars = sb1 + sb2; //concatenates the resultant string
        return chars;
    }
}

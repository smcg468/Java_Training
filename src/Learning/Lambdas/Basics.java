package Learning.Lambdas;

import java.util.Comparator;

public class Basics {

    public static void main ( String[] args) {


        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        int comparison = comparator.compare("one", "two");
        System.out.println(comparison);


        //Lambda Expression

        Comparator<String> comparator1 = (o1, o2) ->
            o1.compareTo(o2);

        int comparison1 = comparator1.compare("one", "two");
        System.out.println(comparison1);



        //Lambdas with Interface

        //No Parameters
        /*
        BasicInterface basicInterface = () -> {
            System.out.println("No Parameters");
        };

        basicInterface.noParameters();
        */


        /*
        BasicInterface basicInterface = s1 -> {
            System.out.println("One Parameter");
        };

        basicInterface.oneParameter("One Parameter");

        */

        BasicInterface basicInterface = (s1, s2) -> {
            return(s1 + "+" + s2);
        };

        basicInterface.twoParameters("Two", "Parameters");


    }

}

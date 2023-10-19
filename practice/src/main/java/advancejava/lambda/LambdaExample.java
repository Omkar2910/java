package advancejava.lambda;/*package whatever //do not write package name here */

import java.util.*;
import java.util.function.*;

class LambdaExample {
    static void printCond(Collection<Integer> c, Predicate<Integer> p){
        for(Integer i: c){
            if(p.test(i))
                System.out.print(i+" ");
        }
    }

	public static void main (String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
// Without lambda and anonymous class
         class MyPredicateEven implements Predicate<Integer>{
             @Override
             public boolean test(Integer t) {
                 return t%2 == 0;
             }
         }
         MyPredicateEven objEven = new MyPredicateEven();
         printCond(list, objEven);

// With annonymous class
         Predicate<Integer> myPredicateEven = new Predicate<Integer>() {
             @Override
             public boolean test(Integer t) {
                 return t%2 == 0;
             }
         };
         printCond(list, myPredicateEven);

// With lambda expression
         printCond(list, a -> a%2==0);
	}
}
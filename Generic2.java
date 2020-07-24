import java.io.*;
import java.util.*;
class generic {
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
}
interface UnaryPredicate<T> {
    public boolean test(T obj);
}
class OddPredicate implements UnaryPredicate<Integer> 
{
    public boolean test(Integer i)
 {
 return i % 2 != 0; 
}
}
class EvenPredicate implements UnaryPredicate<Integer>
 {
    public boolean test(Integer i)
 { 
return i % 2 == 0; 
}
}


public class Generic2
 {
    public static void main(String[] args)
 {
        Collection<Integer> num = Arrays.asList(2 ,4 ,6 ,7, 8,9,90,78,41,56,79,45,65,85);
        int count = generic.countIf(num, new OddPredicate());
        int count2 = generic.countIf(num, new EvenPredicate());
System.out.println("odd integers = " + count);
   System.out.println("even integers = " + count2);
  
 }
}
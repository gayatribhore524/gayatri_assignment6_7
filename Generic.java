import java.util.*;
import java.util.*;

 class Generic
{
public static <E extends Object & Comparable<?super E>> E getMax(List<?extends E> list,int begin,int end)
{
E maxelement=list.get(begin);
for(++begin;begin<end;++begin)
if(maxelement.compareTo(list.get(begin))<0)
maxelement=list.get(begin);
return maxelement;
}
public static void main(String args[])
{
List<Integer> numbers=Arrays.asList(2,62, 4,78, 6, 10,49,20,59,43,29,30,56,89);
int g=Generic.getMax(numbers,0,numbers.size());

System.out.println("maximum numbers:"+g);
}
}
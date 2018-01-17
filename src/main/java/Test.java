import java.util.ArrayList;
import java.util.List;

/**
 * Created by cem on 17/01/18.
 */
public class Test {

    IntegerWrapper x = new IntegerWrapper(5);

    public void myInt1(Integer i)
    {
        myInt3(i);
    }

    public void myInt2(int i)
    {
        myInt3(i);
    }

    public void list1(List<IntegerWrapper> myLista)
    {
        myList(myLista);
    }

    public void list2(List<IntegerWrapper> myList)
    {
        myList2(myList);
    }

    private void myList(List<IntegerWrapper> myList)
    {
        myList.add(x);
    }

    private void myList2(List<IntegerWrapper> myList)
    {
        myList = new ArrayList<IntegerWrapper>();
        myList.add(new IntegerWrapper(2));
    }

    private void myInt3(Integer i)
    {
        i = 0;
    }
}

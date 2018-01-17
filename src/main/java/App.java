import java.util.ArrayList;
import java.util.List;

/**
 * Created by cem on 17/01/18.
 */
public class App {

    public static void main(String[] args)
    {
        Test test = new Test();

        System.out.println("--------------");
        List<IntegerWrapper> myArr = new ArrayList<IntegerWrapper>();
        myArr.add(new IntegerWrapper(1));

        test.list2(myArr);

        myArr.stream().forEach(item -> System.out.println(item));

        System.out.println("-------1------");
        test.list1(myArr);

        myArr.stream().forEach(item -> System.out.println(item));

        System.out.println("-------2------");
        test.x = new IntegerWrapper(9);

        myArr.stream().forEach(item -> System.out.println(item));

        System.out.println("-------3------");
        test.x.changeX();

        myArr.stream().forEach(item -> System.out.println(item));
    }
}

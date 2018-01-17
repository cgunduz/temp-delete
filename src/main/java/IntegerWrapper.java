/**
 * Created by cem on 17/01/18.
 */
public class IntegerWrapper {

    Integer x;

    @Override
    public String toString() {
        return String.valueOf(x);
    }

    public IntegerWrapper(Integer x) {
        this.x = x;
    }

    public void changeX()
    {
        x = 9;
    }
}

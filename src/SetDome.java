import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDome {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(1);
        set.add(1);
        set.add(false);
        set.add("河池学院");
        set.add("读书");
        System.out.println("元素的个数是："+set.size());//由于set集中元素是无序的，所以内有索引，因此想要遍历的话就需要迭代器
        Iterator iterator=set.iterator();
        while (iterator.hasNext())
        {
            System.out.println("元素是："+iterator.next());
        }

    }

}

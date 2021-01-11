import java.util.ArrayList;
import java.util.List;

public class listDome {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(false);
        list.add("河池学院");
        list.add("读书");
        System.out.println("元素的个数是："+list.size());
        for (int i=0;i<list.size();i++)
        {
            System.out.println("第"+(i+1)+"个元素是："+list.get(i));
        }

    }
}

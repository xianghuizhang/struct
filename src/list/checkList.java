package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zxh on 2016/11/13.
 */
public class checkList {
    public static void main(String[] args) {
        List<Integer> lists=new ArrayList<>();
        lists.add(1);
        lists.add(2);
        List<Integer> integers = Arrays.asList(1, 2, 3);

        for(int i=0;i<lists.size();i++){
            lists.remove(1);
        }
    }
}

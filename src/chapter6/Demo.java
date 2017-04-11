package chapter6;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/10.
 */
public class Demo {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("a");

        arrayList.add("b");
        System.out.println(arrayList.indexOf("b"));
        arrayList.remove(0);
        System.out.println(arrayList);
        
    }
}

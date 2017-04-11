package chapter7;

/**
 * Created by Administrator on 2017/4/11.
 */
public class Practice {
    int ivar = 7;
    void m3(){
        System.out.println("A's m3, ");
    }
}
class Parent extends Practice{

}
class child extends Parent{
    void m3(){
        System.out.println("C's m3, " + (ivar + 6));
    }
}

class PracticeTestDrive{
    public static void main(String[] args){
        Practice p2 = new child();
        p2.m3();
    }
}
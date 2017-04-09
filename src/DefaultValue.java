/**
 * Created by Administrator on 2017/4/8.
 */
public class DefaultValue {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int calc(int height, int width) {
        return height * width;
    }

    public static void main(String[] args) {
        DefaultValue d = new DefaultValue();
        System.out.println(d.getAge());

        int[] cells = {1, 2, 3};
        for (int cell : cells) {
            System.out.println(cell);
        }
    }
}


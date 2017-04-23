package chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/22.
 */
public class SerializationDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fs = new FileOutputStream("./data.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			Foo foo = new Foo();
			foo.height = 10;
			foo.width = 20;

			Child child = new Child();
			child.height2 = 30;
			child.width2 = 40;
			os.writeObject(foo);
			os.writeObject(child);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Foo implements Serializable{
	int width;
	int height;
}
//父类实现序列化 子类自动实现
class Child extends Foo{
	int width2;
	int height2;
}
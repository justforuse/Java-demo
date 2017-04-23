package chapter14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Administrator on 2017/4/23.
 */
public class DeserializationDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("./data.ser");
			ObjectInputStream os = new ObjectInputStream(fs);
			Object one = os.readObject();
			Child two = (Child)os.readObject();
			os.close();

			System.out.println(one);
			System.out.println(two.height2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

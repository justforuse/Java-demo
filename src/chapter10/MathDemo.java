package chapter10;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/15.
 */
public class MathDemo {


	public static void	main(String[] args){
		int a  = Math.abs(123);
		long b = Math.round(24.2);
		float x = Math.min(1.1f,2.2f);
		//ArrayList<int> a = new ArrayList<int>();
		System.out.println(a);
	}

}

class TestBox{
	Integer i;
	int j;

	public static void main(String[] args){
		TestBox t = new TestBox();
		t.go();
	}

	public void go(){
//		j=i;
		System.out.println(j);
		System.out.println(i);
		boolean a = new Boolean("true");
		System.out.println(a);
		System.out.println(Boolean.toString(a));
	}
}

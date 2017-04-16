package chapter10;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/16.
 */
public class FormatDemo {
	public static void main(String[] args){
		String s = String.format("%.2f", 176654.09876);
		System.out.println(s);
		System.out.println(String.format("%,6.1f", 42.000));
		System.out.println(String.format("First: %,6.1f, second: %,d", 42.000, 123456));

		System.out.println(String.format("Full date: %tc", new Date()));
		System.out.println(String.format("Only time: %tr", new Date()));
		System.out.println(String.format("Only week: %tA", new Date()));
		System.out.println(String.format("Only month: %tB", new Date()));
		System.out.println(String.format("Only day: %td", new Date()));
		System.out.println(String.format("Get all in one sentence: %tA, %<tB, %<td", new Date()));



	}
}

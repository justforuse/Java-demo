package chapter10;

import java.util.Calendar;

/**
 * Created by Administrator on 2017/4/17.
 */
public class CalendarDemo {
	public static void main(String[] args){
		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, 11,1,13,20);
		System.out.println(calendar.getTimeInMillis());
		System.out.println(calendar.getTime());

		calendar.add(calendar.DATE, 10);
		System.out.println(calendar.getTime());

		// add specific field only, not change larger field.
		calendar.roll(calendar.DATE, 30);
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(calendar.DATE));
		System.out.println(calendar.get(calendar.HOUR));
	}
}

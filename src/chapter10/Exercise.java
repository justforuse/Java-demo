package chapter10;

/**
 * Created by Administrator on 2017/4/18.
 */
class Exercise {
	static {
		System.out.println("super static block");
	}
	Exercise(){
		System.out.println("super constructor");
	}
}

class Test extends Exercise{
	static int rand;
	static {
		rand = (int)(Math.random() * 6);
		System.out.println("static block " + rand);
	}

	Test(){
		System.out.println("constructor");
	}

	public static void main(String[] args){
		System.out.println("in main");
		Test test = new Test();
	}
}

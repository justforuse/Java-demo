package chapter8;

/**
 * Created by Administrator on 2017/4/15.
 */
public interface Pet {
	public abstract void beFriendly();
	abstract void play();
}
class Cat implements Pet{

	private Cat(){

	}
	@Override
	public void beFriendly() {

	}

	@Override
	public void play() {

	}
}

class CatTestDrive{

}

class Foo{
	int x = 12;
	public static void go(final int x){
		System.out.print(x);

	}
}

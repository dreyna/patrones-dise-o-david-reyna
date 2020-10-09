package singleton;

public class DemoSingleThread {
	public static void main(String[] args) {
        Singleton s1= Singleton.getInstance("FOO");
        Singleton s2 = Singleton.getInstance("BAR");
        System.out.println(s1.value);
        System.out.println(s2.value);
    }
}

package Multithreading;
class MyThread3 extends Thread{
	public void run() {
		System.out.println("Child Thread Running...");
		for(int i=1;i<=3;i++) {
			System.out.println("Child:"+i);
		}
	}
}
public class MultithreadWithThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread3 t1=new MyThread3();
t1.start();
System.out.println("Main Thread Running...");
for(int i=1;i<=3;i++) {
	System.out.println("Main:"+i);
}
	}

}

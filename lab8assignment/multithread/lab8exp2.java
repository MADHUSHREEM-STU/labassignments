package multithread;
import java.util.*;

class Task extends TimerTask {
	private String name;
	public Task(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println(name+" :task executed after every 10 sec");
	}
}
public class lab8exp2 {

	public static void main(String[] args) {
		Task t=new Task("Task");
		Timer time=new Timer();
		time.schedule(t,new Date(),10000);
		
	}
}

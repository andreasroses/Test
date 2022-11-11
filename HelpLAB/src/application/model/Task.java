package application.model;
import java.time.Duration;

import com.google.common.base.Stopwatch;
public class Task {
	String name, time;
	Boolean done;
	public Task(String n, String t) {
		setName(n);
		setTime(t);
		setDone(false);
	}
	public String startTimer() {
		Stopwatch s = Stopwatch.createStarted();
		try {
			this.wait(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.stop();
		return "it did it, probably";
		
	}
	/**
	 * @return name of task
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name of task
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return time desired to spent on task
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time desired to spent on task
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return if task is done
	 */
	public Boolean getDone() {
		return done;
	}
	/**
	 * @param task done or not
	 */
	public void setDone(Boolean done) {
		this.done = done;
	}
}

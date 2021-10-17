package ua.yaremechko.inheritance.robot;

public class Robot {
	
	private String name;
	private String work;
	
	Robot(String name) {
		this.name = name;
		this.work = "just work";
	}
	
	public void work(String changeWork) {
		this.work = changeWork;
	}

	@Override
	public String toString() {
		return "I'm " + name + " - I " + work;
	}
	
	
	
}

package quiz;

public abstract class Trans {
	public abstract void start(String name);
	public abstract void stop(String name);
	public String name(String name) {
		return name;
	}
}

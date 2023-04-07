package homework;

public class TV {
	private int channel; //멤버변수
	private String color; 
	
	public TV() {
		channel = 17;
		color = "black";
	}
	public TV(int channel) {
		this.channel = channel;
		this.color = "red";
	}
	public TV(String color) {
		this.color = color;
	}
	public TV(int channel, String color) {
		this.channel = channel;
		this.color = color;
	}
	public void setData(int channel, String color) {
		this.channel = channel;
		this.color = color;
	}
	
	// getter / setter method
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// output
	
	public void display() {
		System.out.println("channel : "+getChannel()+", color : "+getColor());
	}
	
}

package quiz2;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private char sex;
	private double height;
	private double weight;
	private double bmi;
	private String obesity;
	
	public Person(String name, char sex, double height, double weight) {
		super();
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
		calBmi();
		calObesity();
	}

	public void calBmi() {
//		if(this.sex == 'f') {
//			this.bmi = (this.height - 100)*0.85;
//		}
//		if(this.sex == 'm') {
//			this.bmi = (this.height - 100)*0.9;
//		}
		this.bmi = this.weight / ((this.height / 100.0) * (this.height / 100.0));
	}
	public void calObesity() {
		if(this.bmi < 18.5) {
			this.obesity = "저체중";
		}
		else if(this.bmi >=18.5 && this.bmi <23.0) {
			this.obesity = "정상";
		}
		else if(this.bmi >=23.0 && this.bmi <25) {
			this.obesity = "과체중";
		}
		else if(this.bmi >=25){
			this.obesity = "비만";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getObesity() {
		return obesity;
	}

	public void setObesity(String obesity) {
		this.obesity = obesity;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi
				+ ", obesity=" + obesity + "]\n";
	}

}

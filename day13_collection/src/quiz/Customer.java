package quiz;

public class Customer {
	private String name;
	private String address;
	private String tel;
	
	
	
	@Override
	public int hashCode() {
		return this.name.hashCode()+this.address.hashCode()+this.tel.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			Customer c = (Customer)obj;
			return this.name.equals(c.getName()) && this.address.equals(c.getAddress()) && this.tel.equals(c.getTel());
		}
		return false;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}
	public Customer(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}

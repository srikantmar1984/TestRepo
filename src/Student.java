
public class Student {
	private int id;
	private String Name;
	private int std;
	private String city;
	public Student(int id, String name, int std, String city) {
		super();
		this.id = id;
		Name = name;
		this.std = std;
		this.city = city;
	}
	public Student(String name, int std, String city) {
		super();
		Name = name;
		this.std = std;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", std=" + std + ", city=" + city + "]";
	}
	
}

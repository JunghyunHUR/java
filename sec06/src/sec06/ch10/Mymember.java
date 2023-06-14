package sec06.ch10;

public class Mymember {
	private int id;
	private String name;
	
	private static Mymember instance = new Mymember();
	private Mymember() {
		this.id = 1004;
		this.name = "진짜천사";
	}
	public static Mymember getInstance() {
		if(instance == null) {
			instance = new Mymember();
		}return instance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

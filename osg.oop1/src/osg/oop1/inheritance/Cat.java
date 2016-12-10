package osg.oop1.inheritance;

public class Cat extends Animals {
	private int age;
	private int height;
	
	 public Cat(int age, int height) {
		// TODO Auto-generated constructor stub
		 super();
		 this.age = age;
		 this.height = height;
	}
	 
	 public Cat (String name, int age, int height){
		 super(name);
		 
		 this.age = age;
		 this.height = height;
	 }
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String getAnimalName() {
		// TODO Auto-generated method stub
		return "cat";
	}


}
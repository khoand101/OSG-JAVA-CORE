package osg.oop1.inheritance;

/**
 * @author KhoaND02
 * class, contructor, instnce
 *
 */
public class Persion {
	private String name;
	private Integer yob;
	private Integer yod;
	
	public Persion(String name, Integer yob, Integer yod){
		this.name = name;
		this.yob = yob;
		this.yod = yod;
	}
	
	public Persion (String name, Integer yob){
		this.name = name;
		this.yob = yob;
	}
	
	public String getName(){
		return name;
	}
	public Integer getYb(){
		return yob;
	}
	public Integer getYod(){
		return yod;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setYob(Integer yob){
		this.yob = yob;
	}
	public void setYod(Integer yod){
		this.yod = yod;
	}
	
	
	
}

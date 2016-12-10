package osg.oop1.inheritance;

public abstract class Animals {
  private String name;
  
  public Animals(){
	  this.name = this.getAnimalName();
  }
  public Animals (String name){
	  this.name = name;
  }
  public void setName(String name){
	   this.name = name;
  }
  public String getName(){
	  return name;
  }

public abstract String getAnimalName();

}

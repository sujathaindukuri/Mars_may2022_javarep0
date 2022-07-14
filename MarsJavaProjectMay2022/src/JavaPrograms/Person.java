package JavaPrograms;

public class Person {
	private int height;
	private int weight;
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getPersonInfo()
	{
   return("Height is: "+height+"and weight is: "+weight);
}
}
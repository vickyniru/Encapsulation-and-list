package meth.org;

public class Encapsulation {
	private int age = 20;
	private int mark1= 95;
    private int mark2= 98;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int percent1) {
		mark1 = percent1;
		System.out.println("Percentage changed to ->"+ percent1);
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int percent2) {
		mark2 = percent2;
	}
    
	

}

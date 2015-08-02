
public abstract class Animal {
	protected String name;
	private int order;
	
	public Animal(String n){
		name = n;
	}
	
	public void setOrder(int o){
		order = o;
	}
	
	public int getOrder(){
		return order;	
	}
	public abstract String name();
}

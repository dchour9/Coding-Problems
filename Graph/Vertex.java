import java.util.*;
public class Vertex {
	public String name;
	private ArrayList<Vertex> adjacent;
	
	public Vertex(String s){
		name = s;
		adjacent = new ArrayList<Vertex>();
	}
	public void addAdjacent(Vertex v){
		adjacent.add(v);
	}
	
	public ArrayList<Vertex> getAdjacent(){
		return adjacent;
	}
	
	public String name(){
		return name;
	}
	
	public boolean isConnected(Vertex v){
		if(this.getAdjacent().contains(v)){
			return true;
		}
		return false;
	}

}

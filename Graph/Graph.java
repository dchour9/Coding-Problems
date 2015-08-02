import java.util.*;
public class Graph {
	private ArrayList<Vertex> vertices;
	
	public Graph(){
		vertices = new ArrayList<Vertex>();
	}
	
	public void add(String s){
		Vertex v = new Vertex(s);
		vertices.add(v);
	}
	
	public void createConnection(Vertex to, Vertex from){
		if(!vertices.contains(to)){
			vertices.add(to);
		}
		if(!vertices.contains(from)){
			vertices.add(from);
		}
		to.addAdjacent(from);
		from.addAdjacent(to);
	}
	
	public Vertex getVertex(String s){
		for(Vertex v: vertices){
			if(v.name() == s){
				return v;
			}
		}
		return null;
	}
	
	public ArrayList<Vertex> getVertices(){
		return vertices;
	}
	
}

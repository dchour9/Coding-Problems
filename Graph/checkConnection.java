
public class checkConnection {
	public static void main(String [] args){
		Graph g = new Graph();
		String [] locs = {"Walmart", "Target", "Kohls", "Macys", "JCPenney", "McDonalds", "Chipotle"};
		for(String s: locs){
			g.add(s);
		}
		Vertex v = new Vertex("Starbucks");
		System.out.println(g.getVertices().get(0).name());
		g.createConnection(g.getVertex("Walmart"), v);
		System.out.println(v.isConnected(g.getVertex("Walmart")));
		System.out.println(v.isConnected(g.getVertex("Target")));
		g.createConnection(g.getVertex("Kohls"), g.getVertex("Macys"));
		System.out.println(g.getVertex("Kohls").isConnected(g.getVertex("Macys")));
		
	}
}

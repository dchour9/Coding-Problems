import java.util.*;
//Can only dequeue the oldest animal or the oldest animal of a picked type
//use two queues, one for dogs one for cats, compare order of insertion and return appropriate animal
public class animalQueue {
	Queue<Dog> dogs;
	Queue<Cat> cats;
	private int order;
	
	public animalQueue(){
		dogs = new LinkedList<Dog>();
		cats = new LinkedList<Cat>();
		order = 0;
	}
	
	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		if( a instanceof Dog){
			dogs.add((Dog) a);
		}else{
			cats.add((Cat)a);
		}
	}
	
	public Animal dequeueAny(){
		if(dogs.peek().getOrder() > cats.peek().getOrder()){
			return cats.remove();
		}else{
			return dogs.remove();
		}
	}
	
	public Dog dequeueDog(){
		return dogs.remove();
	}
	
	public Cat dequeueCat(){
		return cats.remove();
	}
	
	
	public static void main(String[] args){
		animalQueue animals = new animalQueue();
		Dog a = new Dog("Simon");
		Dog b = new Dog("Billy");
		Dog c = new Dog("Max");
		Dog d = new Dog("Buck");
		Cat e = new Cat("Pounce");
		Cat f = new Cat("Solomon");
		Cat g = new Cat("Garfield");
		Cat h = new Cat("Pur");
		animals.enqueue(h);
		animals.enqueue(a);
		animals.enqueue(d);
		animals.enqueue(f);
		animals.enqueue(g);
		animals.enqueue(c);
		animals.enqueue(b);
		animals.enqueue(e);
		
		System.out.println(animals.dequeueAny().name());
		System.out.println(animals.dequeueAny().name());
		System.out.println(animals.dequeueCat().name());
		System.out.println(animals.dequeueAny().name());
	}

//Pur Simon Buck Solomon Garfield Max billy Pounce	

}

import java.util.*;

class TreeMapDemo{
	
	public static void main(String args[]){
		Map m = new TreeMap();
		m.put(101, "Abhi");
		m.put(103, "Rakesh");
		m.put(1, "Xmas");
		m.put(50, "Zakir");
		m.put(10, "Ramesh");
		
		
		Set eSet = m.entrySet();
		
		Iterator itr = eSet.iterator();
		while(itr.hasNext()){
			Map.Entry mapEntry = (Map.Entry) itr.next();
			System.out.println(mapEntry.getKey()+"--"+mapEntry.getValue()+"-Hashcode-->"+mapEntry.getValue().hashCode());
		}
		
		System.out.println("Size is " +m.size());
		
		Map m1 = new HashMap(m);// Hashmap constructor with map object
		System.out.println(m1);
	}
}
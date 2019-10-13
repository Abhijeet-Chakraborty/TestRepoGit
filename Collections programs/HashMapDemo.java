import java.util.*;

class HashMapDemo{
	
	public static void main(String args[]){
		Map m = new HashMap();
		m.put(101, "Abhi");
		m.put(103, "Rakesh");
		m.put(1, "Xmas");
		m.put(50, "Zakir");
		m.put(10, "Ramesh");
		
		
		Set eSet = m.entrySet();
		
		Iterator itr = eSet.iterator();
		while(itr.hasNext()){
			Map.Entry mapEntry = (Map.Entry) itr.next();
			//if(mapEntry.getKey().equals("Abhi"))
			//	mapEntry.setValue("Ravikant");
			System.out.println(mapEntry.getKey()+"--"+mapEntry.getValue()+"-Hashcode-->"+mapEntry.getValue().hashCode());
		}
		
		System.out.println("Size is " +m.size());
	}
}
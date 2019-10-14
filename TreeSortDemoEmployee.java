 import java.util.*;
 
 class TreeSortDemoEmployee{
	 
	 public static void main(String args[]){
		 TreeSet t = new TreeSet();
		 t.add(new Employee(100, "Abhijeet"));
		 t.add(new Employee(50, "Ram"));
		 t.add(new Employee(100, "zainuddin"));
		 t.add(new Employee(20, "Mohan"));
		 t.add(new Employee(205, "Kumar"));
		 
		 System.out.println(t);
		 
	 }
 }
 // to be continue....... add comarator for sorting based on sorting
 
 class Employee implements Comparable{
	 
	 private int id;
	 private String name;
	 
	 public Employee(int id, String name){
		 this.id = id;
		 this.name = name;
	 }
	 
	 public String toString(){
		 return this.id+"--"+this.name;
	 }
	 
	 public int compareTo(Object obj){
		 int id1 = this.id;
		 Employee emp = (Employee)obj;
		 int id2 = emp.id;
		 if(id1 < id2){
			 return 1;
		 }else if(id1 > id2){
			 return -1;
		 }else
			 return 0;
	 }
	 

	 
	 
 }
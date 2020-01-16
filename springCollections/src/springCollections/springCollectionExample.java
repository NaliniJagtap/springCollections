package springCollections;
import java.util.*;

public class springCollectionExample {
	   List springList;
	   Set  springSet;
	   Map  springMap;
	   Properties springProp;

	   // a setter method to set List
	   public void setSpringList(List springList) {
	      this.springList = springList;
	   }
	   
	   // prints and returns all the elements of the list.
	   public List getSpringList() {
	      System.out.println("List Elements :"  + springList);
	      return springList;
	   }
	   
	   // a setter method to set Set
	   public void setSpringSet(Set springSet) {
	      this.springSet = springSet;
	   }
	   
	   // prints and returns all the elements of the Set.
	   public Set getSpringSet() {
	      System.out.println("Set Elements :"  + springSet);
	      return springSet;
	   }
	   
	   // a setter method to set Map
	   public void setSpringMap(Map springMap) {
	      this.springMap = springMap;
	   }
	   
	   // prints and returns all the elements of the Map.
	   public Map getSpringMap() {
	      System.out.println("Map Elements :"  + springMap);
	      return springMap;
	   }
	   
	   // a setter method to set Property
	   public void setSpringProp(Properties springProp) {
	      this.springProp = springProp;
	   }
	   
	   // prints and returns all the elements of the Property.
	   public Properties getSpringProp() {
	      System.out.println("Property Elements :"  + springProp);
	      return springProp;
	   }
}

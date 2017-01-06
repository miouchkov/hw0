package uchidb;

import java.util.*;

/**
 * @author aelmore
 */
public class HW0Runner implements Containers<Integer, String> {

	//TODO you likely will need to add member variable
	Map<String,Integer> map;
	
	private static HW0Runner instance = new HW0Runner();
	private HW0Runner(){}
	
	//Create a set that stores the array of T objects
	public Set<Integer> initSet(Integer[] iArray){
		return new HashSet<Integer>(Arrays.asList(iArray));
	}
	
	//Create a list that stores an the array of T objects
	public ArrayList<Integer> initList(Integer[] iArray){
		return new ArrayList<Integer>(Arrays.asList(iArray));
	}
	
	//Create an empty map that will use type S aString keys, and T as values
	public HashMap<String,Integer> initEmptyMap(){
		return new HashMap<String,Integer>();
	}
	
	//Store the map in a local field variable -- often called a setter 
	public void storeMap(Map<String,Integer> mapToStoreInClass){
		map = mapToStoreInClass;
	}
	
	//add a key value to store map with a boolean indicating whether to overwrite existing value
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey){
		if (overwriteExistingKey != true && map.get(key) != null){
			return false;
		}
		else{
			map.put(key, value);
			return true;
		}
	}
	
	//get a value based on a key
	public Integer getValueFromMap(String key){
		return map.get(key);
	}
	
	//an overloaded function to get value from map but with a default value
	//if the key is not present
	public Integer getValueFromMap(String key, Integer defaultValue){
		Integer val = map.get(key);
		if (val != null){
			return val;
		}
		else{
			return defaultValue;
		}
	}
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		return instance;
	}


	public static void main(String[] args){
		
	}
}

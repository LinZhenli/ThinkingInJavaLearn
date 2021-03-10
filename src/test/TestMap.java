package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map hashMap=new HashMap();
//		Set<Entry<Object, Object>> s= hashMap.entrySet();
//		for (Map.Entry object : s) {
//			object.getKey();
//			object.getValue();
//		}
		hashMap.put("1", "2");
		
		Set<Entry> s=hashMap.entrySet();
		for (Entry entry : s) {
			entry.getKey();
			entry.getValue();
		}
		hashMap.keySet();
		System.out.println(hashMap.values());
		
	}
	
	

}

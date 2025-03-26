package ch06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx01 {
	public static void main(String[] args) {
	 Map<Integer, String> hMap1 = new HashMap<>();
	 //1.put(k,v)
	 hMap1.put(2, "나다라"); //  int -> Integer로 변환 , AutoBoxing
	 hMap1.put(new Integer(1), "가나다"); //
	 hMap1.put(Integer.parseInt("3"), "다라마");
	 System.out.println(hMap1);

	 //2.putAll(<Map<? extends K, ? extends V>)
	 Map<Integer, String> hMap2 = new HashMap<Integer, String>();
	 hMap2.put(5, "마바사");
	 hMap2.putAll(hMap1);// Map내에 Map저장
	 System.out.println(hMap2);
	 
	 //#3. replace(k,v)
	 hMap2.replace(1, "abc");
	 hMap2.replace(4, "edf");//해당 키가 없으며 동작안함.
	 System.out.println(hMap2);
	 
	//#3. replace(k,old, new)
    hMap2.replace(1, "abc","나나나");
	hMap2.replace(4, "edf","가가가");//해당 키가 없으며 동작안함.
	System.out.println(hMap2);
		 
	//#4. V get(key)
	String v = hMap2.get(1); // autoBoxing
	System.out.println(v);
	
	//#6.containsKey(k)
	String result = hMap2.containsKey(1)? "키가 있음":"키가 없음";
	 System.out.println(result);
   //#6.containsValue(v)
	String result1 = hMap2.containsValue("가가가")? "값이 있음":"값이 없음";
	 System.out.println(result1); 
	 
	 //#8. Key들만 추출 keySet()
	 Set<Integer> keys = hMap2.keySet();
	 Iterator<Integer> itor = keys.iterator();//factory 패턴
	 while(itor.hasNext())
		 System.out.println(hMap2.get(itor.next()));
	
	//#9. Set<Map.Entry<K,V>> entrySet()
	 Set<Map.Entry<Integer, String>> entrySet  = hMap2.entrySet();
	 System.out.println(entrySet);
	 
	 //#10. size()
	 System.out.println(hMap2.size());
	 
	 //#11. remove(K)
	 hMap2.remove(1); //autoBoxing
	 hMap2.remove(4); //동작안함
	 System.out.println(hMap2);
	 
	//#11. remove(K,V)
	 hMap2.remove(2,"나다라"); //autoBoxing
	 hMap2.remove(3,"다다다"); //동작안함
	System.out.println(hMap2);
	
	//#12. clear()
	hMap2.clear();
	System.out.println(hMap2.size());
	System.out.println(hMap2);
	 
	}
}

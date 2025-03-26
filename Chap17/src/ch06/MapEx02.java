package ch06;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapEx02 {
	public static void main(String[] args) {
	Map<C,String> map = Collections.synchronizedMap(new HashMap<>());
	C c1 = new C(1);
	C c2 = new C(2);
	C c3 = new C(3);
	
	
	map.put(c1, "홍길동");//
	map.put(c2, "일지매");
	map.put(c3, "홍길동");
	map.put(c1, "이순신");//키가 동일하면 나중에 저장된 value로 update
	
	System.out.println(map);
	}
}

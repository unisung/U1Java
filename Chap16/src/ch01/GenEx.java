package ch01;

public class GenEx {
	public static void main(String[] args) {
		//컴파일 시점에 해당타입로 변환
		KeyValue<String, Integer> kv1 
		  = new KeyValue<String, Integer>();
		kv1.setKey("사과");
		kv1.setValue(1000);
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key: "+key1+"  value: "+value1);

		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한페이지를 찾을 수 없음)");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key: "+key2+" value: "+value2);

		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키값만 사용");
		String key3 = kv3.getKey();
		System.out.println("key: "+key3);

		
	}
}

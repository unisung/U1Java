package ch09;

import java.util.ArrayList;
import java.util.List;

public class MemberEx {
	public static void main(String[] args) {
	 Member[] members
	  = new Member[5];//[null][null][null][null][null]
	 Member m1 = new Member(1, "홍길동");
	 Member m2 = new Member(2, "일지매");
	 Member m3 = new Member(3, "임꺽정");
	 Member m4 = new Member(4, "이순신");
	 Member m5 = new Member(5, "유관순");
	 
	 members[0]=m1;
	 members[1]=m2;
	 members[2]=m3;
	 members[3]=m4;
	 members[4]=m5;
	 
	 for(int i=0;i<members.length;i++)
		 System.out.println(members[i]);
	 
	  //회원탈퇴 - "임꺽정"
	 members[2] = null;//[m1][m2][null][m4][m5]
	 for(int i=0;i<members.length;i++)
		 System.out.println(members[i]);
	 System.out.println("------------------------------"); 
	 //회원찾기
	 for(int i=0;i<members.length;i++) {
		 Member m = members[i];
		 if(m!=null) {
		     if(m.name.equals("이순신")) {
		    	 System.out.println(m);
		     }
		 }
	 }
	 System.out.println("------------------------------");
	 
	 //
	 List<Member> list = new ArrayList<>();
	 list.add(m1);list.add(m2);list.add(m3);list.add(m4);list.add(m5);
	 for(int i=0;i<list.size();i++) System.out.println(list.get(i));//size 5
	 //탈퇴
	 list.remove(m3);
	 for(int i=0;i<list.size();i++) System.out.println(list.get(i));//size 4
	 //회원찾기
	 for(int i=0;i<list.size();i++) {
		 Member m = list.get(i);
		 if(m.name.equals("이순신")) System.out.println(m);
	 }
		
	}
}

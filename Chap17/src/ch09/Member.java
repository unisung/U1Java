package ch09;

public class Member {
	//필드 = 속성 = property = 전역 변수 
	int seqNo;
	String name;
	// 매개변수 있는 생성자
	public Member(int seqNo, String name) {
		this.seqNo = seqNo;
		this.name = name;
	}
	//getter/setter
	public int getSeqNo() { return seqNo;}
	public void setSeqNo(int seqNo) { this.seqNo = seqNo; }
	public String getName() { return name; }
	public void setName(String name) { 	this.name = name; }

	@Override
	public String toString() {
		return "Member [seqNo=" + seqNo + ", name=" + name + "]";
	}
}

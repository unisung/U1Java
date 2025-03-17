package ch01;

public class AccountDept extends Office implements Jobs {

	@Override
	public void printJob() {}

	@Override
	double cal() {
		return 0;
	}
	
	public static void main(String[] args) {
		AccountDept a = new AccountDept();
		System.out.println(a.company);
		System.out.println(a.dept="재무부서");
	}

	@Override
	public void sumJob() {}

}

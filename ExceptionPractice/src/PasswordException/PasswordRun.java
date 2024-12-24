package PasswordException;

public class PasswordRun {
	
	private String password;
	
	public void setUserPwd(String password) throws PasswordException{
		if(password == null) {
			throw new PasswordException("비밀번호를 입력해주세요");
		} 
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("숫자를 섞어서 입력해주세요");
		}
		else if(password.length() < 5) {
			throw new PasswordException("5 이상의 비밀번호를 입력해주세요");
		}
		this.password = password;
		
	}
	
	public static void main(String[] args) {
		String pass = "aa1";
		try {
			new PasswordRun().setUserPwd(pass);
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

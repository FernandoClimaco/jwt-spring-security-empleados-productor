package com.registro.dto;

public class LoginDTO {
	
	private String usernameOrEmail;
	private String password;
	
	
	public LoginDTO(String usernameOrEmail, String password) {
		super();
		this.usernameOrEmail = usernameOrEmail;
		this.password = password;
	}
	
	
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getUsernameOrEmail() {
		return usernameOrEmail;
	}
	public void setUsernameOrEmail(String usernameOrEmail) {
		this.usernameOrEmail = usernameOrEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginDTO [usernameOrEmail=");
		builder.append(usernameOrEmail);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}

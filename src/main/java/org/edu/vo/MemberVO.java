package org.edu.vo;

import java.util.Date;

public class MemberVO {
	private String userid;
	private String userpw;
	private String username;
	private String email;
	private Date regdate;
	private Date updatedate;
	//*학생작업  아래에 get, set 만드세요
	
	
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", email=" + email
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
}

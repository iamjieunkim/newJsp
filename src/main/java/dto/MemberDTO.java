package dto;

import java.util.Date;

public class MemberDTO {
	
	private String member_id;
	private String name;
	private String Tel;
	private Date Birth;
	private Date created_at;
	
	
	
	
	
	public MemberDTO(String member_id, String name, String tel, Date birth, Date created_at) {
		super();
		this.member_id = member_id;
		this.name = name;
		Tel = tel;
		Birth = birth;
		this.created_at = created_at;
	}


	public String getMember_id() {
		return member_id;
	}


	public String getName() {
		return name;
	}


	public String getTel() {
		return Tel;
	}


	public Date getBirth() {
		return Birth;
	}

	public Date getCreated_at() {
		return created_at;
	}
	
	public boolean matchTel(String phonen) {
		return Tel.equals(phonen);
	}



	
}

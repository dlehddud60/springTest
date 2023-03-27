package hello.core.member;

import lombok.Data;

@Data
public class Member {

	public Member(long l, String string, Grade vip) {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGradle(Grade grade) {
		this.grade = grade;
	}
	private long id;

	private String name;	
	private Grade grade;	
}

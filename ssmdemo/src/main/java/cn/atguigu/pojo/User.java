package cn.atguigu.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zijiangfei
 * 
 */
@Table(name = "test")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;

	public User() {
	}

	public User(Integer id, String username, String password, String phone,
			String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", phone=" + phone + ", email=" + email + "]";
	}

}

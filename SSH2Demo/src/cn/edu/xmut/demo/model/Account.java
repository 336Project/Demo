package cn.edu.xmut.demo.model;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 35155233893839253L;
	private Integer id;
	private String name;
	private String password;
	private String realname;

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** full constructor */
	public Account(String name, String password, String realname) {
		this.name = name;
		this.password = password;
		this.realname = realname;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

}
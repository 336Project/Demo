package cn.edu.xmut.demo.model;
// default package



/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String userName;
     private String password;
     private Integer money;


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    /** full constructor */
    public User(String userName, String password, Integer money) {
        this.userName = userName;
        this.password = password;
        this.money = money;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMoney() {
        return this.money;
    }
    
    public void setMoney(Integer money) {
        this.money = money;
    }
   








}
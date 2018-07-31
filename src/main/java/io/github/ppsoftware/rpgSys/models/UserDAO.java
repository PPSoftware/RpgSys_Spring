package io.github.ppsoftware.rpgSys.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class UserDAO implements Serializable {
   //

	    /**
	 * 
	 */
	private static final long serialVersionUID = -2257996512395408133L;


		@Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_Sequence")
	    @SequenceGenerator(name = "user_Sequence", sequenceName = "USER_SEQ")
	    @Column(name = "USER_ID")
	    private long userId;
	    
	    
	    @Column(name = "LOGIN")
	    private String login;
	    
	    @Column(name = "PASSWORD")
	    private String password;
	    
	    @Column(name = "CREATED_AT")
	    private Date created_at;
	    @Column(name = "EMAIL")
	    private String email;
	    public long getUserId() {
			return userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Date getCreated_at() {
			return created_at;
		}

		public void setCreated_at(Date created_at) {
			this.created_at = created_at;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
	    
	    public UserDAO() {
	    }


}
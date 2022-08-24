package catalog;
// default package
// Generated 6 May, 2020 2:33:47 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.SelectBeforeUpdate;

/**
 * Catalog generated by hbm2java
 */
@Entity
@Table(name = "catalog", catalog = "ashish")
@SelectBeforeUpdate
public class Catalog implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8155399230367825617L;
	private int id;
	private String name;
	private String occupation;
	private String address;
	private Integer ctctNo;
	private Date dob;
	private String email;

	public Catalog() {
	}

	public Catalog(int id) {
		this.id = id;
	}

	public Catalog( String name, String occupation, String address, Integer ctctNo, Date dob, String email) {
		
		this.name = name;
		this.occupation = occupation;
		this.address = address;
		this.ctctNo = ctctNo;
		this.dob = dob;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "occupation", length = 45)
	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Column(name = "address", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "ctctNo")
	public Integer getCtctNo() {
		return this.ctctNo;
	}

	public void setCtctNo(Integer ctctNo) {
		this.ctctNo = ctctNo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dob", length = 10)
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

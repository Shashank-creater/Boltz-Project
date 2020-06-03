package in.co.boltz.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="user_detail")
public class UserDetail 
{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pkuserId")
	private Long pkuserId;
	
	
	private String userName;
	
	@Email
	@NotBlank(message="NOT Blank")
	private String emailId;
	private String fristName;
	private String lastName;
	private String mobileNo;
	
	@NotBlank
	private String password;
	private Long createdBy;
	private Date createdDate;
	private Long modifiedBy;
	private Date modifiedDate;
	private String isActive;
	private String ef1;
	private String ef2;
	private String ef3;
	private String ef4;
	private String ef5;
	
	@ManyToOne()
	@JoinColumn(name="fkAddressId")
	private AddressDetail addressDetail;
	
	@ManyToOne
	@JoinColumn(name="fkRoleId")
	private RoleMaster roleMaster;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="userDetail")
	private Set<OrderDetail> orderDetails;
	
	public Long getPkuserId()
	{
		return pkuserId;
	}
	
	public void setPkuserId(Long pkuserId)
	{
		this.pkuserId = pkuserId;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public String getEmailId()
	{
		return emailId;
	}
	
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	
	public String getFristName()
	{
		return fristName;
	}
	
	public void setFristName(String fristName) 
	{
		this.fristName = fristName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getMobileNo() 
	
	{
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) 
	{
		this.mobileNo = mobileNo;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public Long getCreatedBy()
	{
		return createdBy;
	}
	
	public void setCreatedBy(Long createdBy)
	{
		this.createdBy = createdBy;
	}
	
	public Date getCreatedDate() 
	{
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate)
	{
		this.createdDate = createdDate;
	}
	
	public Long getModifiedBy()
	{
		return modifiedBy;
	}
	
	public void setModifiedBy(Long modifiedBy)
	{
		this.modifiedBy = modifiedBy;
	}
	
	public Date getModifiedDate()
	{
		return modifiedDate;
	}
	
	public void setModifiedDate(Date modifiedDate) 
	{
		this.modifiedDate = modifiedDate;
	}
	
	public String getIsActive() 
	{
		return isActive;
	}
	
	public void setIsActive(String isActive) 
	{
		this.isActive = isActive;
	}
	
	public String getEf1()
	{
		return ef1;
	}
	
	public void setEf1(String ef1)
	{
		this.ef1 = ef1;
	}
	
	public String getEf2() 
	{
		return ef2;
	}

	public void setEf2(String ef2) 
	{
		this.ef2 = ef2;
	}
	
	public String getEf3() 
	{
		return ef3;
	}
	
	public void setEf3(String ef3)
	{
		this.ef3 = ef3;
	}
	
	public String getEf4() 
	{
		return ef4;
	}
	
	public void setEf4(String ef4) 
	{
		this.ef4 = ef4;
	}
	
	public String getEf5() 
	{
		return ef5;
	}
	
	public void setEf5(String ef5)
	{
		this.ef5 = ef5;
	}

	public AddressDetail getAddressDetail()
	{
		return addressDetail;
	}

	public void setAddressDetail(AddressDetail addressDetail)
	{
		this.addressDetail = addressDetail;
	}

	public RoleMaster getRoleMaster() 
	{
		return roleMaster;
	}

	public void setRoleMaster(RoleMaster roleMaster)
	{
		this.roleMaster = roleMaster;
	}

	public Set<OrderDetail> getOrderDetails() 
	{
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) 
	{
		this.orderDetails = orderDetails;
	}
	
}

package in.co.boltz.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category_details")
public class CategoryDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long pkCategoryId;
	private String categoryName;
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
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="categoryDetails")
	private Set<SubCategoryDetial> subCategoryDetial;
	
	public Long getPkCategoryId() 
	{
		return pkCategoryId;
	}

	public void setPkCategoryId(Long pkCategoryId)
	{
		this.pkCategoryId = pkCategoryId;
	}

	public String getCategoryName()
	{
		return categoryName;
	}

	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
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
	
	public Set<SubCategoryDetial> getSubCategoryDetial()
	{
		return subCategoryDetial;
	}

	public void setSubCategoryDetial(Set<SubCategoryDetial> subCategoryDetial) 
	{
		this.subCategoryDetial = subCategoryDetial;
	}
}

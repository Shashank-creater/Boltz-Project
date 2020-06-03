package in.co.boltz.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sub_category_detial")
public class SubCategoryDetial 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long pkSubCategoryId;
	private String subCategoryName;
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
	@JoinColumn(name="fkcategoryId")
	private CategoryDetails categoryDetails;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="subCategoryDetial")
	private  Set<ProductInfo> ProductInfo;
	
	public Long getPkSubCategoryId() 
	{
		return pkSubCategoryId;
	}

	public void setPkSubCategoryId(Long pkSubCategoryId) 
	{
		this.pkSubCategoryId = pkSubCategoryId;
	}

	public String getSubCategoryName()
	{
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) 
	{
		this.subCategoryName = subCategoryName;
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
	
	public CategoryDetails getCategoryDetails()
	{
		return categoryDetails;
	}

	public void setCategoryDetails(CategoryDetails categoryDetails) 
	{
		this.categoryDetails = categoryDetails;
	}

	public Set<ProductInfo> getProductInfo() 
	{
		return ProductInfo;
	}

	public void setProductInfo(Set<ProductInfo> productInfo) 
	{
		ProductInfo = productInfo;
	}
 
}

package in.co.boltz.entity;

import java.math.BigDecimal;
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
@Table(name="product_detail")
public class ProductDetail 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long pkProductDetailId;
	private BigDecimal productcost;
	private BigDecimal shippingprice;
	private BigDecimal igst;
	private BigDecimal cgst;
	private BigDecimal sgst;
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
	@JoinColumn(name="fkskuId")
	private SkuMaster skuMaster;
	
	@ManyToOne()
	@JoinColumn(name="fkproductId")
	private ProductInfo productInfo;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="productDetail")
	private Set<OrderDetail> orderDetails;
	
	public Long getPkProductDetailId()
	{
		return pkProductDetailId;
	}

	public void setPkProductDetailId(Long pkProductDetailId) 
	{
		this.pkProductDetailId = pkProductDetailId;
	}

	public BigDecimal getProductcost() 
	{
		return productcost;
	}

	public void setProductcost(BigDecimal productcost) 
	{
		this.productcost = productcost;
	}

	public BigDecimal getShippingprice() 
	{
		return shippingprice;
	}

	public void setShippingprice(BigDecimal shippingprice)
	{
		this.shippingprice = shippingprice;
	}

	public BigDecimal getIgst() 
	{
		return igst;
	}

	public void setIgst(BigDecimal igst)
	{
		this.igst = igst;
	}

	public BigDecimal getCgst() 
	{
		return cgst;
	}

	public void setCgst(BigDecimal cgst) 
	{
		this.cgst = cgst;
	}

	public BigDecimal getSgst() 
	{
		return sgst;
	}

	public void setSgst(BigDecimal sgst) 
	{
		this.sgst = sgst;
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

	public SkuMaster getSkuMaster() 
	{
		return skuMaster;
	}

	public void setSkuMaster(SkuMaster skuMaster)
	{
		this.skuMaster = skuMaster;
	}

	public ProductInfo getProductInfo() 
	{
		return productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) 
	{
		this.productInfo = productInfo;
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

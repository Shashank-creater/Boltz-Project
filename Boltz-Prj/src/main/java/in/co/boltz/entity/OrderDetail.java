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
@Table(name="order_detail")
public class OrderDetail 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long orderId;
	private String ipaddress;
	private Integer productqty;
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
	@JoinColumn(name="fkuserid")
	private UserDetail userDetail;
	
	@ManyToOne()
	@JoinColumn(name="fkproductId")
	private ProductDetail productDetail;
	
	@ManyToOne()
	@JoinColumn(name="fksellerId")
	private SellerInfo sellerInfo;

	@ManyToOne()
	@JoinColumn(name="fkorderstatemasterid")
	private OrderStatemaster orderStatemaster;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="orderDetail")
	private Set<OrderTranslog> orderTranslog;
	
	public Long getOrderId() 
	{
		return orderId;
	}

	public void setOrderId(Long orderId) 
	{
		this.orderId = orderId;
	}

	public String getIpaddress() 
	{
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) 
	{
		this.ipaddress = ipaddress;
	}

	public Integer getProductqty()
	{
		return productqty;
	}

	public void setProductqty(Integer productqty) 
	{
		this.productqty = productqty;
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

	public UserDetail getUserDetail() 
	{
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) 
	{
		this.userDetail = userDetail;
	}

	public ProductDetail getProductDetail()
	{
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail)
	{
		this.productDetail = productDetail;
	}

	public SellerInfo getSellerInfo()
	{
		return sellerInfo;
	}

	public void setSellerInfo(SellerInfo sellerInfo)
	{
		this.sellerInfo = sellerInfo;
	}

	public OrderStatemaster getOrderStatemaster()
	{
		return orderStatemaster;
	}

	public void setOrderStatemaster(OrderStatemaster orderStatemaster) 
	{
		this.orderStatemaster = orderStatemaster;
	}

	public Set<OrderTranslog> getOrderTranslog() 
	{
		return orderTranslog;
	}

	public void setOrderTranslog(Set<OrderTranslog> orderTranslog)
	{
		this.orderTranslog = orderTranslog;
	}
}

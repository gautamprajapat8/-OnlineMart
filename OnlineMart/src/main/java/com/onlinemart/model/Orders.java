package com.onlinemart.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import com.onlinemart.dto.AddressDto;
import com.onlinemart.dto.ProductDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	private LocalDate orderDate;
	
	private String orderStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_order",joinColumns = @JoinColumn(name="order_id", referencedColumnName = "orderId"))
	private Customer customer;
	
	@ElementCollection
	@CollectionTable(name="product_order", joinColumns = @JoinColumn(name="order_id", referencedColumnName = "orderId"))
	private List<ProductDto> pList = new ArrayList<>();
	
	@Embedded
	private AddressDto orderAddress;

	
	public Orders(LocalDate orderDate, String orderStatus, Customer customer, List<ProductDto> pList,
			AddressDto orderAddress) {
		super();
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.customer = customer;
		this.pList = pList;
		this.orderAddress = orderAddress;
	}
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<ProductDto> getpList() {
		return pList;
	}

	public void setpList(List<ProductDto> pList) {
		this.pList = pList;
	}

	public AddressDto getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(AddressDto orderAddress) {
		this.orderAddress = orderAddress;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
				+ ", customer=" + customer + ", pList=" + pList + ", orderAddress=" + orderAddress + "]";
	}

	
	
	
	
	
}



package org.serratec.ecommerce.entities;

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

import org.serratec.ecommerce.enums.ESaleOrderStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sale_order")
public class SaleOrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sale_order_id")
	private Integer saleOrderId;

	@Column(name = "order_date", nullable = false)
	private Date saleOrderDate;

	@Column(name = "order_status", nullable = false)
	private ESaleOrderStatus saleOrderStatus;

	@ManyToOne
	@JoinColumn(name = "client_id", referencedColumnName = "client_id")
	private ClientEntity client;

	@OneToMany(mappedBy = "saleOrder", cascade = CascadeType.ALL)
	Set<SaleOrderProductEntity> saleOrderProducts;
}

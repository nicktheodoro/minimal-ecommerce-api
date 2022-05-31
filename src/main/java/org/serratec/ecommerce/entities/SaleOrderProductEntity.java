package org.serratec.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "sale_order_product")
public class SaleOrderProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sale_order_product_id")
	private Integer salesOrderProductId;

	@Column(name = "quantity", nullable = false)
	private Integer quantity;

	@Column(name = "subtotal", nullable = false)
	private Double subtotal;

	@ManyToOne
	@JoinColumn(name = "product_id")
	ProductEntity product;

	@ManyToOne
	@JoinColumn(name = "sale_order_id")
	SaleOrderEntity saleOrder;
}

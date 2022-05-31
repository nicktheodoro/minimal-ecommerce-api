package org.serratec.ecommerce.entities;

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

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "product")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "produtc_id")
	private Integer productId;

	@Column(name = "product_name", nullable = false)
	private String ProductName;

	@Column(name = "description", nullable = false, length = 500)
	private String description;

	@Column(name = "price", nullable = false)
	private Double price;

	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	private CategoryEntity category;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	Set<SaleOrderProductEntity> saleOrderProducts;
}

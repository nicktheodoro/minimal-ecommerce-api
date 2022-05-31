package org.serratec.ecommerce.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "client")
public class ClientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "client_id")
	private Integer clientId;

	@Column(name = "client_name", nullable = false)
	private String clientName;

	@Column(name = "cpf", nullable = false, unique = true, length = 11)
	private String cpf;

	@Column(name = "birth_date", nullable = false)
	private LocalDate birthDate;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "login", nullable = false, unique = true)
	private String login;

	@Column(name = "password", nullable = false, unique = true)
	private String password;

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<SaleOrderEntity> saleOrders;
}

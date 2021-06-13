package com.example.model.user;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table//(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 20)
	@NotBlank(message = "Iveskite savo varda")
	private String vardas;

	@Column(nullable = false, unique = true, length = 45)
	@NotBlank(message = "Prašome nurodyti el. paštą")
	@Email(message = "Prašome įvesti teisinga el. paštą '@'")
	private String emeilas;

	@Column(nullable = false, length = 15)
	@NotBlank(message = "Prašome nurodyti mobilu numeri")
	private String mobilusis;

	@Column(nullable = false)
	private String pastatas;

	@Column(nullable = false, length = 145)
	@Size(max = 150)
	private String zinute;

	@Column(nullable = false)
	private String meistras;

	@Column(nullable = false)
	private boolean prioritetas;

	@Column(nullable = false, length = 10)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@NotNull(message = "Iveskite pageidaujama data")
	private String pradzia;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVardas() {
		return vardas;
	}





	public void setVardas(String vardas) {
		this.vardas = vardas;
	}





	public String getEmeilas() {
		return emeilas;
	}





	public void setEmeilas(String emeilas) {
		this.emeilas = emeilas;
	}





	public String getMobilusis() {
		return mobilusis;
	}





	public void setMobilusis(String mobilusis) {
		this.mobilusis = mobilusis;
	}





	public String getPastatas() {
		return pastatas;
	}





	public void setPastatas(String pastatas) {
		this.pastatas = pastatas;
	}





	public String getZinute() {
		return zinute;
	}





	public void setZinute(String zinute) {
		this.zinute = zinute;
	}





	public String getMeistras() {
		return meistras;
	}





	public void setMeistras(String meistras) {
		this.meistras = meistras;
	}





	public boolean isPrioritetas() {
		return prioritetas;
	}





	public void setPrioritetas(boolean prioritetas) {
		this.prioritetas = prioritetas;
	}





	public String getPradzia() {
		return pradzia;
	}





	public void setPradzia(String pradzia) {
		this.pradzia = pradzia;
	}





	@Override
	public String toString() {
		return "User [vardas=" + vardas + ", emeilas=" + emeilas + ", mobilusis=" + mobilusis + ", pastatas="
				+ pastatas + ", zinute=" + zinute + ", meistras=" + meistras + ", prioritetas=" + prioritetas
				+ ", pradzia=" + pradzia + "]";
	}
	
	

}

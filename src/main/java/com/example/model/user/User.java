package com.example.model.user;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table//(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 20)
	private String vardas;

	@Column(nullable = false, unique = true, length = 45)
	private String emeilas;

	@Column(nullable = false, length = 15)
	private String mobilusis;

	@Column(nullable = false)
	private String pastatas;

	@Column(nullable = false, length = 145)
	private String zinute;

	@Column(nullable = false)
	private String meistras;

	@Column(nullable = false)
	private boolean prioritetas;

	@Column(nullable = false, length = 10)
	private int pradzia;


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





	public int getPradzia() {
		return pradzia;
	}





	public void setPradzia(int pradzia) {
		this.pradzia = pradzia;
	}





	@Override
	public String toString() {
		return "User [vardas=" + vardas + ", emeilas=" + emeilas + ", mobilusis=" + mobilusis + ", pastatas="
				+ pastatas + ", zinute=" + zinute + ", meistras=" + meistras + ", prioritetas=" + prioritetas
				+ ", pradzia=" + pradzia + "]";
	}
	
	

}

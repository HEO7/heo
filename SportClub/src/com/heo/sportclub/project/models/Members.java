package com.heo.sportclub.project.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.heo.sportclub.project.modelsbase.BaseEntity;


@Entity
@Table(name = "Members")
public class Members extends BaseEntity {
	
	private Long id;
	private String uyeadi;
	private String uyesoyad;
	private Date dogumtarihi;
	private String kimlikno;
	private String gsm;
	private String adres;
	private String email;
	private String cinsiyet;
	private int yas;
	private int boy;
	private int kilo;
	private Date kayittarihi;
	private String acilad;
	private String acilsoyad;
	private String aciltel;
	private String program;
	private String uyeliksure;
	
	@Id
	@SequenceGenerator(name = "seq_members",allocationSize = 1,sequenceName = "seq_members")
	@GeneratedValue(generator = "seq_members",strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "members_name",length = 30)
	public String getUyeadi() {
		return uyeadi;
	}
	public void setUyeadi(String uyeadi) {
		this.uyeadi = uyeadi;
	}
	@Column(name = "members_surname",length = 30)
	public String getUyesoyad() {
		return uyesoyad;
	}
	public void setUyesoyad(String uyesoyad) {
		this.uyesoyad = uyesoyad;
	}
	@Column(name = "birthday")
	public Date getDogumtarihi() {
		return dogumtarihi;
	}
	public void setDogumtarihi(Date dogumtarihi) {
		this.dogumtarihi = dogumtarihi;
	}
	@Column(name = "identity")
	public String getKimlikno() {
		return kimlikno;
	}
	public void setKimlikno(String kimlikno) {
		this.kimlikno = kimlikno;
	}
	@Column(name = "phone")
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	@Column(name = "address")
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "gender")
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	@Column(name = "age")
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Column(name = "height")
	public int getBoy() {
		return boy;
	}
	public void setBoy(int boy) {
		this.boy = boy;
	}
	@Column(name = "kg")
	public int getKilo() {
		return kilo;
	}
	public void setKilo(int kilo) {
		this.kilo = kilo;
	}
	@Column(name = "regdate")
	public Date getKayittarihi() {
		return kayittarihi;
	}
	public void setKayittarihi(Date kayittarihi) {
		this.kayittarihi = kayittarihi;
	}
	
	@Column(name = "emer_name")
	public String getAcilad() {
		return acilad;
	}
	public void setAcilad(String acilad) {
		this.acilad = acilad;
	}
	@Column(name = "emer_surname")
	public String getAcilsoyad() {
		return acilsoyad;
	}
	public void setAcilsoyad(String acilsoyad) {
		this.acilsoyad = acilsoyad;
	}
	@Column(name = "emer_phone")
	public String getAciltel() {
		return aciltel;
	}
	public void setAciltel(String aciltel) {
		this.aciltel = aciltel;
	}
	
	
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	@Column(name = "members_period")
	public String getUyeliksure() {
		return uyeliksure;
	}
	public void setUyeliksure(String uyeliksure) {
		this.uyeliksure = uyeliksure;
	}
	@Override
	public String toString() {
		return "Members [id=" + id + ", uyeadi=" + uyeadi + ", uyesoyad=" + uyesoyad + ", dogumtarihi=" + dogumtarihi
				+ ", kimlikno=" + kimlikno + ", gsm=" + gsm + ", adres=" + adres + ", email=" + email + ", cinsiyet="
				+ cinsiyet + ", yas=" + yas + ", boy=" + boy + ", kilo=" + kilo + ", kayittarihi=" + kayittarihi
				+ ", acilad=" + acilad + ", acilsoyad=" + acilsoyad + ", aciltel=" + aciltel + ", program=" + program
				+ ", uyeliksure=" + uyeliksure + "]";
	}
	
	
	
	
	

	
	
	

}

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
import com.toedter.calendar.JDateChooser;


@Entity
@Table(name = "personel")
public class Personel extends BaseEntity  {
	
	private Long id;
	private String kullaniciadi;
	private String sifre;
	private String ad;
	private String soyad;
	private String telefon;
	private String kimlikno;
	private Date baslamatarihi;
	private String cinsiyet;
	private String egitim;
	
	
	@Id
	@SequenceGenerator(name = "seq_personel",allocationSize = 1,sequenceName = "seq_personel")
	@GeneratedValue(generator = "seq_personel",strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "username",length = 30)
	public String getKullaniciadi() {
		return kullaniciadi;
	}
	public void setKullaniciadi(String kullaniciadi) {
		this.kullaniciadi = kullaniciadi;
	}
	@Column(name = "password",length = 20)
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	@Column(name = "name",length = 30)
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	@Column(name = "surname",length = 30)
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	@Column(name = "phone")
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	@Column(name = "TCKN")
	public String getKimlikno() {
		return kimlikno;
	}
	public void setKimlikno(String kimlikno) {
		this.kimlikno = kimlikno;
	}
	@Column(name = "begindate")
	public Date getBaslamatarihi() {
		return baslamatarihi;
	}
	public void setBaslamatarihi(Date baslamatarihi) {
		this.baslamatarihi = baslamatarihi;
	}
	
	@Column(name = "gender")
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	@Column(name = "education")
	public String getEgitim() {
		return egitim;
	}
	public void setEgitim(String egitim) {
		this.egitim = egitim;
	}
	@Override
	public String toString() {
		return "Personel [id=" + id + ", kullaniciadi=" + kullaniciadi + ", sifre=" + sifre + ", ad=" + ad + ", soyad="
				+ soyad + ", telefon=" + telefon + ", kimlikno=" + kimlikno + ", baslamatarihi=" + baslamatarihi
				+ ", cinsiyet=" + cinsiyet + ", egitim=" + egitim + "]";
	}
	
	
	
	
	
	
	
	

}

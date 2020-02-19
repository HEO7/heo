package com.heo.sportclub.project.models;

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
@Table(name = "Members")
public class Members extends BaseEntity {
	
	private Long id;
	private String uyeadi;
	private String uyesoyad;
	private JDateChooser dogumtarihi;
	private int kimlikno;
	private int gsm;
	private String adres;
	private String hastalik;
	private String cinsiyet;
	private int yas;
	private int boy;
	private int kilo;
	private JDateChooser kayittarihi;
	
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
	public JDateChooser getDogumtarihi() {
		return dogumtarihi;
	}
	public void setDogumtarihi(JDateChooser dogumtarihi) {
		this.dogumtarihi = dogumtarihi;
	}
	@Column(name = "identity")
	public int getKimlikno() {
		return kimlikno;
	}
	public void setKimlikno(int kimlikno) {
		this.kimlikno = kimlikno;
	}
	@Column(name = "phone")
	public int getGsm() {
		return gsm;
	}
	public void setGsm(int gsm) {
		this.gsm = gsm;
	}
	@Column(name = "address")
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	@Column(name = "ill")
	public String getHastalik() {
		return hastalik;
	}
	public void setHastalik(String hastalik) {
		this.hastalik = hastalik;
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
	public JDateChooser getKayittarihi() {
		return kayittarihi;
	}
	public void setKayittarihi(JDateChooser kayittarihi) {
		this.kayittarihi = kayittarihi;
	}
	@Override
	public String toString() {
		return "Members [id=" + id + ", uyeadi=" + uyeadi + ", uyesoyad=" + uyesoyad + ", dogumtarihi=" + dogumtarihi
				+ ", kimlikno=" + kimlikno + ", gsm=" + gsm + ", adres=" + adres + ", hastalik=" + hastalik
				+ ", cinsiyet=" + cinsiyet + ", yas=" + yas + ", boy=" + boy + ", kilo=" + kilo + ", kayittarihi="
				+ kayittarihi + "]";
	}
	
	
	

}

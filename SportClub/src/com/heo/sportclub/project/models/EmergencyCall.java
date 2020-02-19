package com.heo.sportclub.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.heo.sportclub.project.modelsbase.BaseEntity;


@Entity
@Table(name = "Emergency")
public class EmergencyCall extends BaseEntity {
	
	private Long id;
	private String ad;
	private String soyad;
	private String telefon;
	
	@Id
	@SequenceGenerator(name = "seq_emergency",allocationSize = 1,sequenceName = "seq_emergency")
	@GeneratedValue(generator = "seq_emergency",strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "EmergencyCall [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", telefon=" + telefon + "]";
	}
	
	
	

}

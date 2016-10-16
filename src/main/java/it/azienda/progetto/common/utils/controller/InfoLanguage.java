package it.azienda.progetto.common.utils.controller;

import java.io.Serializable;

public class InfoLanguage implements Serializable{

	private String country;
	private String isoCountryCode;
	private String isoLangCode;
	private String urlImage;

	public InfoLanguage(String country, String isoCountryCode, String isoLangCode, String urlImage) {
		super();
		this.country = country;
		this.isoCountryCode = isoCountryCode;
		this.isoLangCode = isoLangCode;
		this.urlImage = urlImage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isoCountryCode == null) ? 0 : isoCountryCode.hashCode());
		result = prime * result + ((isoLangCode == null) ? 0 : isoLangCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoLanguage other = (InfoLanguage) obj;
		if (isoCountryCode == null) {
			if (other.isoCountryCode != null)
				return false;
		} else if (!isoCountryCode.equals(other.isoCountryCode))
			return false;
		if (isoLangCode == null) {
			if (other.isoLangCode != null)
				return false;
		} else if (!isoLangCode.equals(other.isoLangCode))
			return false;
		return true;
	}

	public String getIsoCountryCode() {
		return isoCountryCode;
	}

	public void setIsoCountryCode(String isoCountryCode) {
		this.isoCountryCode = isoCountryCode;
	}

	public String getIsoLangCode() {
		return isoLangCode;
	}

	public void setIsoLangCode(String isoLangCode) {
		this.isoLangCode = isoLangCode;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

}

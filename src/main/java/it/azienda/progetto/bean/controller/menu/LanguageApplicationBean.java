package it.azienda.progetto.bean.controller.menu;

import java.io.Serializable;
import java.util.Locale;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import it.azienda.progetto.bean.controller.login.LoginBean;
import it.azienda.progetto.common.utils.UtilityFunction;
import it.azienda.progetto.common.utils.bean.InfoLanguage;
import it.azienda.progetto.dto.UserDTO;

@ManagedBean(name = "langApplication")
@SessionScoped
public class LanguageApplicationBean implements Serializable {

	private Set<InfoLanguage> langs;
	private String langSelected;
	private Locale areaLang;

	@PostConstruct
	public void initLanguage() {
//		langs = UtilityFunction.loadLang();
	}

	public Locale getAreaLang() {
		return areaLang;
	}

	public void setAreaLang(Locale areaLang) {
		this.areaLang = areaLang;
	}

	public Set<InfoLanguage> getLangs() {
		return langs;
	}

	public void setLangs(Set<InfoLanguage> langs) {
		this.langs = langs;
	}

	public String getLangSelected() {
		return langSelected;
	}

	public void setLangSelected(String langSelected) {
		this.langSelected = langSelected;
	}

	public String changeLanguage(String nation) {

		if(nation.equals("it")){
			this.setAreaLang(new Locale(nation));
			FacesContext.getCurrentInstance().getViewRoot().setLocale(this.getAreaLang());
			
		}
		if(nation.equals("en")){
			this.setAreaLang(new Locale(nation));
			FacesContext.getCurrentInstance().getViewRoot().setLocale(this.getAreaLang());
			
		}
		if(nation.equals("es")){
			this.setAreaLang(new Locale(nation));
			FacesContext.getCurrentInstance().getViewRoot().setLocale(this.getAreaLang());
			
		}
		if(nation.equals("fr")){
			this.setAreaLang(new Locale(nation));
			FacesContext.getCurrentInstance().getViewRoot().setLocale(this.getAreaLang());
			
		}
		return null;
	}

}

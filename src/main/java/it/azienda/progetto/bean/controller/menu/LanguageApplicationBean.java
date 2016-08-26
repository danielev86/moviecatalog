package it.azienda.progetto.bean.controller.menu;

import java.io.Serializable;
import java.util.Locale;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import it.azienda.progetto.common.utils.UtilityFunction;
import it.azienda.progetto.common.utils.bean.InfoLanguage;

@ManagedBean(name = "langApplication")
@ViewScoped
public class LanguageApplicationBean implements Serializable {

	private Set<InfoLanguage> langs;
	private String langSelected;
	private Locale areaLang;

	@PostConstruct
	public void initLanguage() {
		langs = UtilityFunction.loadLang();
		langSelected = "it";
		areaLang = new Locale("it", "IT");
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

	public String changeLanguage() {
		for (InfoLanguage iter : langs) {
			if (iter.getIsoCountryCode().equals(langSelected)) {
				Locale localeTmp = new Locale(iter.getIsoCountryCode(), iter.getIsoLangCode());
				this.setAreaLang(localeTmp);
				FacesContext.getCurrentInstance().getViewRoot().setLocale(this.getAreaLang());

			}
		}
		return null;
	}

}

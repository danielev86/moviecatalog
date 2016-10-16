package it.azienda.progetto.front.example.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="exampleBean")
@ViewScoped
public class ExampleBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean btnConfirmCheck;
	private List<OrdersViewBean> kiids;
	private String url;
	
	@PostConstruct
	public void init(){
		kiids = new ArrayList<>(10);
		for (int i=0;i < 10;i++){
			OrdersViewBean tmp = new OrdersViewBean();
			tmp.setValue(false);
			tmp.setCheck(false);
			kiids.add(tmp); 
		}
		btnConfirmCheck = true;
		url = "https://drive.google.com/file/d/0B6VigHrPYTknWEZHbXNMRjB0NDg/view";
	}

	public boolean isBtnConfirmCheck() {
		return btnConfirmCheck;
	}

	public void setBtnConfirmCheck(boolean btnConfirmCheck) {
		this.btnConfirmCheck = btnConfirmCheck;
	}

	public List<OrdersViewBean> getKiids() {
		return kiids;
	}

	public void setKiids(List<OrdersViewBean> kiids) {
		this.kiids = kiids;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public void openKiid(Integer index){
		kiids.get(index).setCheck(true);
		if (abilityConfirmButton())
			btnConfirmCheck = Boolean.FALSE;
	}
	
	private Boolean abilityConfirmButton(){
		for (OrdersViewBean value:kiids){
			if (!value.getValue().booleanValue())
				return false;
		}
		return true;
	}
	
}

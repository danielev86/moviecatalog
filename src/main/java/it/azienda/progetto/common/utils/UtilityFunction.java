package it.azienda.progetto.common.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import it.azienda.progetto.common.utils.bean.InfoLanguage;

public class UtilityFunction {
	
	public static ResourceBundle getBundle(){
		FacesContext ctx = FacesContext.getCurrentInstance();
		return ctx.getApplication().getResourceBundle(ctx, "msg");
	}
	
	public static void messageError(String bundleMsg){
		FacesContext ctx = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(getBundle().getString(bundleMsg), getBundle().getString(bundleMsg));
		message.setSeverity(FacesMessage.SEVERITY_ERROR);
		ctx.addMessage(null, message);
	}
	
	public static String md5Generator(String input) {

		String md5 = null;

		if (null == input)
			return null;

		try {

			// Create MessageDigest object for MD5
			MessageDigest digest = MessageDigest.getInstance("MD5");

			// Update input string in message digest
			digest.update(input.getBytes(), 0, input.length());

			// Converts message digest value in base 16 (hex)
			md5 = new BigInteger(1, digest.digest()).toString(16);

		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}
		return md5;
	}
	
	public static Set<InfoLanguage> loadLang(){
		Set<InfoLanguage> langApp = new HashSet<>();
		langApp.add(new InfoLanguage("English","en", "EN", ""));
		langApp.add(new InfoLanguage("French","fr", "FR", ""));
		langApp.add(new InfoLanguage("Germany","de", "DE", ""));
		langApp.add(new InfoLanguage("Italian","it", "IT", ""));
		langApp.add(new InfoLanguage("Spanish", "es", "ES", ""));
		return langApp;
		
	}


}

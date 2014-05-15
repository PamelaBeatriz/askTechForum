package asktechforum.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Util {
	
	/**
	 * Converte do formato Data SQL 
	 * para String 
	 * 
	 * @param formato formato da saida tipo dia mes anos(dd/MM/yyyy)
	 * @param data data para fazer cach e formata
	 * @return a data formata em string
	 */
	public String converterDataToString(String formato, Date data){
		String d = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		d = sdf.format(data);
		
		return d;
		
	}
	
	public Date converterStringToDate(String formato, String data) throws ParseException{
		Date d = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		
		d = (Date) sdf.parse(data);
		
		return d;
	}

}

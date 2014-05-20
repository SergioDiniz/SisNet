/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package redesocial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Fatinha de Sousa
 */
public class TratarDatas {
    static SimpleDateFormat format;
	
    static{
	format = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    //Converte De Date para SQL
    public static java.sql.Date converteDateSQL(java.util.Date data){
        java.sql.Date dataSql = new java.sql.Date(data.getTime());
        return dataSql;
    }
        
    //Converte De SQL para Date
    public static java.util.Date converteSqlDate(java.sql.Date data){
        java.util.Date dataSql = new java.util.Date(data.getTime());
        return dataSql;
    }
    
    //Converte String para Date
    public static Date converterStringParaDate(String date) throws ParseException {		
	return format.parse(date);	
    }
	
    //Converte Date para String
    public static String converterDateParaString(Date date) throws ParseException {		
	return format.format(date);
    }	
}
package com.qianjiajia.kitchen.common.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-06 16:00
 */
public class JaxDateAdapter extends XmlAdapter<String, Date> {
    static  final String STANDARM_DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";

    @Override
    public Date unmarshal(String v) throws Exception {
        if(v == null){
            return null;
        }
        DateFormat format = new SimpleDateFormat(STANDARM_DATE_FORMAT);
        return format.parse(v);
    }

    @Override
    public String marshal(Date v) throws Exception {
        DateFormat format = new SimpleDateFormat(STANDARM_DATE_FORMAT);
        return format.format(v);
    }
}
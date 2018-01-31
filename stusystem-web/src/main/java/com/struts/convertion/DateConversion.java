package com.struts.convertion;

import com.struts.utils.DataFormatUtil;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Date;
import java.util.Map;

/**
 * struts类型转换器
 * @author Administrator
 *
 */
public class DateConversion extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		if(arg1!=null&&arg1.length>0){
			if(arg1[0]!=null){
				return DataFormatUtil.parseStringToDate(arg1[0]);
			}
		}
		return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		return DataFormatUtil.formatToString((Date)arg1);
	}

}

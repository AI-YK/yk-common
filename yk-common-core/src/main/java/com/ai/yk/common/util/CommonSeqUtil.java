package com.ai.yc.common.util;


import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.yc.common.constants.Constants;


 /**
  * 
  *
  * Date: 2015年10月20日 <br>
  * Copyright (c) 2015 asiainfo.com <br>
  * @author zhanglh
  */
public final class CommonSeqUtil {

    private CommonSeqUtil(){
    }

     
     public static String getAreaCode() {    	 
         return SeqUtil.getNewId(Constants.SEQ.AREA_CODE_SEQ).toString();
     }

    
}

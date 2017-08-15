package Date;

import util.AESUtil;
import util.MD5Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 14:03 2017/5/23
 * @Modified By:
 */
public class DateTest {
    public static void main(String[] args) {
        /*Date date = new Date();//获取当前时间
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -7);//当前时间减去一年，即一年前的时间
        //calendar.add(Calendar.MONTH, -1);//当前时间前去一个月，即一个月前的时间
        calendar.getTime();//获取一年前的时间，或者一个月前的时间
        format.format(calendar.getTime());
        System.out.println(format.format(calendar.getTime()));
        System.out.println( calendar.get(Calendar.YEAR));*/
        /*double d = 9.20;
        System.out.println(d);*/
        /*String s = "hehe";
        System.out.println(Double.parseDouble(s));*/
        /*List<String> list = new ArrayList<>();
        list.add("appid");
        list.add("mch_id");
        list.add("transaction_id");
        list.add("nonce_str");
        list.add("sign");
        Collections.sort(list);
        System.out.println(list);*/
        /*String returnXml = "<openid><![CDATA[oUAows4G1Fac6TBPlLF-loa05jR4]]></openid>";
        System.out.println((int)0.01);
        Map<String,String> sortedMap = new TreeMap<>();
        sortedMap.put("timeStamp","timeStamp");
        sortedMap.put("currUrl","currUrl");
        sortedMap.put("sign","sign");
        System.out.println(sortedMap);
        StringBuffer stringBuffer = new StringBuffer();
        for(String key:sortedMap.keySet()){
            if(!"sign".equals(key)){
                stringBuffer.append("&"+key+"="+sortedMap.get(key));
            }
        }
        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer.toString());*/
        //
        String timeStamp = AESUtil.AESEncode("hymxzhinkdfypbb",String.valueOf(System.currentTimeMillis()));
        String currUrl = AESUtil.AESEncode("hymxzhinkdfypbb","www.baidu.com");
        System.out.println(currUrl);
        System.out.println(timeStamp);
        Map<String,String> sortedMap = new TreeMap<>();
        sortedMap.put("timeStamp",timeStamp);
        sortedMap.put("currUrl",currUrl);
        StringBuffer stringBuffer = new StringBuffer();
        for(String key:sortedMap.keySet()){
            if(!"sign".equals(key)){
                stringBuffer.append("&"+key+"="+sortedMap.get(key));
            }
        }
        stringBuffer.append("&key=hymxzhinkdfypbb");
        stringBuffer.deleteCharAt(0);
        String computeSign = MD5Util.getMD5(stringBuffer.toString());
        System.out.println(computeSign);
    }
}

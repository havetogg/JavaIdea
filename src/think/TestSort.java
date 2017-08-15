package think;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 11:56 2017/5/18
 * @Modified By:
 */
public class TestSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("mch_appid");
        list.add("mchid");
        list.add("nonce_str");
        list.add("sign");
        list.add("partner_trade_no");
        list.add("openid");
        list.add("check_name");
        list.add("amount");
        list.add("desc");
        list.add("spbill_create_ip");
        Collections.sort(list);
        for(String s:list){
            System.out.println(s);
        }
    }
}

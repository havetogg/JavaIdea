package Test;

import java.math.BigDecimal;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 17:41 2017/7/3
 * @Modified By:
 */
public class TestFee {
    public static void main(String[] args) {
        BigDecimal getMoney = new BigDecimal("1").subtract(new BigDecimal("0.02"));
        BigDecimal withDraw = new BigDecimal("250");
        int wxAmount = (getMoney.multiply(withDraw).multiply(new BigDecimal("100"))).intValue();
        System.out.println(wxAmount);
    }
}

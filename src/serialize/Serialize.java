package serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 10:29 2017/5/4
 * @Modified By:
 */
public class Serialize implements Serializable{
    private static final long serialVersionUID = 1L;
    public int num = 1390;

    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("d:/serialize.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Serialize serialize = new Serialize();
            oos.writeObject(serialize);
            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

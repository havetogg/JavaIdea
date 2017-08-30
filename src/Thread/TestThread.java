package Thread;

import java.util.*;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 17:40 2017/8/29
 * @Modified By:
 */
public class TestThread {

    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        for(int i=0;i<100;i++){
            User user = new User();
            user.setName("用户"+i);
            user.setNum(1000);
            users.add(user);
        }
        for(int j=0;j<100;j++){
            User user = users.get(j);
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while(user.getNum()>=20){
                        int random = new Random().nextInt(user.getNum());
                        user.setNum(user.getNum()-random);
                        int ran = new Random().nextInt(100);
                        users.get(ran).setNum(users.get(ran).getNum()+random);
                        //System.out.println(user.getName()+"向"+users.get(ran).getName());
                        //System.out.println(user.getNum()+"---"+users.get(ran).getNum());
                        int noMoney = 0;
                        for(User user1:users){
                            if(user1.getNum()<=20){
                                noMoney++;
                            }
                        }
                        try {
                            Thread.sleep(5);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println(user.getName()+"已经破产");
                }
            });
            thread.start();
        }
    }
}

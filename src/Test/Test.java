package Test;


import java.io.File;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 15:17 2017/7/6
 * @Modified By:
 */
public class Test {
    private int a;
    public void funA(){
        a = 2;
    }
    public void funB(){
        System.out.println(a);
    }

    public static int c(){
        try{
            throw new Exception("h");
        }catch (Exception e){
            e.printStackTrace();
            return 1;
        }
    }

    public static void main(String[] args) throws Exception{
        /*Test test = new Test();
        test.funA();
        test.funB();*/
        /*for(int i=0;i<1000;i++){
            if(new Random().nextInt(26) == 26){
                System.out.println(1);
            }
            //System.out.println(new Random().nextInt(26));
            //System.out.println(10+new Random().nextInt(26));
        }*/
        /*ConcurrentHashMap<Integer,CopyOnWriteArraySet<String>> concurrentHashMap = new ConcurrentHashMap();
        CopyOnWriteArraySet<String> copyOnWriteArraySet = concurrentHashMap.get(0);
        System.out.println(copyOnWriteArraySet);*/
        /*SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String  a= "2017-07-27 18:31:41.0";
        String date = sDateFormat.format(sDateFormat.parse(a));
        System.out.println(date);*/

        /*String a ="* Initiates the asynchronous transmission of a text message. This method \n" +
                "         * returns before the message is transmitted. Developers use the \n" +
                "         * returned Future object to track progress of the transmission. The\n" +
                "         * Future's get() method returns {@code null} upon successful completion. Errors\n" +
                "         * in transmission are wrapped in the {@link java.util.concurrent.ExecutionException} \n" +
                "         * thrown when querying the Future object.\n" +
                "         *\n" +
                "         * @param text the text being sent.\n" +
                "         * @return the Future object representing the send operation.\n" +
                "         * @throws IllegalArgumentException if the text is {@code null}.";
        char[] as = a.toCharArray();
        StringBuffer b = new StringBuffer();
        for(char c:as){
            if(c == '*'){
                b.append(" ");
            }else{
                b.append(c);
            }
        }
        System.out.println(b);*/

        //System.out.println(new StringBuffer().append("username=").append("2").append("&password=").append("3").toString());

        /*for(int i=0;i<100;i++){
            try{
                System.out.println(i);
                if(i==5){
                    throw new RuntimeException("异常啦");
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                continue;
            }
        }*/

        /*System.out.println(c());*/
        /*Map<String,String> myMap*/

        RandomAccessFile randomAccessFile = new RandomAccessFile("data/nio.text","rw");
        FileChannel fileChannel = randomAccessFile.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(48);

        int bytesRead = fileChannel.read(byteBuffer);
        while(bytesRead != -1){
            System.out.println("Read"+bytesRead);
            byteBuffer.flip();

            while(byteBuffer.hasRemaining()){
                System.out.println((char)byteBuffer.get());
            }

            byteBuffer.clear();
            bytesRead = fileChannel.read(byteBuffer);

        }
        randomAccessFile.close();
    }
}

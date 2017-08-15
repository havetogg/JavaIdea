package Test;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 10:52 2017/6/30
 * @Modified By:
 */
public class SortTest {

    public static int[] insert_sort(int[] array){
        int i,j;
        int temp;
        for(i = 1;i < array.length;i++)
        {
            temp = array[i];
            for(j = i;j > 0&& array[j - 1] > temp;j--)

            {
                array[j]= array[j - 1];
            }
            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(SortTest.insert_sort(new int[]{5,7,4,1,8,4,9,3}));
    }
}

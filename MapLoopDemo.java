import com.google.common.collect.Maps;
import java.util.Map;

/**
 * @author harold
 *
 */
public class MapLoopDemo {

    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {
            Map<String, Object> map = Maps.newHashMap();

            for (int i = 0; i < 100000; i++) {
                map.put("k" + i, "v00" + i);
            }
            MyThread mythread = new MyThread(map);
            mythread.run();
        }


    }

}

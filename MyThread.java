import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.springframework.util.StopWatch;

public class MyThread extends Thread {
    public void run() { 
        testMap(map);
    }
    Map<String, Object> map;
    public MyThread( Map<String, Object> map)
    {
        this.map = map;
    }
    
    public static void testMap(Map<String, Object> myMap) {
        StopWatch sw = new StopWatch(UUID.randomUUID().toString());


       
        sw.start("start for loop");
        for (Map.Entry<String, Object> each : myMap.entrySet()) {
            String key1 = each.getKey();
            Object value1 = each.getValue();

//             String line2 = key + value;

        }
        sw.stop();
        

        
        sw.start("start Iterator set loop");
        Iterator it = myMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String key2 = (String) entry.getKey();
            Object value2 = entry.getValue();

//             String line1 = key + value;

        }
        sw.stop();
        
        


        sw.start("start Iterator key loop");
        Iterator keyIt = myMap.keySet().iterator();
        while (keyIt.hasNext()) {
            String key3 = (String) keyIt.next();
            Object value3 = myMap.get(key3);

//             String line3 = key + value;
        }
        sw.stop();


        System.out.println(sw.prettyPrint());
        System.out.println();



    }

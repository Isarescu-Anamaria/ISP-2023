package isp.lab8.airways;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class SerializableUtil {

    private static String basePath = "D:\\an2\\an2_sem2\\curs_isp\\waypointsExample";

    public static ArrayList<Waypoint> loadSerializedObjects(String routeName) throws IOException, ClassNotFoundException {
        routeName = basePath + "\\"+routeName;
        ArrayList<Waypoint> objects = new ArrayList<>();
        File folder = new File(routeName);
        File[] files = folder.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".ser");
            }
        });

        for (File file : files) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Waypoint obj = (Waypoint)ois.readObject();
            objects.add(obj);
            ois.close();
            fis.close();
        }

        return objects;
    }


    public static void saveSerializedObjects(ArrayList<Waypoint> objects, String routeName) throws IOException {
        routeName = basePath + "\\"+routeName;
        File folder = new File(routeName);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        for (int i = 0; i < objects.size(); i++) {
            Object obj = objects.get(i);
            String filePath = routeName + "/object" + i + ".ser";
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Waypoint w2 =new Waypoint(1, "WP1",12.3,23.2,1000);
        Waypoint w3 =new Waypoint(2, "WP2",12.3,23.2,1000);
        Waypoint w4 =new Waypoint(3, "WP3",12.3,23.2,1000);
        ArrayList<Waypoint> list = new ArrayList<>();
        list.add(w2);
        list.add(w3);
        list.add(w4);

        saveSerializedObjects(list,"ruta5");
//
//
//        ArrayList<Waypoint> list2 = loadSerializedObjects("ruta1");
//
//        for(Waypoint w:list2){
//            System.out.println(w);
//        }

    }

}

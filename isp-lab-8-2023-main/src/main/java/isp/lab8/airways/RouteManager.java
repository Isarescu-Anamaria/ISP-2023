package isp.lab8.airways;

import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class RouteManager implements IRouteManager {

    @Override
    public void createRoute(List<Waypoint> waypoints, String routeName) throws RouteManagementException {

        try {
            SerializableUtil.saveSerializedObjects((ArrayList) waypoints, routeName);
        } catch (IOException e) {
            throw new RouteManagementException("Error while saving list: " + e.getMessage());
        }
    }

    @Override
    public List<Waypoint> getRoute(String routeName) throws RouteManagementException {
        List<Waypoint> waypoints;
        try {
            waypoints = SerializableUtil.loadSerializedObjects(routeName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return waypoints;
    }

    @Override
    public double getRouteDistance(String routeName) throws RouteManagementException {

        List<Waypoint> list = getRoute(routeName);
        double distance = 0;
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            int j = i + 1;
            double lat1, lon1, lat2, lon2;
            lat1 = list.get(i).getLatitude();
            lon1 = list.get(i).getLongitude();
            lat2 = list.get(j).getLatitude();
            lon2 = list.get(j).getLongitude();
            distance += WaypointDistanceCalculator.calculateDistance(lat1, lon1, lat2, lon2);
        }
        return distance;
    }

    @Override
    public void deleteRoute(String routeName) throws RouteManagementException {

        String basePath = "D:\\an2\\an2_sem2\\curs_isp\\waypointsExample";
        routeName = basePath + "\\"+routeName;
        File file = new File(routeName);
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                f.delete();
            }
        }
        file.delete();

    }

    public static void main(String[] args) {
        RouteManager rm = new RouteManager();
        ArrayList<Waypoint> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Create new route");
        System.out.println("Enter the name of the desired route name: ");
        String routeName = sc.next();
        System.out.println("Introduce the number of waypoints");
        int nb = Integer.parseInt(sc.next());
        //System.out.println("nb = " + nb);
        for (int i = 0; i < nb; i++) {
            int j = i + 1;
            System.out.println("Introduce the name of the " + j + " waypoint");
            String nameOfWaypoint = sc.next();
            System.out.println("Introduce the latitude of the " + j + " waypoint");
            double latitudeOfWaypoint = Double.parseDouble(sc.next());
            System.out.println("Introduce the longitude of the " + j + " waypoint");
            double longitudeOfWaypoint = Double.parseDouble(sc.next());
            System.out.println("Introduce the altitude of the " + j + " waypoint");
            int altitudeOfWaypoint = Integer.parseInt(sc.next());
            Waypoint w = new Waypoint(i, nameOfWaypoint, latitudeOfWaypoint, longitudeOfWaypoint, altitudeOfWaypoint);
            list.add(w);
        }
        try {
            rm.createRoute(list, routeName);
        } catch (RouteManagementException e) {
            throw new RuntimeException(e);
        }

        //display all waypoints
        System.out.println("The waypoints of the route " + routeName + " is:");
        List<Waypoint> newList;
        try {
            newList = rm.getRoute(routeName);
        } catch (RouteManagementException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }

        double d;
        try {
            d = rm.getRouteDistance(routeName);
        } catch (RouteManagementException e) {
            throw new RuntimeException(e);
        }
        //display the distance
        System.out.println("Distance = " + d);

        //display the list of available routes
        File basePath = new File("D:\\an2\\an2_sem2\\curs_isp\\waypointsExample");
        System.out.println("The list of routes is: ");
        File[] files = basePath.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.print(file.getName() + " , ");
            }
        }

        //delete a route
        try {
            rm.deleteRoute("ruta20");
        } catch (RouteManagementException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The list of routes after deleting is: ");
        File[] files1 = basePath.listFiles();
        for (File file : files1) {
            if (file.isDirectory()) {
                System.out.print(file.getName() + " , ");
            }
        }

    }
}

package isp.lab8.airways;

import java.util.List;
public interface IRouteManager {
    void createRoute(List<Waypoint> waypoints, String routeName) throws RouteManagementException;
    List<Waypoint> getRoute(String routeName)throws RouteManagementException;
    double getRouteDistance(String routeName)throws RouteManagementException;
    void deleteRoute(String routeName)throws RouteManagementException;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder.components;

/**
 *
 * @author eduar
 */
public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London to Scotland yard, 8-10 Broadway, London";
    }
    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }
    public String getRoute() {
        return route;
    }

}

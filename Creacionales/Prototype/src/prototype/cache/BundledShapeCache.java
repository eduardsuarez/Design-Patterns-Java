/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype.cache;

import java.util.HashMap;
import java.util.Map;
import prototype.shapes.Circle;
import prototype.shapes.Rectangle;
import prototype.shapes.Shape;

/**
 * Fabrica de prototipos
 *
 * @author eduar
 */
public class BundledShapeCache {

    private Map<String, Shape> cache = new HashMap<>();
    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 20;
        circle.color = "Green";
        
        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";
        
        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }
    
    public Shape get(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}

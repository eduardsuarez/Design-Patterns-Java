/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

import prototype.cache.BundledShapeCache;
import prototype.shapes.Shape;

/**
 *
 * @author eduar
 */
public class Demo {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();
        
        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium  blue rectangle");
        Shape shape3 = cache.get("Medium  blue rectangle");
        
        if(shape1 != shape2 && !shape1.equals(shape2)){
            System.out.println("Big green circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big  green circle == Medium blue rectangle (booo!)");
        }
        
        if(shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different object (yay!)");
            if(shape2.equals(shape3)){
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
        
    }
    
}

//Write an application that will read diameter of a circle (variable of type float) and
//calculate perimeter of given circle.
//Firstly, assume π = 3.14. Later, use value of π from built-in Math class

public class Circle {
    public static float circlePerimeter(float diameter){
        float radius = diameter / 2f;
        return (float) (2 * Math.PI * radius);
    }
}

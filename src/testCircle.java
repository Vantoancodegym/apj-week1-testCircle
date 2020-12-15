public class testCircle {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        Circle circle2=new Circle(5);
        circle1.setRadius(6);
        circle2.setColor("blue");
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }


}
class Circle{
    private int radius = 1;
    private String color = "red";
    public Circle(){};
    public Circle(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +"area = "+this.getArea()+
                '}';
    }
}

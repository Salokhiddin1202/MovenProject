package uz.brogrammers;

public class Doira implements Shape {
    private int radius;

    public Doira(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int yuza() {
        return (int) (Math.PI * Math.pow(radius, 2));

    }
}

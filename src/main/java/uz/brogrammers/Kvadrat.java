package uz.brogrammers;

public class Kvadrat implements Shape {
    private int tomon;

    public Kvadrat(int tomon) {
        this.tomon = tomon;
    }
    @Override
    public int yuza(){
        return (int) Math.pow(tomon,2);
    }

}

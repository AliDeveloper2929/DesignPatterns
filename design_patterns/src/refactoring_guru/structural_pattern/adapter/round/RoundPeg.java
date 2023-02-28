package refactoring_guru.structural_pattern.adapter.round;

public class RoundPeg {
    private double radius;
    public RoundPeg(double radius){
        this.radius = radius;
    }

    public RoundPeg(){}

    public double getRadius(){
        return radius;
    }
}

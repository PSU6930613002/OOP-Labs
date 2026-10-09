public class EquilateralTriangle implements Triangle{
    private double side;
    public EquilateralTriangle(double side){
        this.side = side;
    }
    @Override 
    public double getLongestSideLength(){
        return this.side;
    }
    @Override 
    public double getLargestAngle(){
        return 60.0d;
    }
    @Override 
    public double getPerimeter(){
        return this.side*3;
    }
}

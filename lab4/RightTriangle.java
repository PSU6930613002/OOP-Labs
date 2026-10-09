public class RightTriangle implements Triangle{
    private double side1,side2,side3;
    public RightTriangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double getLongestSideLength(){
        double longest = this.side1;
        if(this.side2 > longest){
            longest = this.side2;
        }
        if(this.side3 > longest){
            longest = this.side3;
        }
        return longest;
    }
    @Override
    public double getPerimeter(){
        return (side1+side2+side3);
    }
    @Override
    public double getLargestAngle(){
        return 90.0d;
    }
}
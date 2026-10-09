public class TriangleManagerTest{
    public static void main(String[] args){
        TriangleManager m1 = new TriangleManager(true);
        TriangleManager m2 = new TriangleManager(false);
        Triangle t1 = new EquilateralTriangle(5.0);
        Triangle t2 = new RightTriangle(6.0, 8.0, 10.0);
        m1.addTriangle(t1);
        m1.addTriangle(t2);
        m2.addTriangle(t1);
        m2.addTriangle(t2);
        Triangle largest1 = m1.findTriangleWithLargestPerimeter();
        Triangle largest2 = m2.findTriangleWithLargestPerimeter();
        System.out.println("ArrayList: " + largest1.getPerimeter());
        System.out.println("Longest side: " + largest1.getLongestSideLength());
        System.out.println("Largest angle: " + largest1.getLargestAngle());
        System.out.println("LinkedList: " + largest2.getPerimeter());
        try{
            m1.addTriangle(null);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
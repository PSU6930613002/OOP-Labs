import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class TriangleManager{
    private List<Triangle> triangles;
    public TriangleManager(boolean useArrayList){
        if(useArrayList == true){
            this.triangles = new ArrayList<Triangle>();
        }
        else{
            this.triangles = new LinkedList<Triangle>();
        }
    }
    public void addTriangle(Triangle t){
        if(t == null){
            throw new IllegalArgumentException("Triangle cannot be null");
        }
        else{
            this.triangles.add(t);
        }
    }
    public Triangle findTriangleWithLargestPerimeter(){
        if(this.triangles.size() == 0){
            return null;
        }
        Triangle largest = this.triangles.get(0);
        for(int i = 1; i < this.triangles.size(); i++){
            Triangle current = this.triangles.get(i);
            if(current.getPerimeter() > largest.getPerimeter()){
                largest = current;
            }
        }
        return largest;
    }
}

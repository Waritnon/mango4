import static java.lang.Math.max;
import static java.lang.Math.min;

public class BoundaryInterval implements Interval{
    int leftBoundary;
    int rightBoundary;
    public  BoundaryInterval(int lb,int rb){
        leftBoundary = lb;
        rightBoundary = rb;
    }
    public int getSmallestElement(){
        return leftBoundary;
    }
    public int getLargestElement(){
        return rightBoundary;
    }
    public Interval intersect(Interval r){
        if(max(leftBoundary,r.getSmallestElement()) <= min(rightBoundary,r.getLargestElement()))
            return new BoundaryInterval(
                    max(leftBoundary, r.getSmallestElement()),
                    min(rightBoundary, r.getLargestElement()));
        else return new BoundaryInterval(0,0);
        }
}

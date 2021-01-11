public class Tinggle extends Shape{
    private int  bottom;
    private int  height;

    public Tinggle(int bottom, int height) {
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public float computerarea() {
        System.out.println("计算三角形的面积");
        return bottom*height/2;
    }
}

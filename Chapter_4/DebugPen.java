class DebugPen
{
    private String color;
    private String point;


    public DebugPen()
    {
        color = "black";
        point = "fine";
    }


    public DebugPen(String color, String point)
    {
        this.color = color;   
        this.point = point;   
    }


    public String getColor()
    {
        return color;
    }


    public String getPoint()
    {
        return point;
    }


    public void showData()
    {
        System.out.println("Color: " + color + ", Point: " + point);
    }


    public static void main(String[] a)
    {
        DebugPen pen1 = new DebugPen();
        System.out.println("Pen 1 (default):");
        pen1.showData();

        DebugPen pen2 = new DebugPen("blue", "medium");
        System.out.println("Pen 2 (custom):");
        pen2.showData();
    }
}

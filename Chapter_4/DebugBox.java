class DebugBox
{
    private int width;
    private int length;
    private int height;


    public DebugBox()
    {
        length = 1;
        width = 1;
        height = 1;
    }


    public DebugBox(int width, int length, int height)
    {
        this.width = width;
        this.length = length;  
        this.height = height;  
    }


    public void showData()
    {
        System.out.println("Width: " + width + " Length: " +
                           length + " Height: " + height);
    }


    public double getVolume()
    {
        return length * width * height;
    }


    public static void main(String[] a)
    {

        DebugBox box1 = new DebugBox();
        System.out.println("Box 1 (default values):");
        box1.showData();
        System.out.println("Volume: " + box1.getVolume());
        System.out.println();


        DebugBox box2 = new DebugBox(3, 4, 5);
        System.out.println("Box 2 (custom values):");
        box2.showData();
        System.out.println("Volume: " + box2.getVolume());
    }
}

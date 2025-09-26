class DebugTrip
{
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";


    public DebugTrip(String destination)
    {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }


    public DebugTrip(String destination, String departure)
    {
        this(destination, departure, DEFAULT_MODE);  
    }


    public DebugTrip(String destination, String departure, String mode)
    {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination()
    {
        return destination;
    }

    public String getDepartureCity()
    {
        return departure;
    }

    public String getMode()
    {
        return mode;
    }


    public void showData()
    {
        System.out.println("Trip from " + departure + " to " + destination +
                           " by " + mode);
    }


    public static void main(String[] a)
    {
        DebugTrip trip1 = new DebugTrip("New York");
        trip1.showData();  

        DebugTrip trip2 = new DebugTrip("Chicago", "Miami");
        trip2.showData();  

        DebugTrip trip3 = new DebugTrip("Los Angeles", "Dallas", "plane");
        trip3.showData();  
    }
}

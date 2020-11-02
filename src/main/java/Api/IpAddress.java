package Api;

public class IpAddress
{
    private String address;
    private String status;

    public IpAddress(String address, String status)
    {
        this.address = address;
        this.status = status;
    }

    public String getAddr()
    {
        return address;
    }

    public String getStatus()
    {
        return status;
    }
}
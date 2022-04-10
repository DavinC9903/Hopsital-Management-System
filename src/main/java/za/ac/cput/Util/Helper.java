package za.ac.cput.Util;

import java.util.UUID;

public class Helper
{
    //Generating PK for receptionist
    public static String generateReceptionistID()
    {
        return UUID.randomUUID().toString();
    }

    //Generating PK for Bill
    public static String generateBillNO()
    {
        return UUID.randomUUID().toString();
    }
}

package za.ac.cput.Factory;

import za.ac.cput.Entity.Receptionist;
import za.ac.cput.Util.Helper;

public class ReceptionistFactory
{
    public static Receptionist createReceptionist(String receptionistID,
                                                  String receptionistName,
                                                  String receptionistPassword,
                                                  long receptionistTelephoneNumber)
    {
        receptionistID = Helper.generateReceptionistID();
        Receptionist reception = new Receptionist.Builder()
                .setReceptionistID(receptionistID)
                .setReceptionistName(receptionistName)
                .setReceptionistPassword(receptionistPassword)
                .setReceptionistTelephoneNumber(receptionistTelephoneNumber)
                .build();
        return reception;
    }

    public static void main(String[] args)
    {
        Receptionist reception = ReceptionistFactory.createReceptionist("9903223", "davin", "rtry",
                32435);
        System.out.println(reception);
    }
}

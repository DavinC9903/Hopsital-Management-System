package za.ac.cput.Repository;

import za.ac.cput.Entity.Receptionist;

import java.util.HashSet;
import java.util.Set;

public class ReceptionistRepository
{
    private static ReceptionistRepository repository = null;//EDITED
    private Set<Receptionist> receptionistDB = null;//EDITED

    private ReceptionistRepository()
    {
        receptionistDB = new HashSet<Receptionist>();
    }

    public static ReceptionistRepository getRepository()//EDITED
    {
        if(repository == null)
        {
            repository = new ReceptionistRepository();
        }
        return repository;
    }

    public void create()
    {
        //Schedule Appointment CREATE
    }
    public Receptionist read(String receptionistID)
    {
        Receptionist receptionist = receptionistDB.stream()
                .filter(e ->e.getReceptionistID().equals(receptionistID))
                .findAny()
                .orElse(null);
        return receptionist;
    }

    public Receptionist update(Receptionist receptionist)
    {
        Receptionist updateReceptionist = read(receptionist.getReceptionistID());
        if(updateReceptionist != null)
        {
            receptionistDB.remove(updateReceptionist);
            receptionistDB.add(receptionist);
            return receptionist;
        }
        return null;
    }

    public Boolean delete(String receptionistID)
    {
        Receptionist deleteReceptionist = read(receptionistID);
        if(deleteReceptionist == null)
            return false;
        receptionistDB.remove(deleteReceptionist);
        return true;
    }
    public Set<Receptionist> getAll()
    {
        return receptionistDB;
    }
}

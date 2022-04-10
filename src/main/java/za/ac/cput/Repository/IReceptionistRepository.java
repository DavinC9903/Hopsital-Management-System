package za.ac.cput.Repository;

import za.ac.cput.Entity.Bill;
import za.ac.cput.Entity.Receptionist;

import java.util.Set;

public interface IReceptionistRepository extends IRepository <Receptionist, String>
{
    Receptionist create(Receptionist receptionist);
    Receptionist read(String receptionistID);
    public Set<Bill> getAll();
}

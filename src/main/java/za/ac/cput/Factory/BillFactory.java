package za.ac.cput.Factory;

import za.ac.cput.Entity.Bill;
import za.ac.cput.Util.Helper;

public class BillFactory
{
    public static Bill createBill(String billNo,
                                    String patientID,
                                    String patientName,
                                    float billAmount)
    {
        billNo = Helper.generateBillNO();
        Bill bill = new Bill.Builder()
                .setBillNo(billNo)
                .setPatientID(patientID)
                .setPatientName(patientName)
                .setBillAmount(billAmount)
                .build();
        return bill;
    }

    public static void main(String[] args)
    {
        Bill bill = BillFactory.createBill("07122323", "6789", "Davin", 213f);

        System.out.println(bill);
    }
}

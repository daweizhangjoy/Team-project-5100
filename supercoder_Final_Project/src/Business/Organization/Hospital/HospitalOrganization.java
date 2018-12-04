/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Hospital;

import Business.Hospital_Doctor.DoctorDirectory;
import Business.Hospital_TotalSupply.TotalSupplyDirectory;
import Business.Organization.Organization;
//import Business.WorkQueue.WorkQueue;
/**
 *
 * @author raunak
 */
public abstract class HospitalOrganization extends Organization{
    
    private DoctorDirectory hospitalDoctorDirectory;
    private TotalSupplyDirectory hospitalTotalSupplyDirectory;
    
    
    public HospitalOrganization(String name) {
        super(name);
        hospitalDoctorDirectory = new DoctorDirectory();
        hospitalTotalSupplyDirectory = new TotalSupplyDirectory();
    }

    public DoctorDirectory getHospitalDoctorDirectory() {
        return hospitalDoctorDirectory;
    }

    public void setHospitalDoctorDirectory(DoctorDirectory hospitalDoctorDirectory) {
        this.hospitalDoctorDirectory = hospitalDoctorDirectory;
    }

    public TotalSupplyDirectory getHospitalTotalSupplyDirectory() {
        return hospitalTotalSupplyDirectory;
    }

    public void setHospitalTotalSupplyDirectory(TotalSupplyDirectory hospitalTotalSupplyDirectory) {
        this.hospitalTotalSupplyDirectory = hospitalTotalSupplyDirectory;
    }

    
}

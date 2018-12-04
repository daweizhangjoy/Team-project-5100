/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Hospital;

import Business.Hospital_Doctor.DoctorDirectory;
import Business.Hospital_Employee.EmployeeDirectory;
import Business.Hospital_TotalSupply.TotalSupplyDirectory;
import Business.Hospital_UserAccount.UserAccountDirectory;
import Business.Organization.Organization;
//import Business.WorkQueue.WorkQueue;
/**
 *
 * @author raunak
 */
public abstract class HospitalOrganization extends Organization{
    
    private DoctorDirectory hospitalDoctorDirectory;
    private EmployeeDirectory hospitalEmployeeDirectory;
    private TotalSupplyDirectory hospitalTotalSupplyDirectory;
    private UserAccountDirectory hospitalUserAccountDirectory;
    
    
    public HospitalOrganization(String name) {
        super(name);
        hospitalDoctorDirectory = new DoctorDirectory();
        hospitalEmployeeDirectory = new EmployeeDirectory();
        hospitalTotalSupplyDirectory = new TotalSupplyDirectory();
        hospitalUserAccountDirectory = new UserAccountDirectory();
    }

    public DoctorDirectory getHospitalDoctorDirectory() {
        return hospitalDoctorDirectory;
    }

    public void setHospitalDoctorDirectory(DoctorDirectory hospitalDoctorDirectory) {
        this.hospitalDoctorDirectory = hospitalDoctorDirectory;
    }

    public EmployeeDirectory getHospitalEmployeeDirectory() {
        return hospitalEmployeeDirectory;
    }

    public void setHospitalEmployeeDirectory(EmployeeDirectory hospitalEmployeeDirectory) {
        this.hospitalEmployeeDirectory = hospitalEmployeeDirectory;
    }

    public TotalSupplyDirectory getHospitalTotalSupplyDirectory() {
        return hospitalTotalSupplyDirectory;
    }

    public void setHospitalTotalSupplyDirectory(TotalSupplyDirectory hospitalTotalSupplyDirectory) {
        this.hospitalTotalSupplyDirectory = hospitalTotalSupplyDirectory;
    }

    public UserAccountDirectory getHospitalUserAccountDirectory() {
        return hospitalUserAccountDirectory;
    }

    public void setHospitalUserAccountDirectory(UserAccountDirectory hospitalUserAccountDirectory) {
        this.hospitalUserAccountDirectory = hospitalUserAccountDirectory;
    }


    
}

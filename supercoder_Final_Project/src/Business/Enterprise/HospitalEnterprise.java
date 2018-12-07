/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Hospital_Doctor.DoctorDirectory;
import Business.Hospital_TotalSupply.TotalSupplyDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class HospitalEnterprise extends Enterprise {
    
    private DoctorDirectory hospitalDoctorDirectory;
    private TotalSupplyDirectory hospitalTotalSupplyDirectory;
    
    public HospitalEnterprise(String name){
        super(name,EnterpriseType.Hospital);
        
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
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

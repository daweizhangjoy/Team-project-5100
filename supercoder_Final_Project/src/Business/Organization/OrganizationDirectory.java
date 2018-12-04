/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Hospital.HospitalHRAdminOrganization;
import Business.Organization.Hospital.HospitalMonitorOrganization;
import Business.Organization.Hospital.HospitalPatientAdminOrganization;
import Business.Organization.Hospital.HospitalSupplyManageOrganization;
import Business.Organization.Organization.Type;
import static Business.Organization.Organization.Type.HospitalHRAdmin;
import static Business.Organization.Organization.Type.HospitalMonitor;
import Business.Organization.Shelter.ShelterAdoptOrganization;
import Business.Organization.Shelter.ShelterMonitorOrganization;
import Business.Organization.Shelter.ShelterPetKeepOrganization;
import Business.Organization.Shelter.ShelterSupplyManageOrganization;
import Business.Organization.Supply.SupplyIncomeOrganization;
import Business.Organization.Supply.SupplyOutcomeOrganization;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){/*此构造函数需要重写，因为数据结构是有共有的且有独有的*/
        Organization organization = null;
        
        if (type.getValue().equals(Type.HospitalHRAdmin.getValue()))
        {
            organization = new HospitalHRAdminOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.HospitalMonitor.getValue()))
        {
            organization = new HospitalMonitorOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.HospitalPatient.getValue()))
        {
            organization = new HospitalPatientAdminOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.HospitalSupplyManage.getValue()))
        {
            organization = new HospitalSupplyManageOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.ShelterAdopt.getValue()))
        {
            organization = new ShelterAdoptOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.ShelterMonitor.getValue()))
        {
            organization = new ShelterMonitorOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.ShelterPetKeep.getValue()))
        {
            organization = new ShelterPetKeepOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.ShelterSupplyManage.getValue()))
        {
            organization = new ShelterSupplyManageOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.SupplyIncome.getValue()))
        {
            organization = new SupplyIncomeOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.SupplyOutcome.getValue()))
        {
            organization = new SupplyOutcomeOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}
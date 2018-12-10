/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Total_UserAccount.UserAccount;
import interface1.supply.supplyDataAnalyseRole.SupplyDataAnalysisJPanel;
import keeptoo.KGradientPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        HospitalHRAdmin("HospitalHRAdmin"), HospitalAdmin("HospitalAdmin"), HospitalPatient("HospitalPatient"), HospitalSupplyManage("HospitalSupplyManage"), 
        ShelterAdopt("ShelterAdopt"), ShelterAdmin("ShelterAdmin"), ShelterPetKeep("ShelterPetKeep"), ShelterSupplyManage("ShelterSupplyManage"), 
        SupplyDataAnalysis("SupplyDataAnalysis"), SupplyIncome("SupplyIncome"), SupplyAdmin("SupplyAdmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract KGradientPanel createWorkArea(KGradientPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
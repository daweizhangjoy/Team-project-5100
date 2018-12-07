/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;
/**
 *
 * @author 15142087777的AW
 */
import java.util.ArrayList;
import Business.Network.Network;

public class NetworkDirectory {
    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network createNetwork(String name){/*此构造函数需要重写，因为数据结构是有共有的且有独有的*/
        Network network = new Network(name);
        
        networkList.add(network);
        
        return network;
    }
    
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }
    
    public Network searchNetwork(int networkID)
    {
        for(Network network : this.networkList){
            if(network.getNetworkID()==networkID){
                return network;
            }
        }
        return null;
    }
}

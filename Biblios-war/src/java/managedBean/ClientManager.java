/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entityBeans.Client;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Demahom
 */
@Named(value = "clientManager")
@SessionScoped
public class ClientManager implements Serializable {

    /**
     * Creates a new instance of ClientManager
     */
    public ClientManager() {
        this.clientToManage = new Client();
    }

    public Client getClientToManage() {
        return clientToManage;
    }

    public void setClientToManage(Client clientToManage) {
        this.clientToManage = clientToManage;
    }
        
    private Client clientToManage;
}

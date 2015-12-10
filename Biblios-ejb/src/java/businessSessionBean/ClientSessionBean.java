/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessSessionBean;

import entityFacades.ClientFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;


/**
 *
 * @author Demahom
 */
@Stateless
public class ClientSessionBean implements ClientSessionBeanLocal {
    @EJB
    private ClientFacadeLocal clientFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}

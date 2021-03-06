/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerManagedBean;

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
        this.isConnected = false;
    }

    public Client getClientToManage() {
        return clientToManage;
    }

    public void setClientToManage(Client clientToManage) {
        this.clientToManage = clientToManage;
    }

    public String getPasswordToConfirm() {
        return passwordToConfirm;
    }

    public void setPasswordToConfirm(String passwordToConfirm) {
        this.passwordToConfirm = passwordToConfirm;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getIsConnected() {
        return isConnected;
    }

    public void setIsConnected(Boolean isConnected) {
        this.isConnected = isConnected;
    }

    public String getConnectionEmail() {
        return connectionEmail;
    }

    public void setConnectionEmail(String connectionEmail) {
        this.connectionEmail = connectionEmail;
    }

    public String getConnectionPassword() {
        return connectionPassword;
    }

    public void setConnectionPassword(String connectionPassword) {
        this.connectionPassword = connectionPassword;
    }    
    
    
    public String login() {
        if (isConnectionValid()) {
            this.setIsConnected(true);
            return "index";
        }
        return "connectionPage";
    }
    
    private boolean isEmailValid() {
        if (clientToManage.getMail() != null && connectionEmail != null)
            return this.clientToManage.getMail().equals(this.connectionEmail);
        
        return false;
    }
    
    private boolean isPasswordValid() {
        if (this.clientToManage.getPassword() != null && this.connectionPassword != null)
            return this.clientToManage.getPassword().equals(this.connectionPassword);
        
        return false;
    }
    
    private boolean isConnectionValid() {
        return isEmailValid() && isPasswordValid();
    }
    
        
    private Client clientToManage;
    private String passwordToConfirm;
    private String street,areaCode,city,country;
    private Integer day,month,year;
    private Boolean isConnected;
    private String connectionEmail;
    private String connectionPassword;
}

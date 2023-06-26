/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java;

import java. util.Vector;

/**
 *
 * @author e-boudhina
 */
public class Client {
    
    private String CIN;
    private String telephone;
    
    
    public Client()
    {CIN="";
    telephone="";
    
    }
    public Client(String c ,String t )
    {CIN=c;
    telephone=t;
    
    }
    
    public String gettelephone()
    {
        return telephone;
    }
    
    public void settelephone(String t)
    {
        telephone=t;
    }
    
    public String getCIN()
    {
        return CIN;
    }
    
    public void setCIN(String c)
    {
        CIN=c;
    }
    
    public String Rechercher(String s)
    {
    return "";
    }
    
    
    
    
    public void afficher_clt()
    {
        System.out.print("CIN = : "+CIN+" telephone = : "+telephone+"\n");
    }
   
   public String toString() {
    return ("CIN = : "+CIN+" telephone = : "+telephone);
    
}
    
    
}

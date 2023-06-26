/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java;

/**
 *
 * @author e-boudhina
 */
public class Fournisseur {
    private String nom;
    private String adresse;
    private String telephone;
    private String email;
    private String horraire_travail;
    
   
    public Fournisseur()
    {
        nom="";
        adresse="";
        telephone="";
        email="";
        horraire_travail="";
    
    }
    
    public Fournisseur(String n ,String ad ,String tl, String em ,String ht)
    {
        nom=n;
        adresse=ad;
        telephone=tl;
        email=em;
        horraire_travail=ht;
        
    
    }
    
    public void setNom(String n)
    {
        nom=n;
    }
    
   
    
    public void setAdresse(String a)
    {
        adresse=a;
    }
    
   
    
    public void setTelephone(String t)
    {
        telephone=t;
    }
    
    public void setEmail(String e)
    {
        email=e;
    }
    
    public void setHorraire_travail(String h)
    {
        horraire_travail=h;
    }
    
    public void afficher_four()
    { System.out.print("Nom = "+nom+"\n");
    System.out.print("Adresse = "+adresse+"\n");
    System.out.print("Telephone = "+telephone+"\n");
    System.out.print("E-mail = "+email+"\n");
    System.out.print("Horraire du Travail = "+horraire_travail+"\n");
    }
    
}

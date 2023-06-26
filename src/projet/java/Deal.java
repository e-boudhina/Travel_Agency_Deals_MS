/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java;
import java. util.ArrayList;
/**
 *
 * @author e-boudhina
 */
public class Deal extends Client {

   
    private String description;
    private double prix;
    private double prix_deal;
    private String date_debut;
    private String date_fin;
    private Fournisseur localisation; //comment faire un contructeur d'un attribue qui represente une autre classe
    
    
    
    public Deal()
    {
     description="";
     prix=0;
     prix_deal=0;
     date_debut="";
     date_fin="";
     
     
}
    
    public Deal(String d,double p,double pd,String dd,String df,Fournisseur fr)
    {
     description=d;
     prix=p;
     prix_deal=pd;
     date_debut=dd;
     date_fin=df;
     localisation=fr;
     
     
}
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String d)
    {
        description=d;
    }
    
    public double getPrix()
    {
        return prix;
    }
    public void setPrix(double p)
    {
        prix=p;
    }
    
   public double getPrix_deal()
    {
        return prix_deal;
    }
   
    public void setPrix_deal(double pd)
    {
        prix_deal=pd;
    }
    
    public String getDate_debut()
    {
        return date_debut;
    }
    
    public void setDate_Debut(String dd)
    {
        date_debut=dd;
    }
    
    public String getDate_fin()
    {
        return date_fin;
    }
    
    public void setDate_fin(String df)
    {
        date_fin=df;
    }
    
    public Fournisseur getLocalisation()
    {
        return localisation;
    }
    
    public void setLocalisation(Fournisseur f)
    {
        localisation =f;
        
        
    }
    
    public void afficher_ord()
    {
    }
    
    
    
    
    
    public void afficher_deal()
    {
        System.out.print("description = "+description+"\n");
        System.out.print("prix = "+prix+"\n");
        System.out.print("prix_deal = "+prix_deal+"\n");
        System.out.print("date_debut = "+date_debut+"\n");
        System.out.print("date_fin = "+date_fin+"\n");
        System.out.print("Les information de Localisation Fournisseur sont  : \n");
        this.localisation.afficher_four();
        
    }
    
    
    
}


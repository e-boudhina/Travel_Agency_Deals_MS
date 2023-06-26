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
public class Vente  extends Deal {
    
   private String date_Achat;
   
   private int quantité;
   
   private Client info_Client;
   private Deal info_Deal;
   
   
   /*
    public Vente (Client c)
   {
       super();
   }
*/
   //Autre méthode :( "heritage du deal et du client par la vente " 
   
   
   
   
   public Vente()
   {
       date_Achat="";
       
       quantité=0;
       
       info_Client=null;
       info_Deal=null;
   }
   
   
   
   public Vente(String D_A , int q,Client c ,Deal d)
   {
       date_Achat=D_A;
       quantité=q;
       info_Client=c;
       info_Deal=d;
       
   }
   
   
   public Vente(String D_A , int q ,Deal info_D)
   {
       date_Achat=D_A;
       quantité=q;
       
       info_Deal=info_D;
   }
   
   
   public void setQuantité(int q)
   {
       quantité=q;
   }
   
   public int getQuantité()
   {
       return quantité;
   }
   
   public Deal getInfo_Deal()
   {
       return info_Deal;
   }
   
   public Client getInfo_Client()
   {
       return info_Client;
   }
   public void setDate_Achat(String D_A)
   {
       date_Achat=D_A;
   }
   public void affiche_vt()
   {
       System.out.println("Les informations Stocker sur la lsite de ventes sont pour l'element x sont: ");
       System.out.println("Date D'achat :"+date_Achat);
       System.out.println("Quantité :"+quantité);
       System.out.println("Info Clients : ");
       //le probleme c'est du quelle elements du la lisste client il va hérité , l'objet courrant , l'élements i ? le quel :(
       //super.afficher_clt(); résulta CIN = :  telephone = : les champs sont vides 
        info_Client.afficher_clt();
        info_Deal.afficher_deal();
   }
}

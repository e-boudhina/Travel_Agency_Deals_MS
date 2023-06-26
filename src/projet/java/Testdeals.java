/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author e-boudhina
 */
public class Testdeals {
   
    public static void main(String[] args)
    {
        
    
    Scanner op =new Scanner(System.in);
    
    Scanner op2 =new Scanner(System.in);
    Scanner op3 =new Scanner(System.in);
    
    Scanner data = new Scanner(System.in);
    
   
   
    
   
        Vector <Client> liste_clients = new Vector <Client>() ;
        Client c = new Client();
        ArrayList <Deal> liste_deals = new ArrayList <Deal>() ;
        Deal d = new Deal();
        ArrayList <Vente> liste_ventes = new ArrayList <Vente>();
        Vente v ;  //= new Vente();
        
        
        
        
        
        
        
        
        
        
        char ans='n',quit=0;
        
        
        
        do
        {
       System.out.print("=============> Menu principale <=============\n");
       System.out.print("1-Ajouter un client \n");
       System.out.print("2-Ajouter un Deal \n");
       System.out.print("3-Faire une vente \n");
       System.out.print("4-Total A payer par un client \n");
       System.out.print("5-Consulter Liste de ventes \n");
       System.out.print("0-Quitté \n");
       
        
        String choix;
      
        choix=op.next();
  
        switch (choix) {
            

                                           case "1":

                                                       
                                                        do

                                                                    {
                                                                        System.out.print("donner information client par l'ordre suivant : CIN,telephone\n");
                                                                        String ch,ch1;
                                                                        ch=data.next();
                                                                        ch1=data.next();
                                                                        /*
                                                                         c.setCIN(ch);
                                                                         ch=data.next();
                                                                         c.settelephone(ch);
                                                                         liste_clients.addElement(c);
                                                                            */
                                                                       Client clt =new Client(ch,ch1);
                                                                       liste_clients.addElement(clt);
                                                                      
                                                                         System.out.print("Vous avez "+liste_clients.size()+" dans votre liste client \n");
                                                                                    
                                                                         for (int i=0;i<liste_clients.size();i++)
                                                                             liste_clients.elementAt(i).afficher_clt();
                                                                         
                                                                         System.out.print("voulez vous creer un autre client o/n ? \n");

                                                                        ans = data.next().charAt(0);



                                                                        }while (ans=='o');break;
                                                       
                                                        
                                                            
                                                        
                                            case"2":
                                                        
                                                        do
                                                        {
                                                            
                                                            System.out.print("donner les information de deal par l'ordre suivant : description,prix,prix_deal,date_deb,date_fin\n");
                                                                        String ch,ch1,ch2,ch3,ch4,ch5,ch6,ch7;
                                                                        double p=0,pd = 0;
                                                                        
                                                                        ch=data.next();
                                                                        p=data.nextDouble();
                                                                        pd=data.nextDouble();
                                                                        ch1=data.next();
                                                                        ch2=data.next();
                                                                        System.out.print("donner les information fournisseur par l'ordre suivant : nom,adress,telephone,email,horraire\n");
                                                                        ch3=data.next();
                                                                        ch4=data.next();
                                                                        ch5=data.next();
                                                                        ch6=data.next();
                                                                        ch7=data.next();
                                                                        Fournisseur fr = new Fournisseur(ch3,ch4,ch5,ch6,ch7);
                                                                        Deal dl =new Deal(ch,p,pd,ch1,ch2,fr);
                                                                        liste_deals.add(dl);
                                                                       
                                                                       
                                                                        
                                                                                                               
                                                                        
                                                                        
                                                                        
                                                                        
                                                                        
                                                                     
                                                                        /*
                                                                        d.setDescription(ch);

                                                                        double p;

                                                                        p=data.nextDouble();
                                                                        d.setPrix(p);

                                                                        p=data.nextDouble();
                                                                        d.setPrix_deal(p);

                                                                        ch=data.next();
                                                                        d.setDate_Debut(ch);


                                                                        ch=data.next();
                                                                        d.setDate_fin(ch);



                                                                              //comment saisr les information fournisseur en utilisant le client avec une autre methode 
                                                                        //tu peux faire ca +liste_deals.get(0).getlocalisation().setnom(ch)); 

                                                                        Fournisseur f = new Fournisseur();

                                                                        System.out.print("donner les information fournisseur par l'ordre suivant : nom,adress,telephone,email,horraire\n");
                                                                         ch=data.next();
                                                                        f.setNom(ch);

                                                                        ch=data.next();
                                                                        f.setAdresse(ch);

                                                                        ch=data.next();
                                                                        f.setTelephone(ch);

                                                                        ch=data.next();
                                                                        f.setEmail(ch);

                                                                        ch=data.next();
                                                                        f.setHorraire_travail(ch);

                                                                         d.setLocalisation(f);
                                                                         liste_deals.add(d);
                                                                        */
                                                                        System.out.print("vous avez "+liste_deals.size()+" deals\n");
                                                                        
                                                                        /*
                                                                        for (int i=0;i<liste_deals.size();i++)
                                                                            liste_deals.get(i).afficher_deal();
                                                                         
                                                                        */
                                                                        
                                                                        System.out.print("voulez vous creer un autre Deal o/n ? \n");

                                                                        ans = data.next().charAt(0);
                                                        
        
    
        
        
        
        
        
        
        
        
        
        
                                                        }while (ans=='o');break;
                                                        
                                                        
                                                        
                                                        
                                                        
                                                case"3":
                                                    do
                                                    {
                                                         
                                                         
                                                         if (liste_clients.size()==0 ) {
                                                               System.out.println("votre liste de clients est vide ! ");break;}
                                                               else 
                                                           if (liste_deals.size()==0) {
                                                               System.out.println("votre liste de deals est vide ! ");break;}
                                                         
                                                        System.out.println("Donner le CIN de votre client : ");
                                                        String ch;
                                                        ch=data.next();
                                                        int i,t=0;

                                                       
                                                           for (i=0;i<liste_clients.size();i++)
                                                        { if (t!=0)break;

                                                              
                                                              
                                                              
                                                           else if ((liste_clients.elementAt(i).getCIN().contains(ch)==false)&&(i+1==liste_clients.size()))
                                                            {
                                                                System.out.println("first i inside  = "+i);
                                                               
                                                                System.out.println("Ce client est inexistant ! ");break;}
                                                        
                                                        else if ((liste_clients.elementAt(i).getCIN().contains(ch)==true)&&(i+1<=liste_clients.size())){
                                                                System.out.println("Donner le nom du deal : ");
                                                                ch=data.next();
                                                                int y ;
                                                                for (y=0;y<liste_deals.size();y++)
                                                                {
                                                                    if ((liste_deals.get(y).getDescription().contains(ch) == false)&&(y+1==liste_deals.size()))
                                                                       {
                                                                        System.out.println("chaine saisie : "+ch);
                                                                        System.out.println("chaine stocker : "+liste_deals.get(y).getDescription());
                                                                        
                                                                        System.out.println("Ce deal est inexistant ! ");break;
                                                                       
                                                                        }
                                                                    
                                    
                                                                  else if ((liste_deals.get(y).getDescription().contains(ch) == true)&&(y+1<=liste_deals.size()))
                                                                  {
                                                                     
                                                                     
                                                                       System.out.println("Enter la date d'achat : ");
                                                                      
                                                                              ch=data.next();
                                                                              
                                                                              System.out.println("Enter la quantité demandé  : ");
                                                                              int q;
                                                                              q=data.nextInt();
     
                                                                              v = new Vente(ch,q,liste_clients.elementAt(i),liste_deals.get(y));
                                                                              
                                                                              liste_ventes.add(v);
                                                                              
                                                                               System.out.print("vous avez "+liste_ventes.size()+" ventes \n");
                                                                               t++;break;
                                                                              
           
                                                                }
                                                                    
                                                                }
                                                        
                                                    }
                                                           
                                                               
                                                        }
                                                              
                                                          System.out.print("voulez vous creer une autre vente o/n ? \n");

                                                                        ans = data.next().charAt(0);         
                                                       
                                                    }while (ans=='o');break;
                                                           
                                                               
                                                        
                                                        
                                               
                                                    
                                                    
                                                case"4":    
                                                     do
                                                    {  
                                                        
                                                        if (liste_clients.size()==0 ) {
                                                               System.out.println("votre liste de Clients est vide ! ");break;}
                                                               else 
                                                           if (liste_deals.size()==0) {
                                                               System.out.println("votre liste de Deals est vide ! ");break;}
                                                        else
                                                               if(liste_ventes.size()==0)
                                                               {System.out.println("votre liste de Vente est vide ! ");break;}
                                                         
                                                        System.out.println("Donner le CIN de votre client : ");
                                                        String ch;
                                                        ch=data.next();
                                                       int i,t=0;
                                                       
                                                           for (i=0;i<liste_clients.size();i++)
                                                        {   int n=0;
                                                            double s=0;
                                                            System.out.println("iam here"+i);
                                                            if (t!=0)break;
                                                            
                                                            
                                                            else if ((liste_clients.elementAt(i).getCIN().contains(ch)==false)&&(liste_clients.size()==i+1))
                                                            { System.out.println("Ce client est inexistant ! ");break;}
                                                        
                                                            else  {
                                                                
                                                                int j;//n nombre de deal acheter par un client
                                                                for (j=0;j<liste_ventes.size();j++)
                                                                {
                                                                  
                                                                 
                                                                 if(liste_ventes.get(j).getInfo_Client().getCIN()==liste_clients.elementAt(i).getCIN())
                                                                 {n++;
                                                                 
                                                                     s=s+(liste_ventes.get(j).getInfo_Deal().getPrix_deal()*liste_ventes.get(j).getQuantité());
                                                                    
                                                                 }
                                                                 
                                                                     
                                                                 }
                                                                System.out.println("Le Client : "+liste_clients.elementAt(i).getCIN()+" a acheté : "+n+" Deals");
                                                                System.out.println("Ce client doit payer la somme : "+s+" DT");
                                                                System.out.println("iam here"+i +" "+j);
                                                                if(j+1==liste_ventes.size())
                                                                     t++;
                                                                }
                                                        }
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        System.out.print("Voulez-vous Calculer la somme a payer d'un autre client  o/n ? \n");

                                                                        ans = data.next().charAt(0);         
                                                       
                                                    }while (ans=='o');break;
                                                        
                                                        
                                                        
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    case"5":    
                                                    // do
                                                    //{  
                                                    
                                                    for (int i=0;i<liste_ventes.size();i++)
                                                    {
                                                        liste_ventes.get(i).affiche_vt();
                                                        System.out.println("-----------------------------------------");
                                                                
                                                    }
                                                    
                                                    
                                                    
                                                    
      
                                                        
                                                        //System.out.print("Voulez-vous Quitter  o/n ? \n");

                                                          //              ans = data.next().charAt(0);         
                                                       
                                                   // }while (ans=='o');break;
                                                        
                                                        
                                                        
                                                        
                                                        
                                                case"0":break;
                                                
                                                
                                                default:
                                                    System.out.println("Voulez vous entrer un choix correcte ! ");break;
    }
         System.out.println("voulez vous quitter o/n ?");
         quit =data.next().charAt(0);
}while((ans=='n')&&(quit=='n'));
        
    }
}
         
        
        
   
   
        
        
        
  
   
 
  
  
  
  //System.out.print("l'information de vos client sont : "+liste_client.get(0).getCIN());
    //liste_client.get(0).afficher_clt();
 
  
   //System.out.print("les information de votre deal est :\n" );
   //liste_deals.get(0).afficher_deal();
  
   
   
 
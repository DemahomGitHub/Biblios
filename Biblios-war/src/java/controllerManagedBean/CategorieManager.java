/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerManagedBean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author Demahom
 */
@Named(value = "categorieManager")
@SessionScoped
public class CategorieManager implements Serializable {

    /**
     * Creates a new instance of CategorieManager
     */
    public CategorieManager() {
        categoriesToManage = new ArrayList<>();
    }

    public ArrayList<TraductionCategorie> getCategoriesToManage() {
        return categoriesToManage;
    }

    public void setCategoriesToManage(ArrayList<TraductionCategorie> categoriesToManage) {
        this.categoriesToManage = categoriesToManage;
    }
    
    public ArrayList <TraductionCategorie> getAllFrenchCategoriesBooks() {
        categoriesToManage = new ArrayList<>();
         TraductionCategorie lit, scs, nvl, htr, hmr, fd, cpsc, trsm, es, art, sklbook, thtr;
         
         lit = new TraductionCategorie();         
         scs = new TraductionCategorie();
         nvl = new TraductionCategorie();
         htr = new TraductionCategorie();
         hmr = new TraductionCategorie();
         fd  = new TraductionCategorie();
         cpsc= new TraductionCategorie();
         trsm= new TraductionCategorie();
         es  = new TraductionCategorie();
         art = new TraductionCategorie();
         thtr=new TraductionCategorie();
         
         sklbook = new TraductionCategorie();
         
         lit.setLibelle("Littérature");
         scs.setLibelle("Sciences Humaines");
         nvl.setLibelle("Roman");
         htr.setLibelle("Histoire");
         hmr.setLibelle("Humoure");
         fd.setLibelle("Cuisine");
         cpsc.setLibelle("Informatique");
         trsm.setLibelle("Tourisme et Voyage");
         es.setLibelle("Essaie");
         art.setLibelle("Art");
         thtr.setLibelle("Theatre");
         
         this.categoriesToManage.add(lit);         
         this.categoriesToManage.add(scs);
         this.categoriesToManage.add(nvl);
         this.categoriesToManage.add(htr);
         this.categoriesToManage.add(hmr);
         this.categoriesToManage.add(fd);
         this.categoriesToManage.add(cpsc);
         this.categoriesToManage.add(trsm);
         this.categoriesToManage.add(es);
         this.categoriesToManage.add(art);
         this.categoriesToManage.add(thtr);  
         
        return this.categoriesToManage;
    }
    
     public ArrayList <TraductionCategorie> getAllEnglishCategoriesBooks() {
         categoriesToManage = new ArrayList<>();
         TraductionCategorie lit, scs, nvl, htr, hmr, fd, cpsc, trsm, es, art, sklbook, thtr;
         
         lit = new TraductionCategorie();         
         scs = new TraductionCategorie();
         nvl = new TraductionCategorie();
         htr = new TraductionCategorie();
         hmr = new TraductionCategorie();
         fd  = new TraductionCategorie();
         cpsc= new TraductionCategorie();
         trsm= new TraductionCategorie();
         es  = new TraductionCategorie();
         art = new TraductionCategorie();
         thtr=new TraductionCategorie();
         
         sklbook = new TraductionCategorie();
         
         lit.setLibelle("Literature");
         scs.setLibelle("Social Science");
         nvl.setLibelle("Novel");
         htr.setLibelle("History");
         hmr.setLibelle("Humor");
         fd.setLibelle("Food");
         cpsc.setLibelle("Computer Science");
         trsm.setLibelle("Tourism and Travel");
         es.setLibelle("Essay");
         art.setLibelle("Art");
         thtr.setLibelle("Theater");
         
         this.categoriesToManage.add(lit);         
         this.categoriesToManage.add(scs);
         this.categoriesToManage.add(nvl);
         this.categoriesToManage.add(htr);
         this.categoriesToManage.add(hmr);
         this.categoriesToManage.add(fd);
         this.categoriesToManage.add(cpsc);
         this.categoriesToManage.add(trsm);
         this.categoriesToManage.add(es);
         this.categoriesToManage.add(art);
         this.categoriesToManage.add(thtr);  
         
        return this.categoriesToManage;
    }
    
    private ArrayList <TraductionCategorie> categoriesToManage;    
}

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
import java.util.GregorianCalendar;
import model.*;


/**
 *
 * @author Demahom
 */
@Named(value = "allBooksModelManager")
@SessionScoped
public class AllBooksModelManager implements Serializable {

    /**
     * Creates a new instance of AllBooksModelMB
     */
    public AllBooksModelManager() {
        allBooks = new ArrayList<>();
    }
    
    public ArrayList<AllBooksModel> getNewestBooks() {
        allBooks = new ArrayList<>();
        
        for (int i=0; i < 10; i++) {
            Livre book = createBook();
            TraductionLivre bkTranslation = createBookTranslation(book);
            AllBooksModel abm = new AllBooksModel();
            abm.setBook(book);
            abm.setBookCategory(this.createCategoryTranslation(book.getCategorieLivre(), bkTranslation.getLangueTraduite()));
            abm.setBookTanslation(bkTranslation);
            
            allBooks.add(abm);
        }
        return this.allBooks;
    }
    
    private Livre createBook() {
        Promo promo = new Promo();
        MaisonEdition me = new MaisonEdition();
        Auteur aut = new Auteur();
        CategorieTraduction cat = new CategorieTraduction();
        Livre livre = new Livre();
        
        promo.setDateDebut(new GregorianCalendar(2015,11,21));
        promo.setDateFin(new GregorianCalendar(2016,0,4));
        promo.setPrctReduc(0.15f);
        promo.setId((int)(Math.random()*999)+1);
        
        me.setId((int)(Math.random()*999)+1);
        me.setNom("De Boeck");
        
        aut.setId((int)(Math.random()*999)+1);
        aut.setNom("Claude");
        aut.setPrenom("Delannoy");
        
        cat.setId((int)(Math.random()*999)+1);
        
        livre.setAuteurLivre(aut);
        livre.setCategorieLivre(cat);
        livre.setId((int)(Math.random()*999)+1);
        livre.setImage("./images/image"+((int)(Math.random())+1)+".jpg");
        livre.setMaisonEditionLivre(me);
        livre.setNote(Math.random()*10);
        livre.setPrix(25.5f);
        livre.setPromotionLivre(promo);       
        
        return livre;
    }
    
    private TraductionLivre createBookTranslation(Livre livre) {
        Langue lg = new Langue();
        TraductionLivre traduction = new TraductionLivre();
        String res = "Ce livre, aussi fait pour les débutant que pour professionnels, "
                    +"aborde les notions fondamentales de la programmations dans les moindres détails. "
                    +"Tout les paradigmes de programmation sont abordés : de l'orienté objet jusqu'à "
                    +"la programmation fonctionnelle.";
        
        lg.setDrapeau("FR");
        lg.setId((int)(Math.random()*999)+1);
        lg.setLibelle("Programmer en Java");
        
        traduction.setId((int)(Math.random()*999)+1);
        traduction.setLangueTraduite(lg);
        traduction.setLivretraduit(livre);        
        traduction.setResume(res);
        traduction.setTitre("Programmer, c'est Easy !");
        
        return traduction;
    }
    
    private TraductionCategorie createCategoryTranslation(CategorieTraduction cat, Langue lg) {
        TraductionCategorie traduction = new TraductionCategorie();
        
        traduction.setId((int)(Math.random()*999)+1);
        traduction.setCategorieTraduite(cat);
        traduction.setLangueTraduite(lg);
        
        return traduction;
    }
    
    public ArrayList <AllBooksModel> getBooksByCategory() {
        
        return null;
    }

    public ArrayList<AllBooksModel> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(ArrayList<AllBooksModel> allBooks) {
        this.allBooks = allBooks;
    }
    
    private ArrayList <AllBooksModel> allBooks;
}

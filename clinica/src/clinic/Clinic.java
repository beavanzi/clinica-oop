/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;


import clinic.services.Messenger;
import clinic.view.MainPage;
import java.util.Scanner;
import javax.swing.JFrame;


/**
 *
 * @author biaav
 */
public class Clinic {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //cadastro dos medicos Arthur, Tiago, Amanda.
        //serao os unicos medicos disponiveis para o sistema nesse momento;
        Global.daoDoc.createDoctor("Arthur", "1111-1111-111-11", "1");
        Global.daoDoc.createDoctor("Tiago", "1111-1111-111-22", "2");
        Global.daoDoc.createDoctor("Amanda", "1111-1111-111-33", "3");


        MainPage main = new MainPage();
        main.setVisible(true);
        
        if(!main.isVisible()){
           Global.em.close();
           Global.emf.close();
        }
        
    }
    
}
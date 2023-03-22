package Vues;

import Entities.Pompier;
import Entities.PompierProfessionnel;
import Entities.PompierVolontaire;

import javax.swing.*;
import java.util.ArrayList;

public class FrmMenu extends JFrame{
    private JPanel pnlRoot;

    public FrmMenu()
    {
        this.setTitle("TP Polymorphisme et heritage");
        this.setContentPane(pnlRoot);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        // je crée un pompier
        Pompier pompier1 = new Pompier(1,"Paul",1200);
        PompierProfessionnel pompierProfessionnel1=new PompierProfessionnel(2,"Stéphanie",700,2000);
        PompierVolontaire pompierVolontaire1=new PompierVolontaire(3,"Aline",200,13,9.45);
        // Je crée une Array list de Pompier
        ArrayList<Pompier> mesPompiers = new ArrayList<>();
        //Je stocke mes pompiers à l'ArrayList
        mesPompiers.add(pompier1);
        mesPompiers.add(pompierVolontaire1);
        mesPompiers.add(pompierProfessionnel1);

        for (Pompier p:mesPompiers){
            JOptionPane.showMessageDialog(null, p.GetInfo());
        }


        //l'héritage est fait

        //on ajoute ensuite le polymorphisme. On écrit exactement la même méthode dans la classe mère et dans la classe fille.
        // Je vais dnas le classe pompier et je decide de clalculer le salaire
    }


}

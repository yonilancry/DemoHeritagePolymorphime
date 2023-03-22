package Entities;

public class PompierVolontaire extends Pompier{
    private int nbHeures;
    private double prixHeure;


    public int getNbHeures() {
        return nbHeures;
    }

    public double getPrixHeure() {
        return prixHeure;
    }

    public PompierVolontaire(int idPompier, String nomPompier, double salairePompier, int unNbHeure, double unPrixHeure) {
        super(idPompier, nomPompier, salairePompier);
        nbHeures=unNbHeure;
        prixHeure=unPrixHeure;

    }
    public double CalculerSalaire()
    {
        //Le super sert à faire du polymorphisme. En fait elle va aidera prendre le salaire du Pompier e general et donc rajouter la prime( en utilisant la méthode calculer salaire de la classe mère

        return nbHeures*prixHeure+super.CalculerSalaire();

    }
    public String GetInfo()
        {
        return idPompier+nomPompier+"-"+CalculerSalaire();
        }
}

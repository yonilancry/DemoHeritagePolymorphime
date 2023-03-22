package Entities;

public class PompierProfessionnel extends Pompier // on fait hériter la classe PompierProfessionnel de la classe mère
{
    private int prime;

    public int getPrime() {
        return prime;
    }

    public PompierProfessionnel(int unId, String unNom, double unSalaire, int unePrime){
        //les informations de la classe mère : on fait donc appel au constructeur
        super(unId, unNom, unSalaire);


    }
    public double CalculerSalaire()
    {
        //Le super sert à faire du polymorphisme. En fait elle va aidera prendre le salaire du Pompier e general et donc rajouter la prime( en utilisant la méthode calculer salaire de la classe mère
        return prime+super.CalculerSalaire();
    }
    //les membres sont privés et les méthodes sont publics.

    public String GetInfo(){
        return idPompier+nomPompier+"-"+CalculerSalaire();
    }
}

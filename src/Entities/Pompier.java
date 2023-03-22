package Entities;

public class Pompier {

    // On utilise le format protected uniquement quand on veut faire de l'héritage
    // Les membres seront donc utilisables dans les autres classes.
    protected int idPompier;
    protected String nomPompier;
    protected double salairePompier;

    public Pompier(int idPompier, String nomPompier, double salairePompier) {
        this.idPompier = idPompier;
        this.nomPompier = nomPompier;
        this.salairePompier = salairePompier;
    }

    public int getIdPompier() {
        return idPompier;
    }

    public String getNomPompier() {
        return nomPompier;
    }

    public double getSalairePompier() {
        return salairePompier;
    }
    public double CalculerSalaire(){
        return salairePompier;
    }

    public String GetInfo()// cette méthode
    {
        return idPompier+nomPompier+"-"+CalculerSalaire();
        //return getIdPompier()+getNomPompier()+"-"+getSalairePompier();
    }
}

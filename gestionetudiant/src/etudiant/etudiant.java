package etudiant;

public class etudiant {
 private int id;
 private String nom;
 private double note;
  public etudiant (int id , String nom , double note ){
     note =10 ;
  }
 
  public String toString () {
	  return (this.nom + ":" + this.note);
  }
  }

 
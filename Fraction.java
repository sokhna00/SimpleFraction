public class Fraction {

    private int numerateur;   // Numérateur
    private int denominateur; // Dénominateur

    // Fraction constante ZERO
    public static final Fraction ZERO = new Fraction(0, 1);

    // Fraction constante UN
    public static final Fraction UN = new Fraction(1, 1);


    // Méthode pour obtenir le numérateur
    public int getNumerateur() {
        return numerateur;
    }

    // Méthode pour obtenir le dénominateur
    public int getDenominateur() {
        return denominateur;
    }

    public Fraction add(Fraction other) {
        // Calcul de la somme des fractions
        int newNumerateur = (this.numerateur * other.denominateur) + (other.numerateur * this.denominateur);
        int newDenominateur = this.denominateur * other.denominateur;

        // Création d'une nouvelle fraction représentant la somme
        return new Fraction(newNumerateur, newDenominateur);
    }


    // Assertions pour tester la conversion
    public  double doubleValue(){
        return (double) numerateur / denominateur ;
    }
    // Constructeur avec numérateur et dénominateur
    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    // Constructeur avec seulement le numérateur (dénominateur égal à 1)
    public Fraction(int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    // Constructeur par défaut (numérateur égal à 0, dénominateur égal à 1)
    public Fraction() {
        this.numerateur = 0;
        this.denominateur = 1;
    }

    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }
  //  @Override
   // public String toString() {
       // return "Je suis une fraction.";
   // }
}




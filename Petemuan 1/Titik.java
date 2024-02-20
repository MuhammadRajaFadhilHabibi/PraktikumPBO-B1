class Titik{
    //Deklarasi atribut
    double absis;
    double ordinat;
    static int counterTitik;

    //Deklarasi konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //Deklarasi metode
    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    int getCounterTitik(){
        return counterTitik;
    }
}
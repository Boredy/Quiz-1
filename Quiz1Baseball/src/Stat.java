
public class Stat {
	private double Hits;
    private double AB;
    private double BB;
    private double HBP;
    private double Dbl;
    private double Triple;
    private double HR;
    private double R;

    public double getHits() {
        return Hits;
    }


    public void setHits(double hits) {
        this.Hits = hits;
    }


    public double getAB() {
        return AB;
    }


    public void setAB(double aB) {
        this.AB = aB;
    }

    public double getBB() {
        return BB;
    }

    public void setBB(double bB) {
        this.BB = bB;
    }


    public double getHBP() {
        return HBP;
    }


    public void setHBP(double hBP) {
        this.HBP = hBP;
    }

    public double getDbl() {
        return Dbl;
    }


    public void setDbl(double dbl) {
        this.Dbl = dbl;
    }


    public double getTriple() {
        return Triple;
    }


    public void setTriple(double triple) {
        this.Triple = triple;
    }


    public double getHR() {
        return HR;
    }


    public void setHR(double hR) {
        this.HR = hR;
    }


    public double getR() {
        return R;
    }


    public void setR(double r) {
        this.R = r;
    }


    public double SLG()
    {
        double singles = this.Hits - this.Dbl - this.Triple - this.HR;

        return (singles + (2 * this.Dbl) + (3 * this.Triple) + (4 * this.HR)) / this.AB;

        //return SLG;
    }

    public double BA() {

        return this.Hits / this.AB;

        //return BA;
    }

    public double OBP() {

        return (this.Hits + this.BB + this.HBP) / (this.AB + this.BB + this.HBP);

        //return OBP;
    }

    public double OPS() {

        return this.SLG() + this.AB;

        //return OPS;
    }

    public double TB() {

        double singles = this.Hits - this.Dbl - this.Triple - this.HR;

        return singles + (2 * this.Dbl) + (3 * this.Triple) + (4 * this.HR);

        //return TB;
    }

}

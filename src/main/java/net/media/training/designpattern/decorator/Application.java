package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:26:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class Application {
    private final float gpa;
    private final float gre;
    private final float toefl;

    private Boolean GPAEval;
    private Boolean GREEval;
    private Boolean GRETOEFL;
    private Boolean TOEFL;

    public Application(float gpa, float gre, float toefl) {
        this.gpa = gpa;
        this.gre = gre;
        this.toefl = toefl;
    }

    public float getGpa() {
        return gpa;
    }

    public float getGre() {
        return gre;
    }

    public float getToefl() {
        return toefl;
    }

    public Boolean getGPAEval() {
        return GPAEval;
    }

    public void setGPAEval(Boolean GPAEval) {
        this.GPAEval = GPAEval;
    }

    public Boolean getGREEval() {
        return GREEval;
    }

    public void setGREEval(Boolean GREEval) {
        this.GREEval = GREEval;
    }

    public Boolean getGRETOEFL() {
        return GRETOEFL;
    }

    public void setGRETOEFL(Boolean GRETOEFL) {
        this.GRETOEFL = GRETOEFL;
    }

    public Boolean getTOEFL() {
        return TOEFL;
    }

    public void setTOEFL(Boolean TOEFL) {
        this.TOEFL = TOEFL;
    }
}

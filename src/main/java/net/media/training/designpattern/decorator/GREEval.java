package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:28:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class GREEval extends GPAEval {

    @Override
    public boolean evaluate(Application theApp) {
        if(theApp.getGREEval()==null) {
            if (super.evaluate(theApp)) {
                System.out.println("GREEval called");
                theApp.setGREEval(theApp.getGre() > 1450);
            } else {
                theApp.setGREEval(false);
            }
        }
        return theApp.getGREEval();

    }
}

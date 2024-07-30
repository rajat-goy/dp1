package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:36:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class AndroidMotherBoard extends MotherBoard {
    private Battery battery;
    private String state;
    private Processor processor;
    public Battery getBattery() {
        return battery;
    }
    AndroidMotherBoard()
    {
        attachBattery(new Battery());
        attachProcessor(new AndroidProcessor());
    }

}

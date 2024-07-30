package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:37:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class IphoneMotherBoard extends MotherBoard {
    private Battery battery;
    private String state;
    private Processor processor;
    public Battery getBattery() {
        return battery;
    }
    IphoneMotherBoard()
    {
        attachBattery(new Battery());
        attachProcessor(new IphoneProcessor());
    }
}

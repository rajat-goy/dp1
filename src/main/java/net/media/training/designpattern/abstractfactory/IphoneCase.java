package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:48:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class IphoneCase extends Case {
    private MotherBoard motherBoard;
    private Screen screen;
    IphoneCase()
    {
        this.motherBoard = new IphoneMotherBoard();
        this.screen = new IphoneScreen();
    }
}

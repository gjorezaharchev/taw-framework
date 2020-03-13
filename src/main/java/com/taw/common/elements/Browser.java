package com.taw.common.elements;

import com.taw.common.drivers.SetUp;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

/**
 * @author Gjore.Zaharchev
 */
public class Browser extends ElementBase {

    //TODO implement method logic from SetUp class

    /**
     *
     */

    private final SetUp setUp = new SetUp();

    /**
     * Used to open browser and set Explicit wait
     */
    public void open() {
        setUp.setBrowser();
        setUp.setExplicitWait();
    }

    /**
     * Maximizes the browser
     */
    public void maximize() {
        try {
            driver.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Set location of the browser
     *
     * @param x width
     * @param y height
     */
    public void move(final int x, final int y) {
        try {
            driver.manage().window().setPosition(new Point(x, y));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Maximize the browser
     *
     * @param x width
     * @param y height
     */
    public void resize(final int x, final int y) {
        Dimension dimension = new Dimension(x, y);
        try {
            driver.manage().window().setSize(dimension);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void minimize() {
        driver.manage().window().setPosition(new Point(-2000, 0));
    }

    public void fullScreen() {
        driver.manage().window().fullscreen();
    }

    /**
     * Close any instances of webdriver.
     */

    public void close() {
        setUp.driverQuit();
    }


}
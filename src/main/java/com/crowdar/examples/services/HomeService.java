package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.TIME_ENTRY_LIST);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.ACTION_BUTTON), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void clickEntry(){
        MobileActionManager.click(HomeConstants.ACTION_BUTTON);
        MobileActionManager.waitVisibility(HomeConstants.DIV_SECTION_HOUR);

    }

    public static void inputHours(String hour, String minute) {
        MobileActionManager.click(HomeConstants.INPUT_HOUR);
        MobileActionManager.setInput(HomeConstants.INPUT_HOUR, hour);
        MobileActionManager.setInput(HomeConstants.INPUT_HOUR, hour);

        MobileActionManager.click(HomeConstants.INPUT_MINUTE);
        MobileActionManager.setInput(HomeConstants.INPUT_MINUTE, minute);
        MobileActionManager.setInput(HomeConstants.INPUT_MINUTE, minute);

    }
    public static void isTitleEntryLoaded(){
        MobileActionManager.waitVisibility(HomeConstants.TITLE_TIME_ENTRY);

    }

    public static void isEntryLoaded(){
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.ENTRY));
    }

    public static void sleep(){
        try {
            MobileActionManager.getWait().until(ExpectedConditions.elementToBeClickable(By.id("id:empty_state_time_entries")));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
    public static void deleteEntry() {
        MobileActionManager.click(HomeConstants.BUTTON_MENU_ENTRY);
        MobileActionManager.click(HomeConstants.BUTTON_DELETE_ENTRY);
        MobileActionManager.waitVisibility(HomeConstants.NO_ENTRY);
        sleep();
    }

}

package com.task.utils;

import org.openqa.selenium.WebElement;

public class Helper {

    public static boolean checkText(WebElement webElement, String text) {
        if (webElement.getText().equals(text))
            return true;
        return false;
    }
}

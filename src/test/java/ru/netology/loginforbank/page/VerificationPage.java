package ru.netology.loginforbank.page;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private final SelenideElement codField = $("[data-test-id=code] input");
    private final SelenideElement verifyButton = $("[data-test-id=action-verify]");
    private final SelenideElement errorNotification = $("[data-test-id='error-notification] .notification__content");

    public void verifyVerificationPageVisiblity() {
        codField.shouldBe(visible);
    }

    public void verifyErrorNotification(String expectedText) {
        errorNotification.shouldHave(exactText(expectedText)).shouldBe(visible);
    }

    public DashboardPade validVerify(String verificationCode) {
        verify(verificationCode);
        return new DashboardPade();
    }

    public void verify(String verificationCode) {
        codField.setValue(verificationCode);
        verifyButton.click();
    }
}

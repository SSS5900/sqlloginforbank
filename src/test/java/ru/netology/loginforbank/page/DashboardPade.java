package ru.netology.loginforbank.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPade {
    private final SelenideElement heading = $("[data-test-id=dashboard");

    public DashboardPade(){
        heading.shouldHave(text("Личный кабинет")).shouldBe(visible);
    }
}

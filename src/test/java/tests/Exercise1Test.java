package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise1Page;

import static pages.BasePage.chooseExercise;


public class Exercise1Test extends TestBase {

    @Test
    public void addProductToBasket() {
        chooseExercise("1");
        Exercise1Page exercise1Page = new Exercise1Page();
        String product = "Piłka";
        exercise1Page
                .typeQuantity(product, "3")
                .clickOnAddProduct(product);
        Assert.assertEquals(exercise1Page.checkProductsQuantityInBasket(), "3");
    }
}

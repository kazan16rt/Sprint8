import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
@DisplayName("Check name to embross test {account}")
public class AccountTest {

    @Test
    @Parameters({"A b, true",
            "QW, false",
            "Q12345678 A12345678, true",
            " Тимоти Шаламе , true",
            "ТимотейШевроле, false",
            "Qwertyui Asdfghjk, true"})

    public void checkNameToEmbossTest(String name, boolean expected) {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals("Incorrect result", expected, actual);
    }
}

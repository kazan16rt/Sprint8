import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name.trim();
    }

    @Step("Call checkNameToEmboss")
    public boolean checkNameToEmboss() {
        char[] nameChar = name.toCharArray();
        int counter = 0;
        boolean result = false;
        if( name.length() >= 3 && name.length() <= 19) {
            for (char c : nameChar) {
                if(c == ' ') {
                    counter++;
                }
            }
            if (counter == 1) {
                result = true;
            }
        }
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        return result;
    }

}
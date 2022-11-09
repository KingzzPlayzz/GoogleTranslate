package net.translate.bin;

import net.translate.util.Language;
import net.translate.util.Request;

public class GoogleTranslate {

    private String apiKey;

    public GoogleTranslate(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String translate(String text, Language lang) {
        return new Request().getTranslation(getApiKey(), text, lang);
    }

}
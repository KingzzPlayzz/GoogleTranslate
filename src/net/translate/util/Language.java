package net.translate.util;

public enum Language {

    GERMAN("de"),
    ENGLISH("en"),
    BULGARIAN("bg"),
    CHINESE("zh-TW"),
    CROATIAN("hr"),
    CZECH("cs"),
    DANISH("da"),
    DUTCH("nl"),
    FINNISH("fi"),
    FRENCH("fr"),
    HUNGARIAN("hu"),
    INDONESIAN("id"),
    IRISH("ga"),
    ITALIAN("it"),
    JAPANESE("ja"),
    KOREAN("ko"),
    KURDISH("ku"),
    LATIN("la"),
    MACEDONIAN("mk"),
    MONGOLIAN("mn"),
    NORWEGIAN("no"),
    POLISH("pl"),
    PORTUGUESE("pt"),
    ROMANIAN("ro"),
    RUSSIAN("ru"),
    SERBIAN("sr"),
    SLOVAK("sk"),
    SLOVENIAN("sl"),
    SOMALI("so"),
    SPANISH("es"),
    SWEDISH("sv"),
    THAI("th"),
    TURKISH("tr"),
    UKRAINIAN("uk"),
    VIETNAMESE("vi");

    private String shortName;

    private Language(String shortName) {
        this.shortName = shortName;
    }

    public String getLangCode() {
        return shortName;
    }
}

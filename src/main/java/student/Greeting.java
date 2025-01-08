package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello", "Hello", "%s, %%s!");
    }

    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    // Getter
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    public String getFormatStr() {
        return formatStr;
    }

    public String getFormatStr(boolean asciiOnly) {
        return asciiOnly ? String.format(formatStr, asciiGreeting) : String.format(formatStr, unicodeGreeting);
    }

    public int getLocalityID() {
        return localityID;
    }

    public String getLocalityName() {
        return localityName;
    }

    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }

}
package student;

/**
 * This class is a placeholder which you will fully implement based on the javadoc.
 *
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 *
 */
public class Greeting {
    /** The unique identifier for the locality. */
    private int localityID;

    /** The name of the locality. */
    private String localityName;

    /** The ASCII greeting message. */
    private String asciiGreeting;

    /** The Unicode greeting message. */
    private String unicodeGreeting;

    /** The format string used for greeting messages. */
    private String formatStr;

    /**
     * Constructs a {@code Greeting} object with default greetings set to "Hello" and a default format.
     *
     * @param localityID   the unique identifier of the locality
     * @param localityName the name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Constructs a {@code Greeting} object with the same ASCII and Unicode greeting message.
     *
     * @param localityID   the unique identifier of the locality
     * @param localityName the name of the locality
     * @param asciiGreeting     the greeting message used for both ASCII and Unicode
     */
    public Greeting(int localityID, String localityName, String asciiGreeting) {
        this(localityID, localityName, asciiGreeting, asciiGreeting, String.format("%s, %%s!", asciiGreeting));
    }

    /**
     * Constructs a {@code Greeting} object with specified ASCII, Unicode greetings, and format.
     *
     * @param localityID      the unique identifier of the locality
     * @param localityName    the name of the locality
     * @param asciiGreeting   the greeting message in ASCII format
     * @param unicodeGreeting the greeting message in Unicode format
     * @param formatStr       the format string used for greetings (e.g., "%s, %%s!")
     */
    public Greeting(int localityID,
                    String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr != null ? formatStr : String.format("%s, %s!", asciiGreeting, unicodeGreeting);
    }

    // Getter
    /**
     * Returns the locality ID.
     *
     * @return the locality ID
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Returns the name of the locality.
     *
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the Unicode greeting message.
     *
     * @return the Unicode greeting message
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Returns the ASCII greeting message.
     *
     * @return the ASCII greeting message
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Returns the greeting format string.
     *
     * @return the format string used for the greeting
     */
    public String getFormatStr() {
        if (formatStr.contains("%%s")) {
            return String.format("%%s, %s!", unicodeGreeting);
        }
        return formatStr;
    }

    /**
     * Returns the formatted greeting string based on the provided format.
     *
     * @param asciiOnly if {@code true}, returns the ASCII greeting; otherwise, returns the Unicode greeting
     * @return the formatted greeting string based on the specified format and ASCII preference
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format("%%s, %s!", asciiGreeting);
        }
        return getFormatStr();
    }

    /**
     * Returns a string representation of the {@code Greeting} object.
     * The format of the string is:
     * <pre>
     * {localityID:2, localityName:"USA", asciiGreeting:"Hello", unicodeGreeting:"Hello"}
     * </pre>
     *
     * @return a string representation of the Greeting object
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }

}

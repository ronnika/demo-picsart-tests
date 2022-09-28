package enums;

public enum MenuItems {
    CREATE("Create"),
    BATCH("Batch Editor"),
    TOOLS("Editing tools"),
    DESIGN("Design"),
    DISCOVER("Discover"),
    TEMPLATES("Templates"),
    COMPARE("Compare plans");
    String notation;

    MenuItems(String notation) {
        this.notation = notation;
    }

    public String getNotation() { return notation; }
}

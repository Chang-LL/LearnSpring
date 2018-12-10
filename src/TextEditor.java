public class TextEditor {
    private SpellChecker spellChecker;
    private String name;
    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

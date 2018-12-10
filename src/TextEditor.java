public class TextEditor {
    private SpellChecker spellChecker;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        System.out.println("Inside set Text");
        this.text = text;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside set Spellchecker");
        this.spellChecker = spellChecker;
    }
}

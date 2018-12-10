public class TextEditor {
    private SpellChecker spellChecker;

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

public class TextEditor {
    private SpellChecker spellChecker;

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public TextEditor(SpellChecker spellChecker, int val) {
        System.out.println("Inside TextEditor constructor" +
                " val is " + val);
        this.spellChecker = spellChecker;
    }
}

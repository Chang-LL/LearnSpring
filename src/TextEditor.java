import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public TextEditor() {
        System.out.println("Inside TextEditor constructor." );
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}

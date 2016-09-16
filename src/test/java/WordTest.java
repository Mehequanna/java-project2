import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @After
  public void tearDown() {
    Word.clear();
  }

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("Word");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void Word_getTheWord_word() {
    Word myWord = new Word("Word");
    assertEquals("Word", myWord.getTheWord());
  }

  @Test
  public void Word_getId_0() {
    Word myWord = new Word("Word");
    assertEquals(0, myWord.getId());
  }

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("Word");
    Word secondWord = new Word("Word2");
    assertEquals(true, Word.all().contains(firstWord));
    assertEquals(true, Word.all().contains(secondWord));
  }

  @Test
  public void getId_wordsInstantiateWithAnID_0() {
    Word myWord = new Word("Word");
    assertEquals(0, myWord.getId());
  }

  @Test
  public void find_returnWordWithSameId_secondWord() {
    Word firstWord = new Word("Word");
    Word secondWord = new Word("Word2");
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }
}

import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @After
  public void tearDown() {
    Definition.clear();
  }

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("Definition");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void Definition_getTheDefinition_definition() {
    Definition myDefinition = new Definition("Definition");
    assertEquals("Definition", myDefinition.getTheDefinition());
  }

  @Test
  public void Definition_getId_0() {
    Definition myDefinition = new Definition("Definition");
    assertEquals(0, myDefinition.getId());
  }

  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("Definition");
    Definition secondDefinition = new Definition("Definition2");
    assertEquals(true, Definition.all().contains(firstDefinition));
    assertEquals(true, Definition.all().contains(secondDefinition));
  }

  @Test
  public void getId_definitionsInstantiateWithAnID_0() {
    Definition myDefinition = new Definition("Definition");
    assertEquals(0, myDefinition.getId());
  }

  @Test
  public void find_returnDefinitionWithSameId_secondDefinition() {
    Definition firstDefinition = new Definition("Definition");
    Definition secondDefinition = new Definition("Definition2");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }
}

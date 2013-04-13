import org.junit.Test;
import edu.ksu.cis.santos.mdcf.dml.ast.*;
import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.Weak.*;

public class ExModelWeak {
  @Test
  public void construct() {
    Model m = model(list()); //             create a model with empty declarations
    System.out.println(m); //               output: model(list())
    System.out.println(m.declarations); //  output: []
  }
}

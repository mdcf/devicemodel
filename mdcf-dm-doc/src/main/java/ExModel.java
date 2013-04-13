import org.junit.Test;
import edu.ksu.cis.santos.mdcf.dml.ast.*;
import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.*;

public class ExModel {
  @Test
  public void construct() {
    Model m = model(Ast.<Declaration>list()); //  create a model with empty declarations
    System.out.println(m); //                     output: model(list())
    System.out.println(m.declarations); //        output: []
  }
}

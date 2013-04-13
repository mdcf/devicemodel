import org.junit.Test;
import edu.ksu.cis.santos.mdcf.dml.ast.*;
import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.Weak.*;

public class ExModelVisitor {
  @Test
  public void visit() {
    Model m = model(list(basicType("foo", list())));

    System.out.println(m); //                           output: model(list(basicType("foo", list())))

    new AbstractVisitor() {
      @Override
      public boolean visitBasicType(BasicType node) {
        System.out.println("Reached " + node.name); //  output: Reached foo
        return true;
      }
    }.visit(m);

    new AbstractVisitor() {
      @Override
      public boolean visitModel(Model node) {
        return false;
      }

      @Override
      public boolean visitBasicType(BasicType node) {
        throw new RuntimeException("Reached " + node.name); //  unreachable
      }
    }.visit(m);
  }
}

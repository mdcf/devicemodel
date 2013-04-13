import org.junit.Test;
import edu.ksu.cis.santos.mdcf.dml.ast.*;
import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.Weak.*;
import edu.ksu.cis.santos.mdcf.dml.serialization.XStreamer;

public class ExModelXml {
  @Test
  public void de_serialization() {
    Model m = model(list()); // create a model with empty declarations
    String s = XStreamer.toXml(m);
    System.out.println(s); //                     output: <model>
    //                                                      <declarations class="ilist"></declarations>
    //                                                    </model>
    System.out.println(XStreamer.fromXml(s)); //  output: model(list())
  }
}

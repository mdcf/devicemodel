import org.junit.Test;
import edu.ksu.cis.santos.mdcf.dml.ast.*;
import static edu.ksu.cis.santos.mdcf.dms.ModelExtractor.*;

public class ExModelExtractor {
  @Test
  public void construct() {
    Model m = extractModel(new String[] { "edu.ksu.cis.santos.mdcf.dms.example" }  );
    System.out.println(m); //                     output: model(list(basicType(...)))
  }
}

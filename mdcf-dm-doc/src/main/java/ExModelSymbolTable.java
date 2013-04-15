import org.junit.Test;
import edu.ksu.cis.santos.mdcf.dml.symbol.SymbolTable;
import static edu.ksu.cis.santos.mdcf.dms.ModelExtractor.*;

public class ExModelSymbolTable {
  @Test
  public void construct() {
    SymbolTable st = SymbolTable
        .of(extractModel(new String[] { "edu.ksu.cis.santos.mdcf.dms.example" }));
    System.out.println(st); //  output: SymbolTable.of(model(list(basicType(...))))
  }
}

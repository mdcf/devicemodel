import org.junit.Test;
import edu.ksu.cis.santos.mdcf.dml.ast.*;
import edu.ksu.cis.santos.mdcf.dml.symbol.SymbolTable;
import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.Weak.*;
import static edu.ksu.cis.santos.mdcf.dml.serialization.XStreamer.*;
import static edu.ksu.cis.santos.mdcf.dms.ModelExtractor.extractModel;

public class ExModelXml {
  @Test
  public void de_serialization() {
    Model m = model(list()); // create a model with empty declarations
    String mXml = toXml(m);
    System.out.println(mXml); //            output: <model>
    //                                                <declarations class="ilist"></declarations>
    //                                              </model>
    System.out.println(fromXml(mXml)); //   output: model(list())
    
    SymbolTable st = SymbolTable
        .of(extractModel(new String[] { "edu.ksu.cis.santos.mdcf.dms.example" }));
    String stXml = toXml(st);
    System.out.println(stXml); //           output: <symbolTable>
    //                                                <models class="ilist">
    //                                                  <model>
    //                                                    <declarations class="ilist">
    //                                                      <basicType ...
    System.out.println(fromXml(stXml)); //  output: SymbolTable.of(model(list(basicType(...))))
  }
}

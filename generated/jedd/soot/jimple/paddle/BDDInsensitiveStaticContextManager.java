package soot.jimple.paddle;

import soot.jimple.paddle.queue.*;
import soot.jimple.paddle.bdddomains.*;

public class BDDInsensitiveStaticContextManager extends AbsStaticContextManager {
    BDDInsensitiveStaticContextManager(Rsrcc_srcm_stmt_kind_tgtc_tgtm in, Qsrcc_srcm_stmt_kind_tgtc_tgtm out) {
        super(in, out);
    }
    
    public boolean update() {
        final jedd.internal.RelationContainer newOut =
          new jedd.internal.RelationContainer(new jedd.Attribute[] { srcc.v(), srcm.v(), stmt.v(), kind.v(), tgtc.v(), tgtm.v() },
                                              new jedd.PhysicalDomain[] { C1.v(), MS.v(), ST.v(), KD.v(), C2.v(), MT.v() },
                                              ("<soot.jimple.paddle.bdddomains.srcc:soot.jimple.paddle.bdddo" +
                                               "mains.C1, soot.jimple.paddle.bdddomains.srcm:soot.jimple.pad" +
                                               "dle.bdddomains.MS, soot.jimple.paddle.bdddomains.stmt:soot.j" +
                                               "imple.paddle.bdddomains.ST, soot.jimple.paddle.bdddomains.ki" +
                                               "nd:soot.jimple.paddle.bdddomains.KD, soot.jimple.paddle.bddd" +
                                               "omains.tgtc:soot.jimple.paddle.bdddomains.C2, soot.jimple.pa" +
                                               "ddle.bdddomains.tgtm:soot.jimple.paddle.bdddomains.MT> newOu" +
                                               "t = in.get(); at /home/research/ccl/olhota/soot-trunk2/src/s" +
                                               "oot/jimple/paddle/BDDInsensitiveStaticContextManager.jedd:34" +
                                               ",45-51"),
                                              in.get());
        out.add(new jedd.internal.RelationContainer(new jedd.Attribute[] { stmt.v(), tgtm.v(), srcm.v(), tgtc.v(), kind.v(), srcc.v() },
                                                    new jedd.PhysicalDomain[] { ST.v(), MT.v(), MS.v(), C2.v(), KD.v(), C1.v() },
                                                    ("out.add(newOut) at /home/research/ccl/olhota/soot-trunk2/src" +
                                                     "/soot/jimple/paddle/BDDInsensitiveStaticContextManager.jedd:" +
                                                     "35,8-11"),
                                                    newOut));
        return !jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(newOut), jedd.internal.Jedd.v().falseBDD());
    }
}
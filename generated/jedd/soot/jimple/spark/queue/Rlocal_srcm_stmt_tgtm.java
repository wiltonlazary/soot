package soot.jimple.spark.queue;

import soot.util.*;
import soot.jimple.spark.bdddomains.*;
import soot.jimple.spark.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public abstract class Rlocal_srcm_stmt_tgtm {
    public abstract Iterator iterator();
    
    public abstract jedd.internal.RelationContainer get();
    
    public abstract boolean hasNext();
    
    public static class Tuple {
        private Local _local;
        
        public Local local() { return _local; }
        
        private SootMethod _srcm;
        
        public SootMethod srcm() { return _srcm; }
        
        private Unit _stmt;
        
        public Unit stmt() { return _stmt; }
        
        private SootMethod _tgtm;
        
        public SootMethod tgtm() { return _tgtm; }
        
        public Tuple(Local _local, SootMethod _srcm, Unit _stmt, SootMethod _tgtm) {
            super();
            this._local = _local;
            this._srcm = _srcm;
            this._stmt = _stmt;
            this._tgtm = _tgtm;
        }
        
        public int hashCode() { return 0; }
        
        public boolean equals(Object other) {
            if (!(other instanceof Tuple)) return false;
            Tuple o = (Tuple) other;
            if (o._local != _local) return false;
            if (o._srcm != _srcm) return false;
            if (o._stmt != _stmt) return false;
            if (o._tgtm != _tgtm) return false;
            return true;
        }
        
        public String toString() {
            StringBuffer ret = new StringBuffer();
            ret.append(this.local());
            ret.append(", ");
            ret.append(this.srcm());
            ret.append(", ");
            ret.append(this.stmt());
            ret.append(", ");
            ret.append(this.tgtm());
            ret.append(", ");
            return ret.toString();
        }
    }
    
    
    public Rlocal_srcm_stmt_tgtm() { super(); }
}
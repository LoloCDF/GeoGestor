
//
// Generado por mibgen version 5.1 (03/08/07) para compilar GEOGESTOR-MIB.
//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import com.sun.management.snmp.SnmpOidRecord;

// jdmk imports
//
import com.sun.management.snmp.SnmpOidTableSupport;

/**
 * La clase contiene las definiciones metadata para "GEOGESTOR-MIB".
 * Invoque SnmpOid.setSnmpOidTable(new GEOGESTOR_MIBOidTable()) para cargar la metadata en el MibStore.
 */
public class GEOGESTOR_MIBOidTable extends SnmpOidTableSupport implements Serializable {

    /**
     * Constructor por defecto. Inicialice el árbol que representa la MIB.
     */
    public GEOGESTOR_MIBOidTable() {
        super("GEOGESTOR_MIB");
        loadMib(varList);
    }

    static SnmpOidRecord varList [] = {
        new SnmpOidRecord("numClientes", "1.3.6.1.3.1.2", "I"),
        new SnmpOidRecord("tabla", "1.3.6.1.3.1.1", "TA"),
        new SnmpOidRecord("tablaEntry", "1.3.6.1.3.1.1.1", "EN"),
        new SnmpOidRecord("ciudad", "1.3.6.1.3.1.1.1.6", "S"),
        new SnmpOidRecord("localizacion", "1.3.6.1.3.1.1.1.5", "S"),
        new SnmpOidRecord("url", "1.3.6.1.3.1.1.1.4", "S"),
        new SnmpOidRecord("nconexiones", "1.3.6.1.3.1.1.1.3", "I"),
        new SnmpOidRecord("ipAddr", "1.3.6.1.3.1.1.1.2", "IP"),
        new SnmpOidRecord("ipIndex", "1.3.6.1.3.1.1.1.1", "I")    };
}

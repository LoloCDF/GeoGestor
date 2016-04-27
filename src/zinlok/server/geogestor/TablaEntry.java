
package zinlok.server.geogestor;

//
// Generado por mibgen version 5.1 (03/08/07) para compilar GEOGESTOR-MIB.
//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;


/**
 * La clase es utilizada para implementar el grupo "TablaEntry".
 * El grupo ha sido definido con el siguiente OID: 1.3.6.1.3.1.1.1.
 */
public class TablaEntry implements TablaEntryMBean, Serializable {

    /**
     * Variable para almacenar el valor de "IpAddr".
     * La variable es identificada por: "1.3.6.1.3.1.1.1.2".
     */
    protected String IpAddr = new String("192.9.9.100");

    /**
     * Variable para almacenar el valor de "IpIndex".
     * La variable es identificada por: "1.3.6.1.3.1.1.1.1".
     */
    protected Integer IpIndex = new Integer(1);


    /**
     * Constructor para el grupo "TablaEntry".
     */
    public TablaEntry(SnmpMib myMib) {
    }

    /**
     * Getter para la variable "IpAddr".
     */
    public String getIpAddr() throws SnmpStatusException {
        return IpAddr;
    }

    /**
     * Getter para la variable "IpIndex".
     */
    public Integer getIpIndex() throws SnmpStatusException {
        return IpIndex;
    }

}

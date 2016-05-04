
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
     * Variable para almacenar el valor de "Ciudad".
     * La variable es identificada por: "1.3.6.1.3.1.1.1.6".
     */
    protected String Ciudad = new String("JDMK 5.1");

    /**
     * Variable para almacenar el valor de "Localizacion".
     * La variable es identificada por: "1.3.6.1.3.1.1.1.5".
     */
    protected String Localizacion = new String("JDMK 5.1");

    /**
     * Variable para almacenar el valor de "Url".
     * La variable es identificada por: "1.3.6.1.3.1.1.1.4".
     */
    protected String Url = new String("JDMK 5.1");

    /**
     * Variable para almacenar el valor de "Nconexiones".
     * La variable es identificada por: "1.3.6.1.3.1.1.1.3".
     */
    protected Integer Nconexiones = new Integer(1);

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
     * Getter para la variable "Ciudad".
     */
    public String getCiudad() throws SnmpStatusException {
        return Ciudad;
    }

    /**
     * Getter para la variable "Localizacion".
     */
    public String getLocalizacion() throws SnmpStatusException {
        return Localizacion;
    }

    /**
     * Getter para la variable "Url".
     */
    public String getUrl() throws SnmpStatusException {
        return Url;
    }

    /**
     * Getter para la variable "Nconexiones".
     */
    public Integer getNconexiones() throws SnmpStatusException {
        return Nconexiones;
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

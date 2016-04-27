
package zinlok.server.geogestor;

//
// Generado por mibgen version 5.1 (03/08/07) para compilar GEOGESTOR-MIB.
//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import javax.management.MBeanServer;
import com.sun.management.snmp.SnmpString;
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;

/**
 * La clase es utilizada para implementar el grupo "Geogestor_mib".
 * El grupo ha sido definido con el siguiente OID: 1.3.6.1.3.1.
 */
public class Geogestor_mib implements Geogestor_mibMBean, Serializable {

    /**
     * Variable para almacenar el valor de "NumClientes".
     * La variable es identificada por: "1.3.6.1.3.1.2".
     */
    protected Integer NumClientes = new Integer(1);

    /**
     * Variable para almacenar el valor de "Tabla".
     * La variable es identificada por: "1.3.6.1.3.1.1".
     */
    protected TableTabla Tabla;


    /**
     * Constructor para el grupo "Geogestor_mib".
     * Si el grupo contiene una tabla, las entradas creadas v�a un SNMP SET no ser�n registradas en Java DMK.
     */
    public Geogestor_mib(SnmpMib myMib) {
        Tabla = new TableTabla (myMib);
    }


    /**
     * Constructor para el grupo "Geogestor_mib".
     * Si el grupo contiene una tabla, las entradas creadas v�a un SNMP SET ser�n AUTOMATICAMENTE registradas en Java DMK.
     */
    public Geogestor_mib(SnmpMib myMib, MBeanServer server) {
        Tabla = new TableTabla (myMib, server);
    }

    /**
     * Getter para la variable "NumClientes".
     */
    public Integer getNumClientes() throws SnmpStatusException {
        return NumClientes;
    }

    /**
     * Setter para la variable "NumClientes".
     */
    public void setNumClientes(Integer x) throws SnmpStatusException {
        NumClientes = x;
    }

    /**
     * Controlador para la variable "NumClientes".
     */
    public void checkNumClientes(Integer x) throws SnmpStatusException {
        //
        // A�ada su propia polit�ca de control.
        //
    }

    /**
     * Acceso a la variable "Tabla".
     */
    public TableTabla accessTabla() throws SnmpStatusException {
        return Tabla;
    }

    /**
     * Acceso a la variable "Tabla" como una propiedad indexada.
     */
    public TablaEntryMBean[] getTabla() throws SnmpStatusException {
        return Tabla.getEntries();
    }

}

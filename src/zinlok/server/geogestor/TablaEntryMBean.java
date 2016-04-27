package zinlok.server.geogestor;

//
// Generado por mibgen version 5.1 (03/08/07) para compilar GEOGESTOR-MIB en modo metadata est�ndar.
//


// jmx imports
//
import com.sun.management.snmp.SnmpStatusException;

/**
 * La interfaz es utilizada para representar la interfaz de administraci�n remota del MBean "TablaEntry".
 */
public interface TablaEntryMBean {

    /**
     * Getter para la variable "IpAddr".
     */
    public String getIpAddr() throws SnmpStatusException;

    /**
     * Getter para la variable "IpIndex".
     */
    public Integer getIpIndex() throws SnmpStatusException;

}

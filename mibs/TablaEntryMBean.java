
//
// Generado por mibgen version 5.1 (03/08/07) para compilar GEOGESTOR-MIB en modo metadata estándar.
//


// jmx imports
//
import com.sun.management.snmp.SnmpStatusException;

/**
 * La interfaz es utilizada para representar la interfaz de administración remota del MBean "TablaEntry".
 */
public interface TablaEntryMBean {

    /**
     * Getter para la variable "Ciudad".
     */
    public String getCiudad() throws SnmpStatusException;

    /**
     * Getter para la variable "Localizacion".
     */
    public String getLocalizacion() throws SnmpStatusException;

    /**
     * Getter para la variable "Url".
     */
    public String getUrl() throws SnmpStatusException;

    /**
     * Getter para la variable "Nconexiones".
     */
    public Integer getNconexiones() throws SnmpStatusException;

    /**
     * Getter para la variable "IpAddr".
     */
    public String getIpAddr() throws SnmpStatusException;

    /**
     * Getter para la variable "IpIndex".
     */
    public Integer getIpIndex() throws SnmpStatusException;

}

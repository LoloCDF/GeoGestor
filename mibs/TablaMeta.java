
//
// Generado por mibgen version 5.1 (03/08/07) para compilar GEOGESTOR-MIB en modo metadata estándar.
//

// java imports
//
import java.io.Serializable;
import java.util.Vector;

// jmx imports
//
import javax.management.MBeanServer;
import javax.management.ObjectName;
import com.sun.management.snmp.SnmpCounter;
import com.sun.management.snmp.SnmpCounter64;
import com.sun.management.snmp.SnmpGauge;
import com.sun.management.snmp.SnmpInt;
import com.sun.management.snmp.SnmpUnsignedInt;
import com.sun.management.snmp.SnmpIpAddress;
import com.sun.management.snmp.SnmpTimeticks;
import com.sun.management.snmp.SnmpOpaque;
import com.sun.management.snmp.SnmpString;
import com.sun.management.snmp.SnmpStringFixed;
import com.sun.management.snmp.SnmpOid;
import com.sun.management.snmp.SnmpNull;
import com.sun.management.snmp.SnmpValue;
import com.sun.management.snmp.SnmpVarBind;
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpIndex;
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpMibTable;
import com.sun.management.snmp.agent.SnmpMibSubRequest;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;

/**
 * La clase es utilizada para implementar el grupo "Tabla".
 * El grupo ha sido definido con el siguiente OID: 1.3.6.1.3.1.1.
 */
public class TablaMeta extends SnmpMibTable implements Serializable {

    /**
     * Constructor para la tabla. Inicialice metadata para "TablaMeta".
     * La referencia del MBeanServer es actualizada y las entradas creadas vía un SNMP SET serán AUTOMATICAMENTE registradas en Java DMK.
     */
    public TablaMeta(SnmpMib myMib, SnmpStandardObjectServer objserv) {
        super(myMib);
        objectserver = objserv;
    }


    /**
     * Método de construcción para la meta-clase de las entrads de la tabla "TablaEntry".
     * 
     * Puede redefinir este método si necesita reemplazarlo
     * la meta-clase generada por defecto por su propia clase modificada.
     * 
     * @param snmpEntryName Nombre del objeto SNMP Entry (conceptual row) ("TablaEntry")
     * @param tableName Nombre de la tabla donde las entradas son registradas ("Tabla")
     * @param mib El objeto SnmpMib donde la tabla es registrada.
     * @param server El MBeanServer para las entradas de esta tabla (puede ser nulo)
     * 
     * @return Una instancia de la meta-clase generada para
     *         las tuplas "TablaEntry" (conceptual row) (TablaEntryMeta)
     * 
     **/
    protected TablaEntryMeta createTablaEntryMetaNode(String snmpEntryName, String tableName, SnmpMib mib, MBeanServer server)  {
        return new TablaEntryMeta(mib, objectserver);
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "createNewEntry" definido en "SnmpMibTable".
    // Mirar la API Javadoc de "SnmpMibTable" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void createNewEntry(SnmpMibSubRequest req, SnmpOid rowOid, int depth)
        throws SnmpStatusException {
        if (factory != null)
            factory.createNewEntry(req, rowOid, depth, this);
        else
            throw new SnmpStatusException(
                SnmpStatusException.snmpRspNoAccess);
    }



    // ------------------------------------------------------------
    // 
    // Implementa el método "isRegistrationRequired" definido en "SnmpMibTable".
    // Mirar la API Javadoc de "SnmpMibTable" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public boolean isRegistrationRequired()  {
        return false;
    }



    public void registerEntryNode(SnmpMib mib, MBeanServer server)  {
        node = createTablaEntryMetaNode("TablaEntry", "Tabla", mib, server);
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "addEntry" definido en "SnmpMibTable".
    // Mirar la API Javadoc de "SnmpMibTable" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public synchronized void addEntry(SnmpOid rowOid, ObjectName objname,
                 Object entry)
        throws SnmpStatusException {
        if (! (entry instanceof TablaEntryMBean) )
            throw new ClassCastException("Entries for Table \"" + 
                           "Tabla" + "\" must implement the \"" + 
                           "TablaEntryMBean" + "\" interface.");
        super.addEntry(rowOid, objname, entry);
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "get" definido en "SnmpMibTable".
    // Mirar la API Javadoc de "SnmpMibTable" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void get(SnmpMibSubRequest req, SnmpOid rowOid, int depth)
        throws SnmpStatusException {
        TablaEntryMBean entry = (TablaEntryMBean) getEntry(rowOid);
        synchronized (this) {
            node.setInstance(entry);
            node.get(req,depth);
        }
    }

    // ------------------------------------------------------------
    // 
    // Implementa el método "set" definido en "SnmpMibTable".
    // Mirar la API Javadoc de "SnmpMibTable" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void set(SnmpMibSubRequest req, SnmpOid rowOid, int depth)
        throws SnmpStatusException {
        if (req.getSize() == 0) return;

        TablaEntryMBean entry = (TablaEntryMBean) getEntry(rowOid);
        synchronized (this) {
            node.setInstance(entry);
            node.set(req,depth);
        }
    }

    // ------------------------------------------------------------
    // 
    // Implementa el método "check" definido en "SnmpMibTable".
    // Mirar la API Javadoc de "SnmpMibTable" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void check(SnmpMibSubRequest req, SnmpOid rowOid, int depth)
        throws SnmpStatusException {
        if (req.getSize() == 0) return;

        TablaEntryMBean entry = (TablaEntryMBean) getEntry(rowOid);
        synchronized (this) {
            node.setInstance(entry);
            node.check(req,depth);
        }
    }

    /**
     * Comprueba que "var" identifica a un objeto columna.
     */
    public void validateVarEntryId( SnmpOid rowOid, long var, Object data )
        throws SnmpStatusException {
        node.validateVarId(var, data);
    }

    /**
     * Returns true if "var" identifies a readable scalar object.
     */
    public boolean isReadableEntryId( SnmpOid rowOid, long var, Object data )
        throws SnmpStatusException {
        return node.isReadable(var);
    }

    /**
     * Devuelve el arco del objeto columna que sigue a "var".
     */
    public long getNextVarEntryId( SnmpOid rowOid, long var, Object data )
        throws SnmpStatusException {
        long nextvar = node.getNextVarId(var, data);
        while (!isReadableEntryId(rowOid, nextvar, data))
            nextvar = node.getNextVarId(nextvar, data);
        return nextvar;
    }

    // ------------------------------------------------------------
    // 
    // Implementa el método "skipEntryVariable" definido en "SnmpMibTable".
    // Mirar la API Javadoc de "SnmpMibTable" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public boolean skipEntryVariable( SnmpOid rowOid, long var, Object data, int pduVersion) {
        try {
            TablaEntryMBean entry = (TablaEntryMBean) getEntry(rowOid);
            synchronized (this) {
                node.setInstance(entry);
                return node.skipVariable(var, data, pduVersion);
            }
        } catch (SnmpStatusException x) {
            return false;
        }
    }


    /**
     * Referencia sobre la metadata de la entrada.
     */
    private TablaEntryMeta node;

    /**
     * Referencia sobre el servidor de objetos SNMP.
     */
    protected SnmpStandardObjectServer objectserver;

}

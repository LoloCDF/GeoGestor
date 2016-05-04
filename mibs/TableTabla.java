
//
// Generado por mibgen version 5.1 (03/08/07) para compilar GEOGESTOR-MIB.
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
import com.sun.management.snmp.agent.SnmpTableEntryFactory;
import com.sun.management.snmp.agent.SnmpTableCallbackHandler;
import com.sun.management.snmp.agent.SnmpTableSupport;

/**
 * La clase es utilizada para implementar el grupo "Tabla".
 * El grupo ha sido definido con el siguiente OID: 1.3.6.1.3.1.1.
 */
public class TableTabla extends SnmpTableSupport implements Serializable {

    /**
     * Constructor para la tabla. Inicialice metadata para "TableTabla".
     * La referencia del MBeanServer no es actualizada y las entradas creadas vía un SNMP SET no serán registradas en Java DMK.
     */
    public TableTabla(SnmpMib myMib) {
        super(myMib);
    }

    /**
     * Constructor para la tabla. Inicialice metadata para "TableTabla".
     * La referencia del MBeanServer es actualizada y las entradas creadas vía un SNMP SET serán AUTOMATICAMENTE registradas en Java DMK.
     */
    public TableTabla(SnmpMib myMib, MBeanServer server) {
        this(myMib);
        this.server = server;
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "createNewEntry" definido en "SnmpTableSupport".
    // Mirar la API Javadoc de "SnmpTableSupport" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void createNewEntry(SnmpMibSubRequest req, SnmpOid rowOid,
                 int depth, SnmpMibTable meta)
        throws SnmpStatusException {
        final SnmpIndex index = buildSnmpIndex(rowOid);
        final Vector v = index.getComponents();
        SnmpOid oid;
        try  {
            final SnmpOid oid0 = (SnmpOid) v.elementAt(0);
            ObjectName objname = null;
            if (server != null)
                objname = buildNameFromIndex( index );

            // Tenga en cuenta que cuando use la versión estándar
            // de la metadata, el objeto devuelto debe implementar
            // la interfaz "{0}".
            //
            final Object entry =
                 createTablaEntryMBean(req, rowOid, depth, objname, meta,
                    oid0.toInteger());
            if (server != null) {
                server.registerMBean(entry, objname);
            }
            meta.addEntry(rowOid,objname,entry);
        } catch(SnmpStatusException e) {
            throw e;
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new SnmpStatusException(SnmpStatusException.snmpRspWrongValue);
        } catch(Exception e) {
            throw new SnmpStatusException(e.getMessage());
        }
    }



    // ------------------------------------------------------------
    // 
    // Implementa el método "getRegisteredTableMeta" definido en "SnmpTableSupport".
    // Mirar la API Javadoc de "SnmpTableSupport" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    protected SnmpMibTable getRegisteredTableMeta(SnmpMib mib)  {
        return mib.getRegisteredTableMeta("Tabla");
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "removeEntryCb" definido en "SnmpTableSupport".
    // Mirar la API Javadoc de "SnmpTableSupport" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void removeEntryCb(int pos, SnmpOid row, ObjectName name,
                Object entry, SnmpMibTable meta)
            throws SnmpStatusException {
        try  {
            super.removeEntryCb(pos,row,name,entry,meta);
            if (server != null && name != null)
                server.unregisterMBean(name);
        } catch (Exception x) { }
    }


    /**
     * Añade una nueva entrada a la tabla.
     * 
     * Si la metadata asociada necesita un ObjectName
     * un nuevo ObjectName será generado usando "buildNameFromIndex".
     * 
     * Este método llama al método "addEntry" de "SnmpTableSupport".
     * Mirar la API Javadoc de "SnmpTableSupport" para obtener un mayor detalle.
     * 
     **/

    public synchronized void addEntry(TablaEntryMBean entry)
        throws SnmpStatusException {
        SnmpIndex index = buildSnmpIndex(entry);
        super.addEntry(index, (Object) entry);
    }


    /**
     * Añade una nueva entrada a la tabla.
     * 
     * Este método llama al método "addEntry" de "SnmpTableSupport".
     * Mirar la API Javadoc de "SnmpTableSupport" para obtener un mayor detalle.
     * 
     **/

    public synchronized void addEntry(TablaEntryMBean entry, ObjectName name)
        throws SnmpStatusException {
        SnmpIndex index = buildSnmpIndex(entry);
        super.addEntry(index, name, (Object) entry);
    }


    /**
     * Devuelve las entradas almacenadas en la tabla.
     * 
     * Este método llama al método "getBasicEntries" de "SnmpTableSupport".
     * Mirar la API Javadoc de "SnmpTableSupport" para obtener un mayor detalle.
     * 
     **/

    public synchronized TablaEntryMBean[] getEntries() {
        Object[] array = getBasicEntries();
        TablaEntryMBean[] result = new TablaEntryMBean[array.length];
        java.lang.System.arraycopy(array,0, result,0, array.length);
        return result;
    }


    /**
     * Suprime la entrada especificada de la tabla.
     * 
     * Este método llama al método "removeEntry" de "SnmpTableSupport".
     * Mirar la API Javadoc de "SnmpTableSupport" para obtener un mayor detalle.
     * 
     **/

    public void removeEntry(TablaEntryMBean entry)
        throws SnmpStatusException {
        SnmpIndex index = buildSnmpIndex(entry);
        super.removeEntry(index, entry) ;
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "buildNameFromIndex" definido en "SnmpTableSupport".
    // Mirar la API Javadoc de "SnmpTableSupport" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------


    public ObjectName buildNameFromIndex(SnmpIndex index)
        throws SnmpStatusException {
        Vector v = index.getComponents();
        SnmpOid oid;
        try  {
            oid = (SnmpOid) v.elementAt(0);
            String _keyIpIndex = oid.toInteger().toString();
            return new ObjectName("TableTabla:name=TablaEntry" + ",IpIndex=" + _keyIpIndex);
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new SnmpStatusException(SnmpStatusException.snmpRspWrongValue);
        } catch(Exception e) {
            throw new SnmpStatusException(e.getMessage());
        }
    }

    /**
     * Construyendo índice para "TablaEntry"
     */
    public SnmpIndex buildSnmpIndex(TablaEntryMBean entry)
        throws SnmpStatusException {
        SnmpOid[] oids = new SnmpOid[1];
        SnmpValue val = null;
        val = new SnmpInt(entry.getIpIndex());
        oids[0] = val.toOid();
        return new SnmpIndex(oids);
    }

    /**
     * Construyendo índice para "TablaEntry"
     */
    public SnmpOid buildOidFromIndex(SnmpIndex index)
        throws SnmpStatusException {
        SnmpOid oid = new SnmpOid();
        if (index.getNbComponents() != 1)
            throw new SnmpStatusException(SnmpStatusException.noSuchInstance);
        try {
            Vector v = index.getComponents();
            SnmpInt.appendToOid((SnmpOid)v.elementAt(0), oid);
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new SnmpStatusException(SnmpStatusException.noSuchInstance);
        }
        return oid;
    }

    /**
     * Construyendo índice para "TablaEntry"
     */
    public SnmpOid buildOidFromIndexVal(Integer aIpIndex)
        throws SnmpStatusException  {
        SnmpOid oid = new SnmpOid();
        try {
            SnmpInt.appendToOid(new SnmpInt(aIpIndex).toOid(), oid);
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new SnmpStatusException(SnmpStatusException.noSuchInstance);
        }
        return oid;
    }

    /**
     * Construyendo índice para "TablaEntry"
     */
    public SnmpIndex buildSnmpIndex(long[] index, int start)
        throws SnmpStatusException {
        SnmpOid[] oids = new SnmpOid[1];
        int pos = start;
        oids[0] = SnmpInt.toOid(index, pos);
        return new SnmpIndex(oids);
    }


    /**
     * Método de construcción para los MBeans representando a las entradas de la tabla "TablaEntry".
     * 
     * Puede redefinir este método si necesita reemplazarlo
     * la clase del MBean generada por defecto por su propia clase modificada.
     * 
     * @return Una instancia de la clase del MBean generada para
     *         las tuplas "TablaEntry" (conceptual row).
     * 
     * Tenga en cuenta que cuando use la versión estándar
     * de la metadata, el objeto devuelto debe implementar
     * la interfaz "{0}".
     */

    public Object createTablaEntryMBean(SnmpMibSubRequest req,
                SnmpOid rowOid, int depth, ObjectName entryObjName,
                SnmpMibTable meta, Integer  aIpIndex)
            throws SnmpStatusException  {

        // Tenga en cuenta que cuando use la versión estándar
        // de la metadata, el objeto devuelto debe implementar
        // la interfaz "{0}".
        //
        TablaEntry entry = new TablaEntry(theMib);
        entry.IpIndex = aIpIndex;
        return entry;
    }


    /**
     * Referencia sobre el MBeanServer.
     */
    protected MBeanServer server;

}

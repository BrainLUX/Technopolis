public   class CachedRowSetImpl implements javax.sql.rowset.CachedRowSet {

public int size() {
return 0;
}
public void execute(java.sql.Connection CONNECTION103) {
return  ;
}
public void release() {
return  ;
}
public void populate(java.sql.ResultSet RESULTSET389 , int INT428) {
return  ;
}
public void populate(java.sql.ResultSet RESULTSET375) {
return  ;
}
public void acceptChanges() {
return  ;
}
public void acceptChanges(java.sql.Connection CONNECTION132) {
return  ;
}
public void restoreOriginal() {
return  ;
}
public void undoDelete() {
return  ;
}
public void undoInsert() {
return  ;
}
public void undoUpdate() {
return  ;
}
public boolean columnUpdated(java.lang.String STRING319) {
return false;
}
public boolean columnUpdated(int INT94) {
return false;
}
public java.util.Collection toCollection(int INT129) {
return null;
}
public java.util.Collection toCollection() {
return null;
}
public java.util.Collection toCollection(java.lang.String STRING831) {
return null;
}
public javax.sql.rowset.spi.SyncProvider getSyncProvider() {
return null;
}
public void setSyncProvider(java.lang.String STRING717) {
return  ;
}
public void setMetaData(javax.sql.RowSetMetaData ROWSETMETADATA950) {
return  ;
}
public java.sql.ResultSet getOriginal() {
return null;
}
public java.sql.ResultSet getOriginalRow() {
return null;
}
public void setOriginalRow() {
return  ;
}
public java.lang.String getTableName() {
return null;
}
public void setTableName(java.lang.String STRING316) {
return  ;
}
public int[] getKeyColumns() {
return null;
}
public void setKeyColumns(int[] INT53) {
return  ;
}
public javax.sql.RowSet createShared() {
return null;
}
public javax.sql.rowset.CachedRowSet createCopy() {
return null;
}
public javax.sql.rowset.CachedRowSet createCopySchema() {
return null;
}
public javax.sql.rowset.RowSetWarning getRowSetWarnings() {
return null;
}
public boolean getShowDeleted() {
return false;
}
public void setShowDeleted(boolean BOOLEAN388) {
return  ;
}
public void commit() {
return  ;
}
public void rollback(java.sql.Savepoint SAVEPOINT348) {
return  ;
}
public void rollback() {
return  ;
}
public void rowSetPopulated(javax.sql.RowSetEvent ROWSETEVENT144 , int INT538) {
return  ;
}
public void setPageSize(int INT926) {
return  ;
}
public int getPageSize() {
return 0;
}
public boolean nextPage() {
return false;
}
public boolean previousPage() {
return false;
}
public javax.sql.rowset.CachedRowSet createCopyNoConstraints() {
return null;
}
public void execute() {
return  ;
}
public void setReadOnly(boolean BOOLEAN644) {
return  ;
}
public void setBoolean(int INT142 , boolean BOOLEAN827) {
return  ;
}
public void setBoolean(java.lang.String STRING76 , boolean BOOLEAN431) {
return  ;
}
public void setByte(int INT614 , byte BYTE46) {
return  ;
}
public void setByte(java.lang.String STRING68 , byte BYTE976) {
return  ;
}
public void setShort(int INT791 , short SHORT3) {
return  ;
}
public void setShort(java.lang.String STRING692 , short SHORT740) {
return  ;
}
public void setInt(int INT460 , int INT141) {
return  ;
}
public void setInt(java.lang.String STRING95 , int INT148) {
return  ;
}
public void setLong(int INT500 , long LONG979) {
return  ;
}
public void setLong(java.lang.String STRING108 , long LONG716) {
return  ;
}
public void setFloat(java.lang.String STRING70 , float FLOAT528) {
return  ;
}
public void setFloat(int INT941 , float FLOAT744) {
return  ;
}
public void setDouble(java.lang.String STRING523 , double DOUBLE682) {
return  ;
}
public void setDouble(int INT440 , double DOUBLE242) {
return  ;
}
public boolean isReadOnly() {
return false;
}
public void setTimestamp(java.lang.String STRING981 , java.sql.Timestamp TIMESTAMP760) {
return  ;
}
public void setTimestamp(int INT612 , java.sql.Timestamp TIMESTAMP964) {
return  ;
}
public void setTimestamp(java.lang.String STRING627 , java.sql.Timestamp TIMESTAMP446 , java.util.Calendar CALENDAR255) {
return  ;
}
public void setTimestamp(int INT755 , java.sql.Timestamp TIMESTAMP938 , java.util.Calendar CALENDAR270) {
return  ;
}
public void setArray(int INT936 , java.sql.Array ARRAY874) {
return  ;
}
public void setURL(int INT68 , java.net.URL URL695) {
return  ;
}
public java.lang.String getPassword() {
return null;
}
public void setBytes(java.lang.String STRING834 , byte[] BYTE312) {
return  ;
}
public void setBytes(int INT319 , byte[] BYTE495) {
return  ;
}
public void setRef(int INT702 , java.sql.Ref REF418) {
return  ;
}
public void setObject(int INT666 , java.lang.Object OBJECT314 , int INT430 , int INT830) {
return  ;
}
public void setObject(java.lang.String STRING983 , java.lang.Object OBJECT708 , int INT135 , int INT348) {
return  ;
}
public void setObject(int INT207 , java.lang.Object OBJECT668 , int INT461) {
return  ;
}
public void setObject(java.lang.String STRING465 , java.lang.Object OBJECT437 , int INT948) {
return  ;
}
public void setObject(java.lang.String STRING872 , java.lang.Object OBJECT219) {
return  ;
}
public void setObject(int INT44 , java.lang.Object OBJECT238) {
return  ;
}
public void setCharacterStream(java.lang.String STRING990 , java.io.Reader READER659) {
return  ;
}
public void setCharacterStream(java.lang.String STRING506 , java.io.Reader READER942 , int INT606) {
return  ;
}
public void setCharacterStream(int INT233 , java.io.Reader READER140) {
return  ;
}
public void setCharacterStream(int INT137 , java.io.Reader READER797 , int INT439) {
return  ;
}
public void setBinaryStream(java.lang.String STRING864 , java.io.InputStream INPUTSTREAM885 , int INT489) {
return  ;
}
public void setBinaryStream(int INT712 , java.io.InputStream INPUTSTREAM747 , int INT782) {
return  ;
}
public void setBinaryStream(int INT44 , java.io.InputStream INPUTSTREAM862) {
return  ;
}
public void setBinaryStream(java.lang.String STRING86 , java.io.InputStream INPUTSTREAM245) {
return  ;
}
public void setAsciiStream(java.lang.String STRING179 , java.io.InputStream INPUTSTREAM663 , int INT697) {
return  ;
}
public void setAsciiStream(int INT746 , java.io.InputStream INPUTSTREAM234) {
return  ;
}
public void setAsciiStream(java.lang.String STRING415 , java.io.InputStream INPUTSTREAM240) {
return  ;
}
public void setAsciiStream(int INT281 , java.io.InputStream INPUTSTREAM788 , int INT617) {
return  ;
}
public void setDate(java.lang.String STRING51 , java.sql.Date DATE557 , java.util.Calendar CALENDAR336) {
return  ;
}
public void setDate(java.lang.String STRING424 , java.sql.Date DATE779) {
return  ;
}
public void setDate(int INT569 , java.sql.Date DATE125) {
return  ;
}
public void setDate(int INT193 , java.sql.Date DATE783 , java.util.Calendar CALENDAR19) {
return  ;
}
public void setTime(int INT671 , java.sql.Time TIME554 , java.util.Calendar CALENDAR427) {
return  ;
}
public void setTime(int INT96 , java.sql.Time TIME72) {
return  ;
}
public void setTime(java.lang.String STRING160 , java.sql.Time TIME413 , java.util.Calendar CALENDAR133) {
return  ;
}
public void setTime(java.lang.String STRING473 , java.sql.Time TIME691) {
return  ;
}
public java.lang.String getUrl() {
return null;
}
public void setUrl(java.lang.String STRING190) {
return  ;
}
public java.lang.String getDataSourceName() {
return null;
}
public void setDataSourceName(java.lang.String STRING948) {
return  ;
}
public java.lang.String getUsername() {
return null;
}
public void setUsername(java.lang.String STRING369) {
return  ;
}
public void setPassword(java.lang.String STRING726) {
return  ;
}
public java.util.Map getTypeMap() {
return null;
}
public void setTypeMap(java.util.Map MAP606) {
return  ;
}
public java.lang.String getCommand() {
return null;
}
public void setCommand(java.lang.String STRING211) {
return  ;
}
public int getMaxFieldSize() {
return 0;
}
public void setMaxFieldSize(int INT424) {
return  ;
}
public int getMaxRows() {
return 0;
}
public void setMaxRows(int INT132) {
return  ;
}
public int getQueryTimeout() {
return 0;
}
public void setQueryTimeout(int INT961) {
return  ;
}
public void setType(int INT440) {
return  ;
}
public void setConcurrency(int INT774) {
return  ;
}
public void setNull(java.lang.String STRING844 , int INT493 , java.lang.String STRING450) {
return  ;
}
public void setNull(int INT385 , int INT481) {
return  ;
}
public void setNull(int INT494 , int INT438 , java.lang.String STRING139) {
return  ;
}
public void setNull(java.lang.String STRING529 , int INT395) {
return  ;
}
public void setBigDecimal(java.lang.String STRING915 , java.math.BigDecimal BIGDECIMAL251) {
return  ;
}
public void setBigDecimal(int INT500 , java.math.BigDecimal BIGDECIMAL237) {
return  ;
}
public void setString(java.lang.String STRING484 , java.lang.String STRING938) {
return  ;
}
public void setString(int INT321 , java.lang.String STRING450) {
return  ;
}
public int getTransactionIsolation() {
return 0;
}
public void setTransactionIsolation(int INT861) {
return  ;
}
public boolean getEscapeProcessing() {
return false;
}
public void setEscapeProcessing(boolean BOOLEAN410) {
return  ;
}
public void setNCharacterStream(int INT8 , java.io.Reader READER223 , long LONG995) {
return  ;
}
public void setNCharacterStream(int INT84 , java.io.Reader READER945) {
return  ;
}
public void setNCharacterStream(java.lang.String STRING964 , java.io.Reader READER986) {
return  ;
}
public void setNCharacterStream(java.lang.String STRING199 , java.io.Reader READER826 , long LONG812) {
return  ;
}
public void removeRowSetListener(javax.sql.RowSetListener ROWSETLISTENER188) {
return  ;
}
public void setBlob(int INT184 , java.io.InputStream INPUTSTREAM932) {
return  ;
}
public void setBlob(java.lang.String STRING957 , java.sql.Blob BLOB563) {
return  ;
}
public void setBlob(int INT244 , java.io.InputStream INPUTSTREAM427 , long LONG226) {
return  ;
}
public void setBlob(int INT289 , java.sql.Blob BLOB609) {
return  ;
}
public void setBlob(java.lang.String STRING543 , java.io.InputStream INPUTSTREAM191 , long LONG374) {
return  ;
}
public void setBlob(java.lang.String STRING448 , java.io.InputStream INPUTSTREAM14) {
return  ;
}
public void setClob(java.lang.String STRING579 , java.sql.Clob CLOB625) {
return  ;
}
public void setClob(int INT968 , java.io.Reader READER299 , long LONG230) {
return  ;
}
public void setClob(java.lang.String STRING378 , java.io.Reader READER634 , long LONG422) {
return  ;
}
public void setClob(int INT527 , java.io.Reader READER524) {
return  ;
}
public void setClob(java.lang.String STRING815 , java.io.Reader READER798) {
return  ;
}
public void setClob(int INT363 , java.sql.Clob CLOB394) {
return  ;
}
public void clearParameters() {
return  ;
}
public void addRowSetListener(javax.sql.RowSetListener ROWSETLISTENER419) {
return  ;
}
public void setSQLXML(int INT640 , java.sql.SQLXML SQLXML835) {
return  ;
}
public void setSQLXML(java.lang.String STRING873 , java.sql.SQLXML SQLXML345) {
return  ;
}
public void setRowId(int INT525 , java.sql.RowId ROWID733) {
return  ;
}
public void setRowId(java.lang.String STRING312 , java.sql.RowId ROWID859) {
return  ;
}
public void setNString(java.lang.String STRING337 , java.lang.String STRING316) {
return  ;
}
public void setNString(int INT919 , java.lang.String STRING381) {
return  ;
}
public void setNClob(int INT130 , java.sql.NClob NCLOB808) {
return  ;
}
public void setNClob(int INT580 , java.io.Reader READER843) {
return  ;
}
public void setNClob(java.lang.String STRING715 , java.io.Reader READER606 , long LONG353) {
return  ;
}
public void setNClob(int INT32 , java.io.Reader READER202 , long LONG390) {
return  ;
}
public void setNClob(java.lang.String STRING257 , java.io.Reader READER980) {
return  ;
}
public void setNClob(java.lang.String STRING156 , java.sql.NClob NCLOB113) {
return  ;
}
public boolean previous() {
return false;
}
public void updateBytes(int INT367 , byte[] BYTE990) {
return  ;
}
public void updateBytes(java.lang.String STRING221 , byte[] BYTE765) {
return  ;
}
public java.lang.Object getObject(int INT585 , java.util.Map MAP74) {
return null;
}
public java.lang.Object getObject(java.lang.String STRING700) {
return null;
}
public java.lang.Object getObject(java.lang.String STRING257 , java.lang.Class CLASS16) {
return null;
}
public java.lang.Object getObject(int INT646 , java.lang.Class CLASS114) {
return null;
}
public java.lang.Object getObject(java.lang.String STRING777 , java.util.Map MAP915) {
return null;
}
public java.lang.Object getObject(int INT820) {
return null;
}
public boolean getBoolean(java.lang.String STRING527) {
return false;
}
public boolean getBoolean(int INT568) {
return false;
}
public byte getByte(int INT149) {
return 0;
}
public byte getByte(java.lang.String STRING360) {
return 0;
}
public short getShort(java.lang.String STRING30) {
return 0;
}
public short getShort(int INT14) {
return 0;
}
public int getInt(int INT892) {
return 0;
}
public int getInt(java.lang.String STRING580) {
return 0;
}
public long getLong(int INT917) {
return 0;
}
public long getLong(java.lang.String STRING177) {
return 0;
}
public float getFloat(java.lang.String STRING447) {
return 0;
}
public float getFloat(int INT465) {
return 0;
}
public double getDouble(int INT93) {
return 0;
}
public double getDouble(java.lang.String STRING455) {
return 0;
}
public byte[] getBytes(int INT648) {
return null;
}
public byte[] getBytes(java.lang.String STRING120) {
return null;
}
public boolean last() {
return false;
}
public boolean next() {
return false;
}
public boolean first() {
return false;
}
public void close() {
return  ;
}
public int getType() {
return 0;
}
public java.sql.Ref getRef(int INT873) {
return null;
}
public java.sql.Ref getRef(java.lang.String STRING922) {
return null;
}
public boolean absolute(int INT885) {
return false;
}
public java.sql.Array getArray(java.lang.String STRING748) {
return null;
}
public java.sql.Array getArray(int INT238) {
return null;
}
public java.sql.Timestamp getTimestamp(int INT546 , java.util.Calendar CALENDAR57) {
return null;
}
public java.sql.Timestamp getTimestamp(int INT659) {
return null;
}
public java.sql.Timestamp getTimestamp(java.lang.String STRING555) {
return null;
}
public java.sql.Timestamp getTimestamp(java.lang.String STRING705 , java.util.Calendar CALENDAR985) {
return null;
}
public java.lang.String getString(int INT985) {
return null;
}
public java.lang.String getString(java.lang.String STRING91) {
return null;
}
public java.sql.Date getDate(int INT205) {
return null;
}
public java.sql.Date getDate(java.lang.String STRING124) {
return null;
}
public java.sql.Date getDate(int INT383 , java.util.Calendar CALENDAR791) {
return null;
}
public java.sql.Date getDate(java.lang.String STRING363 , java.util.Calendar CALENDAR425) {
return null;
}
public boolean isClosed() {
return false;
}
public java.sql.Time getTime(int INT739) {
return null;
}
public java.sql.Time getTime(java.lang.String STRING464) {
return null;
}
public java.sql.Time getTime(int INT957 , java.util.Calendar CALENDAR203) {
return null;
}
public java.sql.Time getTime(java.lang.String STRING467 , java.util.Calendar CALENDAR860) {
return null;
}
public java.net.URL getURL(java.lang.String STRING280) {
return null;
}
public java.net.URL getURL(int INT437) {
return null;
}
public void updateCharacterStream(int INT849 , java.io.Reader READER619 , int INT871) {
return  ;
}
public void updateCharacterStream(int INT216 , java.io.Reader READER572) {
return  ;
}
public void updateCharacterStream(java.lang.String STRING210 , java.io.Reader READER66) {
return  ;
}
public void updateCharacterStream(java.lang.String STRING743 , java.io.Reader READER26 , int INT36) {
return  ;
}
public void updateCharacterStream(int INT446 , java.io.Reader READER875 , long LONG611) {
return  ;
}
public void updateCharacterStream(java.lang.String STRING412 , java.io.Reader READER137 , long LONG202) {
return  ;
}
public java.io.Reader getNCharacterStream(java.lang.String STRING406) {
return null;
}
public java.io.Reader getNCharacterStream(int INT634) {
return null;
}
public void updateNCharacterStream(java.lang.String STRING687 , java.io.Reader READER293 , long LONG822) {
return  ;
}
public void updateNCharacterStream(java.lang.String STRING100 , java.io.Reader READER523) {
return  ;
}
public void updateNCharacterStream(int INT816 , java.io.Reader READER440) {
return  ;
}
public void updateNCharacterStream(int INT589 , java.io.Reader READER232 , long LONG797) {
return  ;
}
public boolean wasNull() {
return false;
}
public java.math.BigDecimal getBigDecimal(int INT309) {
return null;
}
public java.math.BigDecimal getBigDecimal(java.lang.String STRING986 , int INT511) {
return null;
}
public java.math.BigDecimal getBigDecimal(int INT447 , int INT855) {
return null;
}
public java.math.BigDecimal getBigDecimal(java.lang.String STRING513) {
return null;
}
public java.io.InputStream getAsciiStream(int INT875) {
return null;
}
public java.io.InputStream getAsciiStream(java.lang.String STRING329) {
return null;
}
public java.io.InputStream getUnicodeStream(int INT609) {
return null;
}
public java.io.InputStream getUnicodeStream(java.lang.String STRING432) {
return null;
}
public java.io.InputStream getBinaryStream(int INT785) {
return null;
}
public java.io.InputStream getBinaryStream(java.lang.String STRING935) {
return null;
}
public java.sql.SQLWarning getWarnings() {
return null;
}
public void clearWarnings() {
return  ;
}
public java.lang.String getCursorName() {
return null;
}
public java.sql.ResultSetMetaData getMetaData() {
return null;
}
public int findColumn(java.lang.String STRING232) {
return 0;
}
public java.io.Reader getCharacterStream(java.lang.String STRING352) {
return null;
}
public java.io.Reader getCharacterStream(int INT331) {
return null;
}
public boolean isBeforeFirst() {
return false;
}
public boolean isAfterLast() {
return false;
}
public boolean isFirst() {
return false;
}
public boolean isLast() {
return false;
}
public void beforeFirst() {
return  ;
}
public void afterLast() {
return  ;
}
public int getRow() {
return 0;
}
public boolean relative(int INT643) {
return false;
}
public void setFetchDirection(int INT667) {
return  ;
}
public int getFetchDirection() {
return 0;
}
public void setFetchSize(int INT891) {
return  ;
}
public int getFetchSize() {
return 0;
}
public int getConcurrency() {
return 0;
}
public boolean rowUpdated() {
return false;
}
public boolean rowInserted() {
return false;
}
public boolean rowDeleted() {
return false;
}
public void updateNull(java.lang.String STRING725) {
return  ;
}
public void updateNull(int INT257) {
return  ;
}
public void updateBoolean(int INT174 , boolean BOOLEAN496) {
return  ;
}
public void updateBoolean(java.lang.String STRING229 , boolean BOOLEAN471) {
return  ;
}
public void updateByte(int INT789 , byte BYTE424) {
return  ;
}
public void updateByte(java.lang.String STRING165 , byte BYTE488) {
return  ;
}
public void updateShort(java.lang.String STRING468 , short SHORT423) {
return  ;
}
public void updateShort(int INT684 , short SHORT165) {
return  ;
}
public void updateInt(java.lang.String STRING625 , int INT309) {
return  ;
}
public void updateInt(int INT353 , int INT308) {
return  ;
}
public void updateLong(int INT959 , long LONG477) {
return  ;
}
public void updateLong(java.lang.String STRING650 , long LONG518) {
return  ;
}
public void updateFloat(int INT814 , float FLOAT270) {
return  ;
}
public void updateFloat(java.lang.String STRING626 , float FLOAT983) {
return  ;
}
public void updateDouble(java.lang.String STRING475 , double DOUBLE136) {
return  ;
}
public void updateDouble(int INT246 , double DOUBLE757) {
return  ;
}
public void updateBigDecimal(int INT458 , java.math.BigDecimal BIGDECIMAL204) {
return  ;
}
public void updateBigDecimal(java.lang.String STRING549 , java.math.BigDecimal BIGDECIMAL551) {
return  ;
}
public void updateString(int INT337 , java.lang.String STRING966) {
return  ;
}
public void updateString(java.lang.String STRING984 , java.lang.String STRING987) {
return  ;
}
public void updateDate(int INT476 , java.sql.Date DATE592) {
return  ;
}
public void updateDate(java.lang.String STRING0 , java.sql.Date DATE335) {
return  ;
}
public void updateTime(java.lang.String STRING715 , java.sql.Time TIME988) {
return  ;
}
public void updateTime(int INT914 , java.sql.Time TIME67) {
return  ;
}
public void updateTimestamp(int INT468 , java.sql.Timestamp TIMESTAMP544) {
return  ;
}
public void updateTimestamp(java.lang.String STRING951 , java.sql.Timestamp TIMESTAMP968) {
return  ;
}
public void updateAsciiStream(java.lang.String STRING128 , java.io.InputStream INPUTSTREAM710) {
return  ;
}
public void updateAsciiStream(int INT662 , java.io.InputStream INPUTSTREAM407 , long LONG936) {
return  ;
}
public void updateAsciiStream(java.lang.String STRING384 , java.io.InputStream INPUTSTREAM100 , int INT371) {
return  ;
}
public void updateAsciiStream(java.lang.String STRING145 , java.io.InputStream INPUTSTREAM638 , long LONG422) {
return  ;
}
public void updateAsciiStream(int INT804 , java.io.InputStream INPUTSTREAM892) {
return  ;
}
public void updateAsciiStream(int INT821 , java.io.InputStream INPUTSTREAM387 , int INT954) {
return  ;
}
public void updateBinaryStream(java.lang.String STRING141 , java.io.InputStream INPUTSTREAM742 , int INT647) {
return  ;
}
public void updateBinaryStream(int INT419 , java.io.InputStream INPUTSTREAM443 , int INT57) {
return  ;
}
public void updateBinaryStream(java.lang.String STRING752 , java.io.InputStream INPUTSTREAM37 , long LONG456) {
return  ;
}
public void updateBinaryStream(int INT357 , java.io.InputStream INPUTSTREAM167) {
return  ;
}
public void updateBinaryStream(java.lang.String STRING661 , java.io.InputStream INPUTSTREAM515) {
return  ;
}
public void updateBinaryStream(int INT886 , java.io.InputStream INPUTSTREAM436 , long LONG729) {
return  ;
}
public void updateObject(java.lang.String STRING51 , java.lang.Object OBJECT185 , int INT526) {
return  ;
}
public void updateObject(int INT435 , java.lang.Object OBJECT488) {
return  ;
}
public void updateObject(int INT687 , java.lang.Object OBJECT854 , int INT906) {
return  ;
}
public void updateObject(java.lang.String STRING327 , java.lang.Object OBJECT839) {
return  ;
}
public void insertRow() {
return  ;
}
public void updateRow() {
return  ;
}
public void deleteRow() {
return  ;
}
public void refreshRow() {
return  ;
}
public void cancelRowUpdates() {
return  ;
}
public void moveToInsertRow() {
return  ;
}
public void moveToCurrentRow() {
return  ;
}
public java.sql.Statement getStatement() {
return null;
}
public java.sql.Blob getBlob(java.lang.String STRING665) {
return null;
}
public java.sql.Blob getBlob(int INT103) {
return null;
}
public java.sql.Clob getClob(int INT682) {
return null;
}
public java.sql.Clob getClob(java.lang.String STRING835) {
return null;
}
public void updateRef(java.lang.String STRING443 , java.sql.Ref REF854) {
return  ;
}
public void updateRef(int INT929 , java.sql.Ref REF250) {
return  ;
}
public void updateBlob(int INT35 , java.sql.Blob BLOB521) {
return  ;
}
public void updateBlob(int INT341 , java.io.InputStream INPUTSTREAM344 , long LONG321) {
return  ;
}
public void updateBlob(int INT864 , java.io.InputStream INPUTSTREAM330) {
return  ;
}
public void updateBlob(java.lang.String STRING951 , java.io.InputStream INPUTSTREAM38) {
return  ;
}
public void updateBlob(java.lang.String STRING361 , java.io.InputStream INPUTSTREAM386 , long LONG122) {
return  ;
}
public void updateBlob(java.lang.String STRING225 , java.sql.Blob BLOB988) {
return  ;
}
public void updateClob(int INT389 , java.sql.Clob CLOB159) {
return  ;
}
public void updateClob(java.lang.String STRING961 , java.io.Reader READER297) {
return  ;
}
public void updateClob(int INT536 , java.io.Reader READER814 , long LONG546) {
return  ;
}
public void updateClob(java.lang.String STRING540 , java.io.Reader READER566 , long LONG682) {
return  ;
}
public void updateClob(java.lang.String STRING501 , java.sql.Clob CLOB436) {
return  ;
}
public void updateClob(int INT773 , java.io.Reader READER797) {
return  ;
}
public void updateArray(int INT645 , java.sql.Array ARRAY468) {
return  ;
}
public void updateArray(java.lang.String STRING891 , java.sql.Array ARRAY834) {
return  ;
}
public java.sql.RowId getRowId(java.lang.String STRING582) {
return null;
}
public java.sql.RowId getRowId(int INT465) {
return null;
}
public void updateRowId(int INT63 , java.sql.RowId ROWID929) {
return  ;
}
public void updateRowId(java.lang.String STRING472 , java.sql.RowId ROWID905) {
return  ;
}
public int getHoldability() {
return 0;
}
public void updateNString(java.lang.String STRING459 , java.lang.String STRING462) {
return  ;
}
public void updateNString(int INT278 , java.lang.String STRING507) {
return  ;
}
public void updateNClob(java.lang.String STRING714 , java.io.Reader READER569) {
return  ;
}
public void updateNClob(int INT595 , java.io.Reader READER444) {
return  ;
}
public void updateNClob(java.lang.String STRING251 , java.io.Reader READER196 , long LONG356) {
return  ;
}
public void updateNClob(int INT100 , java.io.Reader READER353 , long LONG87) {
return  ;
}
public void updateNClob(int INT122 , java.sql.NClob NCLOB34) {
return  ;
}
public void updateNClob(java.lang.String STRING404 , java.sql.NClob NCLOB968) {
return  ;
}
public java.sql.NClob getNClob(java.lang.String STRING588) {
return null;
}
public java.sql.NClob getNClob(int INT570) {
return null;
}
public java.sql.SQLXML getSQLXML(int INT982) {
return null;
}
public java.sql.SQLXML getSQLXML(java.lang.String STRING492) {
return null;
}
public void updateSQLXML(java.lang.String STRING28 , java.sql.SQLXML SQLXML511) {
return  ;
}
public void updateSQLXML(int INT554 , java.sql.SQLXML SQLXML776) {
return  ;
}
public java.lang.String getNString(int INT136) {
return null;
}
public java.lang.String getNString(java.lang.String STRING438) {
return null;
}
public java.lang.Object unwrap(java.lang.Class CLASS631) {
return null;
}
public boolean isWrapperFor(java.lang.Class CLASS425) {
return false;
}
public void setMatchColumn(java.lang.String[] STRING822) {
return  ;
}
public void setMatchColumn(java.lang.String STRING435) {
return  ;
}
public void setMatchColumn(int[] INT758) {
return  ;
}
public void setMatchColumn(int INT505) {
return  ;
}
public void unsetMatchColumn(int[] INT957) {
return  ;
}
public void unsetMatchColumn(int INT754) {
return  ;
}
public void unsetMatchColumn(java.lang.String STRING692) {
return  ;
}
public void unsetMatchColumn(java.lang.String[] STRING164) {
return  ;
}
public int[] getMatchColumnIndexes() {
return null;
}
public java.lang.String[] getMatchColumnNames() {
return null;
}
}

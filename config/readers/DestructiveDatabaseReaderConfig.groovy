package readers
import gov.va.vinci.mapper.readers.DestructiveBatchDatabaseCollectionReader


db_engine = "db_engine"
db_name = "db_name"
String url = "jdbc:sqlserver://"+db_engine+":1433;databasename="+db_name+";integratedSecurity=true"
String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"

String query = ''' SELECT DISTINCT DocumentID, [ChiefComplaintText]  FROM <Database_Table>  where RowNo BETWEEN {min} and {max} '''

row_index = [0,10000]
int batchSize  = 10000;

documentID_columnName="DocumentID"
noteText_columnName = "ChiefComplaintText"


String processRulesPath = "preprocessing_resources/"

reader = DestructiveBatchDatabaseCollectionReader.newReader(
        driver,
        url,
        "", "",
        query,
        documentID_columnName.toLowerCase(),
        noteText_columnName.toLowerCase(),
        row_index[0], row_index[1]
        , batchSize, processRulesPath)


import gov.va.vinci.mapper.listeners.BasicDatabaseListener

db_engine = "db_engine"
db_name = "db_name"

batchSize = 2000
boolean dropExisting = false
boolean createTable = true;

int batchSize = 2000
String url = "jdbc:sqlserver://"+db_engine+":1433;databasename="+db_name+";integratedSecurity=true"
String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
String dbUser = ""
String dbPwd = ""
table_name = "db_schema.output_table_name";

fieldList = [
		["DocID","-1","bigint"],
		["Type","-1","tinyint"],
		["Snippets","-1","varchar(500)"],
		["SpanStart","-1","int"],
		["SpanEnd","-1","int"],
		["CUI","-1","varchar(10)"],
		["polarity","-1","int"],
		["uncertainty","-1","int"],
		["conditional","-1","int"],
		["generic","-1","int"],
		["subject","-1","int"],
		["historyOf","-1","int"],
		["SectionHeaderText", "-1", "varchar(50)"]
	]
listener = BasicDatabaseListener.createNewListener(
		driver,
		url,
		dbUser,
		dbPwd,
		db_name,
		table_name,
		batchSize,
		fieldList,
		org.apache.ctakes.typesystem.type.textsem.DiseaseDisorderMention.canonicalName,
		org.apache.ctakes.typesystem.type.textsem.ProcedureMention.canonicalName,
		org.apache.ctakes.typesystem.type.textsem.AnatomicalSiteMention.canonicalName,
		org.apache.ctakes.typesystem.type.textsem.SignSymptomMention.canonicalName,
		org.apache.ctakes.typesystem.type.textsem.MedicationMention.canonicalName

)
if(createTable)
	listener.createTable(dropExisting);

println(listener.preparedStatementSQL)
 

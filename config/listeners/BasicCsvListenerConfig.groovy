import gov.va.vinci.leo.tools.LeoUtils
import gov.va.vinci.mapper.listeners.CsvListener
import org.apache.ctakes.typesystem.type.textsem.*;

String csvDir = "src/test/output/output_.csv"

if (!(new File(csvDir)).exists()) (new File(csvDir).getParentFile()).mkdirs()
fieldList = [
		["DocID","0","bigint"],
		["Type","-1","varchar(100)"],
		["Snippets","-1","varchar(500)"],
		["SpanStart","-1","int"],
		["SpanEnd","-1","int"],
		["CUI","-1","varchar(10)"],
		//["confidence","-1","varchar(5)"],
		["polarity","-1","varchar(10)"],
		["uncertainty","-1","varchar(10)"],
		["conditional","-1","varchar(10)"],
		["generic","-1","varchar(10)"],
		["subject","-1","varchar(20)"],
		["historyOf","-1","varchar(10)"]
]

listener = new CsvListener(new File(csvDir),  fieldList, DiseaseDisorderMention.class.getCanonicalName(),
		MedicationMention.class.getCanonicalName(),
		ProcedureMention.class.getCanonicalName(),
		SignSymptomMention.class.getCanonicalName());

listener.writeHeaders();


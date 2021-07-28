
import gov.va.vinci.leo.listener.SimpleCsvListener

String csvDir ="src/test/resources/output/output.csv"
if (!(new File(csvDir)).exists()) (new File(csvDir).getParentFile()).mkdirs()

listener = new SimpleCsvListener(new File(csvDir))
listener.setInputType( org.apache.ctakes.typesystem.type.textsem.DiseaseDisorderMention.canonicalName,
        org.apache.ctakes.typesystem.type.textsem.ProcedureMention.canonicalName,
        org.apache.ctakes.typesystem.type.textsem.AnatomicalSiteMention.canonicalName,
        org.apache.ctakes.typesystem.type.textsem.SignSymptomMention.canonicalName,
        org.apache.ctakes.typesystem.type.textsem.MedicationMention.canonicalName
);
listener.setIncludeFeatures(true);
listener.writeHeaders()

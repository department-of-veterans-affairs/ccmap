
import gov.va.vinci.leo.listener.SimpleXmiListener


String xmiDir ="src/test/output/xmi/"
if(!(new File(xmiDir)).exists()) (new File(xmiDir)).mkdirs()
println(xmiDir)
listener = new SimpleXmiListener(new File(xmiDir))
listener.setLaunchAnnotationViewer(true)

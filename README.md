## CCMap - Chief Compaints mapper to UMLS


to configure cTAKES:

1. download the ctakes resources
https://sourceforge.net/projects/ctakesresources/files/latest/download
   or
   Create new UMLS extract 

2. Update lvg.properties file with the path to LVG data

3. Update the sno_rx_16ab.xml with the path to the UMLS data

4. Add UMLS credentials in sno_rx_16ab.xml

5. Update umls_dictionary_settings.xml to point to the correct jdbcUrl

CCMap is based on Leo architecture. Follow the instructions
http://department-of-veterans-affairs.github.io/Leo/userguide.html 
to configure UIMA AS

1. Download and configure UIMA AS 2.9 
2. Start UIMA AS broker
3. Configure a reader. At this time, only the database reader is configured to use the abbreviation expansion.
4. Configure a listener.
5. Run Service.java
6. Run Client.java pointing to the configured reader and listener.





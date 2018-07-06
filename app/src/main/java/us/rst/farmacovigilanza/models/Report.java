package us.rst.farmacovigilanza.models;

import java.sql.Date;

/**
 * Represents a report
 */
public interface Report {
    /**
     * Gets the id of this report
     * @return report id
     */
    int getId();

    /**
     * Sets the id for this report
     * @param id id
     */
    void setId(int id);

    /**
     * Gets the description of this report
     * @return report description
     */
    String getDescription();

    /**
     * Sets the report for this description
     * @param description description
     */
    void setDescription(String description);

    /**
     * Gets the date when the reaction happened
     * @return the date when the reaction happened
     */
    Date getReactionDate();

    /**
     * Sets the date when the reaction happened
     * @param date date
     */
    void setReactionDate(Date date);
  
    /**
     * Gets the date when the report has been recorded
     * @return date when the report has been recorded
     */
    Date getReportDate();

    /**
     * Sets the date when the report has been recorded
     * @param date date
     */
    void setReportDate(Date date);

    /**
     * Gets the fiscal code of the patient
     * @return patient fiscal code
     */
    FiscalCode getPatientFiscalCode();

    /**
     * Sets the fiscal code of the patient
     * @param fiscalCode fiscal code
     */
    void setPatientFiscalCode(FiscalCode fiscalCode);

    /**
     * Gets the name of the avverse reaction
     * @return avverse reaciton
     */
    String getAvverseReactionName();

    /**
     * Sets the name of the avverse reaction
     * @param avverseReactionName avverse reaction name
     */
    void setAvverseReactionName(String avverseReactionName);

    int getTherapyId();
    void setTherapyId(int id);
}

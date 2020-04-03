package business.model;

/**
 *
 * @author luyza
 */
public class ReportTemplateHTML  extends ReportTemplate{
    
    public ReportTemplateHTML(String file){
        super(file);
    }
    
    @Override
    protected String reportFormat(String report){
        return "O arquivo html é  " + report;
    }
    
}
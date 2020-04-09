package business.control;

import business.control.ReportTemplate;

/**
 *
 * @author luyza
 */
public class ReportTemplatePDF  extends ReportTemplate{
    
    public ReportTemplatePDF(String file){
        super(file);
    }
    @Override
    protected String reportFormat(String report){
        return "O arquivo pdf é  " + report;
    }
    
}

package util;

/**
 * Exceção lançada por business.model.ReportTemplate por falhas de construção de relatório.
 * @author luyza
 */
public class ReportTemplateException extends Exception {
    
    public ReportTemplateException(String message){
        super(message);
    }
    
    public ReportTemplateException(){
        this("Falha na construção do relatório");
    }
    
}

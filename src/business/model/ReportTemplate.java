package business.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import util.ReportTemplateException;

/**
 *Padrão de Projeto "Template Method" para a implementação do template para os relatórios.
 * 
 * @author luyza
 */
public abstract class ReportTemplate {
    
    private FileWriter fw;
    private BufferedWriter bw;
    private String file;

    public ReportTemplate(String file){
        this.file = file;
    }
    
    
    /**
     * Formata o arquivo confome o tipo de relatório
     * @param report
     * @return 
     */
    protected abstract String reportFormat(String report);
    
    public final void  ReportTemplateMethod(String report) throws ReportTemplateException{
        
        try{
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(reportFormat(report));
            bw.close();
        }catch(IOException ex){   
            throw new ReportTemplateException();
        }
       
    }
    
    
}

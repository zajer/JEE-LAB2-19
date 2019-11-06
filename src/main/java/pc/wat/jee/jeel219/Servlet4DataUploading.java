/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.wat.jee.jeel219;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pc.wat.jee.jeel219.model.CompanyEntity;
import pc.wat.jee.jeel219.model.WorkerEntity;

//ścieżka do servletu określona w web.xml
public class Servlet4DataUploading extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-16");
        resp.getWriter().write("działam!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("postuje");
        
        WorkerEntity worker = buildWorkerEntityFromRequestParameters(req.getParameterMap());
        
    }
    
    private WorkerEntity buildWorkerEntityFromRequestParameters(Map<String,String[]> parameters){
        WorkerEntity.WorkerEntityBuilder builder = WorkerEntity.builder();
        
        for(Entry<String, String[]> tmp :parameters.entrySet()){
            boolean valueOfName =false;
            boolean valueOfCompanyName =false;
            
            String key = tmp.getKey();
            System.out.println("Dla klucza:"+key);
            
            if(key.equalsIgnoreCase("name"))
                {
                    valueOfName = true;
                    builder.name(key);
                }
            else if(key.equalsIgnoreCase("companyName"))
                {
                    valueOfCompanyName = true;
                    builder.name(key);
                }
            System.out.println("Wartosci:");
            for(String value: tmp.getValue())
                {
                    System.out.println(value); 
                    if(valueOfCompanyName)
                        builder.company(new CompanyEntity(value,null,-1));
                }
            
        }
        return builder.build();
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.wat.jee.jeel219;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pc.wat.jee.jeel219.model.WorkerEntity;


@WebServlet("/SFS")
public class ServletFromScratch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        
        resp.getWriter().write("yolo");
        
    }
    
    
    private List<WorkerEntity> prepExampleData(){
        List<WorkerEntity> result = new ArrayList<>();
        
        result.add(new WorkerEntity("Jan Kowalski", "WAT"));
        
        return result;
    }
    
    
    
    
    
    
}

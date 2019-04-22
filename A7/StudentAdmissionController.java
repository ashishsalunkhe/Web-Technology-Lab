package varun;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudentAdmissionController 
{
    @RequestMapping(value="/admissionForm", method=RequestMethod.GET)
    protected ModelAndView myMethod1()
    {        
        ModelAndView mv=new ModelAndView("AdmissionForm");        
        return mv;
    }    

@RequestMapping(value="/submitAdmissionForm", method=RequestMethod.POST)
protected ModelAndView myMethod2(
		@RequestParam("studentname") String name, 
		@RequestParam("password") String password,
		@RequestParam("mobile") String mobile,
		@RequestParam("email") String email,
		@RequestParam("age") String age)
    {
        ModelAndView mv=new ModelAndView("AdmissionSuccess");
        mv.addObject("WelcomeMessage","Details are : <br>Name :"+name+"<br>Password:  "+password+"<br>Mobile No : "
        		+mobile + "<br>E-Mail : "+email+"<br>Age : "+age);
        return mv;
    }    
}
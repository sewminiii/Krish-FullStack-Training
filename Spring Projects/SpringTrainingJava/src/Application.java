import com.sewmini.training.salesmanager.config.ApplicationConfiguration;
import com.sewmini.training.salesmanager.model.Employee;
import com.sewmini.training.salesmanager.service.EmployeeService;
import com.sewmini.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        EmployeeService employeeservice = applicationContext.getBean(
                "employeeService", EmployeeService.class);

        List<Employee> employees = employeeservice.getAllEmployees();

        for(Employee employee: employees){
            System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
        }
    }
}

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.comp.myapp.dao.EmployeeDAO;
import com.comp.myapp.model.EmployeeVO;
 
@Service
public class EmployeeManagerImpl implements EmployeeManager {
 
    @Autowired
    EmployeeDAO dao;
     
    public List<EmployeeVO> getAllEmployees() 
    {
        return dao.getAllEmployees();
    }
}
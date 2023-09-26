import com.atguigu.imperial.court.dao.BaseDao;
import com.atguigu.imperial.court.entity.Emp;
import com.atguigu.imperial.court.util.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class ImperialCourtTest {

    private BaseDao<Emp> baseDao = new BaseDao<>();
    @Test
    public void testGetSingleBean(){
        String sql = "select emp_id empId,emp_name empName,emp_position empPosition,login_account loginAccount,login_password loginPassword from t_emp where emp_id=?";
        Emp emp = baseDao.getSingleBean(sql, Emp.class,1);
        System.out.println("emp=" + emp);
    }
    @Test
    public void testGetConnection(){
        Connection connection = JDBCUtils.getConnection();
        System.out.println("conn = " + connection);
        JDBCUtils.releaseConnection(connection);
    }
}

package com.atguigu.imperial.court.dao.impl;

import com.atguigu.imperial.court.dao.BaseDao;
import com.atguigu.imperial.court.dao.api.EmpDao;
import com.atguigu.imperial.court.entity.Emp;

public class EmpDaoImpl extends BaseDao<Emp> implements EmpDao {

    @Override
    public Emp selectEmpByLoginAccount(String loginAccount, String encodeLoginPassword) {
        String sql = "select emp_id empId,emp_name empName,emp_position empPosition,login_account loginAccount,login_password loginPassword from t_emp where login_account=? and login_password=?";
        return super.getSingleBean(sql,Emp.class,loginAccount,encodeLoginPassword);

    }
}

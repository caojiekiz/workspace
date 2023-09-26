package com.atguigu.imperial.court.service.impl;

import com.atguigu.imperial.court.dao.api.EmpDao;
import com.atguigu.imperial.court.dao.impl.EmpDaoImpl;
import com.atguigu.imperial.court.entity.Emp;
import com.atguigu.imperial.court.exception.LoginFailedException;
import com.atguigu.imperial.court.service.api.EmpService;
import com.atguigu.imperial.court.util.ImperialCourtConst;
import com.atguigu.imperial.court.util.MD5Util;

public class EmpServiceImpl implements EmpService {
    private EmpDao empDao = new EmpDaoImpl();

    @Override
    public Emp getEmpByLoginAccount(String loginAccount, String loginPassword) {
        String encodeLoginPassword = MD5Util.encode(loginPassword);
        Emp emp = empDao.selectEmpByLoginAccount(loginAccount,encodeLoginPassword);
        if(emp != null){
            return emp;
        } else{
            throw new LoginFailedException(ImperialCourtConst.LOGIN_FAILED_MESSAGE);
        }
    }
}

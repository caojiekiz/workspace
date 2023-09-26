package com.atguigu.imperial.court.service.api;

import com.atguigu.imperial.court.entity.Emp;
import com.atguigu.imperial.court.exception.LoginFailedException;

public interface EmpService {
    Emp getEmpByLoginAccount(String loginAccount,String loginPassword) throws LoginFailedException;
}

package com.kiz.mhl.service;

import com.kiz.mhl.dao.MenuDAO;
import com.kiz.mhl.domain.Menu;

import java.util.List;

public class MenuService {
    private MenuDAO menuDAO = new MenuDAO();
    public List<Menu> list() {
        return menuDAO.queryMulti("select * from menu", Menu.class);
    }
    public Menu getMenuById(int id) {
        return menuDAO.querySingle("select * from menu where id=?",Menu.class,id);
    }
}

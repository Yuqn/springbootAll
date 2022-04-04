package com.yuqn.service.impl;

import com.yuqn.dao.FigureDao;
import com.yuqn.entity.Figure;
import com.yuqn.service.FigureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FigureServiceImpl implements FigureService {

    @Resource
    private FigureDao figureDao;

    @Override
    public Figure figSel(Integer id) {
        return figureDao.figForId(id);
    }
}

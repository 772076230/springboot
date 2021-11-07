package cn.goktech.service.imp;


import cn.goktech.beans.IndexImg;
import cn.goktech.dao.IndexImgMapper;
import cn.goktech.service.IndexImgService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class IndexImgServiceImpl implements  IndexImgService{

    @Autowired
    IndexImgMapper indexImgMapper;


    @Override
    public List<IndexImg> queryAvders() throws Exception {
        return indexImgMapper.selectAll();
    }
}



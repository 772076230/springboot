package cn.goktech.dao;


import cn.goktech.beans.IndexImg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexImgMapper  {

    /**
     * 新增
     * @param record
     * @return
     */
    int insert(IndexImg record);

    /**
     * 查询所有
     * @return
     */
    List<IndexImg> selectAll();
}
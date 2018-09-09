package com.goddice.dal.dao;

import com.goddice.model.BcDhandball;
import com.goddice.model.BcDhandballExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcDhandballMapper {
    int countByExample(BcDhandballExample example);

    int deleteByExample(BcDhandballExample example);

    int insert(BcDhandball record);

    int insertSelective(BcDhandball record);

    List<BcDhandball> selectByExample(BcDhandballExample example);

    int updateByExampleSelective(@Param("record") BcDhandball record, @Param("example") BcDhandballExample example);

    int updateByExample(@Param("record") BcDhandball record, @Param("example") BcDhandballExample example);
    List<BcDhandball> queryListPage(@Param("begin") int begin, @Param("size")  int size);
}
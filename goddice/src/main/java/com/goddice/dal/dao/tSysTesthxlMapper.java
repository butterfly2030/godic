package com.goddice.dal.dao;

import com.goddice.model.tSysTesthxl;
import com.goddice.model.tSysTesthxlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tSysTesthxlMapper {
    int countByExample(tSysTesthxlExample example);

    int deleteByExample(tSysTesthxlExample example);

    int insert(tSysTesthxl record);

    int insertSelective(tSysTesthxl record);

    List<tSysTesthxl> selectByExample(tSysTesthxlExample example);

    int updateByExampleSelective(@Param("record") tSysTesthxl record, @Param("example") tSysTesthxlExample example);

    int updateByExample(@Param("record") tSysTesthxl record, @Param("example") tSysTesthxlExample example);
}
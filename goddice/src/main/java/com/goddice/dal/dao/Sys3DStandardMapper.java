package com.goddice.dal.dao;

import com.goddice.model.Sys3DStandard;
import com.goddice.model.Sys3DStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys3DStandardMapper {
    int countByExample(Sys3DStandardExample example);

    int deleteByExample(Sys3DStandardExample example);

    int insert(Sys3DStandard record);

    int insertSelective(Sys3DStandard record);

    List<Sys3DStandard> selectByExample(Sys3DStandardExample example);

    int updateByExampleSelective(@Param("record") Sys3DStandard record, @Param("example") Sys3DStandardExample example);

    int updateByExample(@Param("record") Sys3DStandard record, @Param("example") Sys3DStandardExample example);
}
package org.tshc.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.tshc.ware.entity.WareInfoEntity;

/**
 * 仓库信息
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:47:24
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {

}

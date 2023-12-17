package org.tshc.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.tshc.ware.entity.PurchaseEntity;

/**
 * 采购信息
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:47:24
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {

}

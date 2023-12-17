package org.tshc.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.tshc.order.entity.OrderSettingEntity;

/**
 * 订单配置信息
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:18:53
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {

}

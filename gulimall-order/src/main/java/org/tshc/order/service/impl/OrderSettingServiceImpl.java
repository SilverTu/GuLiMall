package org.tshc.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.order.dao.OrderSettingDao;
import org.tshc.order.entity.OrderSettingEntity;
import org.tshc.order.service.OrderSettingService;


@Service("orderSettingService")
public class OrderSettingServiceImpl extends
    ServiceImpl<OrderSettingDao, OrderSettingEntity> implements OrderSettingService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OrderSettingEntity> page = this.page(
        new Query<OrderSettingEntity>().getPage(params),
        new QueryWrapper<OrderSettingEntity>()
    );

    return new PageUtils(page);
  }

}
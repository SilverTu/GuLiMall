package org.tshc.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.order.dao.OrderDao;
import org.tshc.order.entity.OrderEntity;
import org.tshc.order.service.OrderService;


@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderEntity> implements OrderService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OrderEntity> page = this.page(
        new Query<OrderEntity>().getPage(params),
        new QueryWrapper<OrderEntity>()
    );

    return new PageUtils(page);
  }

}
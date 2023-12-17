package org.tshc.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.order.dao.OrderItemDao;
import org.tshc.order.entity.OrderItemEntity;
import org.tshc.order.service.OrderItemService;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements
    OrderItemService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OrderItemEntity> page = this.page(
        new Query<OrderItemEntity>().getPage(params),
        new QueryWrapper<OrderItemEntity>()
    );

    return new PageUtils(page);
  }

}
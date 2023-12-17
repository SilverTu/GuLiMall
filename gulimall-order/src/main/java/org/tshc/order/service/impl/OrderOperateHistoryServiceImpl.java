package org.tshc.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.order.dao.OrderOperateHistoryDao;
import org.tshc.order.entity.OrderOperateHistoryEntity;
import org.tshc.order.service.OrderOperateHistoryService;


@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends
    ServiceImpl<OrderOperateHistoryDao, OrderOperateHistoryEntity> implements
    OrderOperateHistoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OrderOperateHistoryEntity> page = this.page(
        new Query<OrderOperateHistoryEntity>().getPage(params),
        new QueryWrapper<OrderOperateHistoryEntity>()
    );

    return new PageUtils(page);
  }

}
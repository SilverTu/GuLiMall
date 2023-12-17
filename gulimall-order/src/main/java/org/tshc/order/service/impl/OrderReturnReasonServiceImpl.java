package org.tshc.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.order.dao.OrderReturnReasonDao;
import org.tshc.order.entity.OrderReturnReasonEntity;
import org.tshc.order.service.OrderReturnReasonService;


@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends
    ServiceImpl<OrderReturnReasonDao, OrderReturnReasonEntity> implements OrderReturnReasonService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OrderReturnReasonEntity> page = this.page(
        new Query<OrderReturnReasonEntity>().getPage(params),
        new QueryWrapper<OrderReturnReasonEntity>()
    );

    return new PageUtils(page);
  }

}
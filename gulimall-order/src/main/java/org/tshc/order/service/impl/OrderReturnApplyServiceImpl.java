package org.tshc.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.order.dao.OrderReturnApplyDao;
import org.tshc.order.entity.OrderReturnApplyEntity;
import org.tshc.order.service.OrderReturnApplyService;


@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends
    ServiceImpl<OrderReturnApplyDao, OrderReturnApplyEntity> implements OrderReturnApplyService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OrderReturnApplyEntity> page = this.page(
        new Query<OrderReturnApplyEntity>().getPage(params),
        new QueryWrapper<OrderReturnApplyEntity>()
    );

    return new PageUtils(page);
  }

}
package org.tshc.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.order.dao.PaymentInfoDao;
import org.tshc.order.entity.PaymentInfoEntity;
import org.tshc.order.service.PaymentInfoService;


@Service("paymentInfoService")
public class PaymentInfoServiceImpl extends
    ServiceImpl<PaymentInfoDao, PaymentInfoEntity> implements PaymentInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<PaymentInfoEntity> page = this.page(
        new Query<PaymentInfoEntity>().getPage(params),
        new QueryWrapper<PaymentInfoEntity>()
    );

    return new PageUtils(page);
  }

}
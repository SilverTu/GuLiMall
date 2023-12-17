package org.tshc.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.order.dao.RefundInfoDao;
import org.tshc.order.entity.RefundInfoEntity;
import org.tshc.order.service.RefundInfoService;


@Service("refundInfoService")
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoDao, RefundInfoEntity> implements
    RefundInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<RefundInfoEntity> page = this.page(
        new Query<RefundInfoEntity>().getPage(params),
        new QueryWrapper<RefundInfoEntity>()
    );

    return new PageUtils(page);
  }

}
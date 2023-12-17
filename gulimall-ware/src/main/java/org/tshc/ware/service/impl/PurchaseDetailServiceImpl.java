package org.tshc.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.ware.dao.PurchaseDetailDao;
import org.tshc.ware.entity.PurchaseDetailEntity;
import org.tshc.ware.service.PurchaseDetailService;


@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl extends
    ServiceImpl<PurchaseDetailDao, PurchaseDetailEntity> implements PurchaseDetailService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<PurchaseDetailEntity> page = this.page(
        new Query<PurchaseDetailEntity>().getPage(params),
        new QueryWrapper<PurchaseDetailEntity>()
    );

    return new PageUtils(page);
  }

}
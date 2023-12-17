package org.tshc.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.ware.dao.PurchaseDao;
import org.tshc.ware.entity.PurchaseEntity;
import org.tshc.ware.service.PurchaseService;


@Service("purchaseService")
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, PurchaseEntity> implements
    PurchaseService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<PurchaseEntity> page = this.page(
        new Query<PurchaseEntity>().getPage(params),
        new QueryWrapper<PurchaseEntity>()
    );

    return new PageUtils(page);
  }

}
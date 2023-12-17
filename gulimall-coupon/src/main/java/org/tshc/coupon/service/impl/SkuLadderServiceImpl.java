package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.SkuLadderDao;
import org.tshc.coupon.entity.SkuLadderEntity;
import org.tshc.coupon.service.SkuLadderService;


@Service("skuLadderService")
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderDao, SkuLadderEntity> implements
    SkuLadderService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuLadderEntity> page = this.page(
        new Query<SkuLadderEntity>().getPage(params),
        new QueryWrapper<SkuLadderEntity>()
    );

    return new PageUtils(page);
  }

}
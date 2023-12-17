package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.SeckillSkuNoticeDao;
import org.tshc.coupon.entity.SeckillSkuNoticeEntity;
import org.tshc.coupon.service.SeckillSkuNoticeService;


@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends
    ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity> implements SeckillSkuNoticeService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SeckillSkuNoticeEntity> page = this.page(
        new Query<SeckillSkuNoticeEntity>().getPage(params),
        new QueryWrapper<SeckillSkuNoticeEntity>()
    );

    return new PageUtils(page);
  }

}
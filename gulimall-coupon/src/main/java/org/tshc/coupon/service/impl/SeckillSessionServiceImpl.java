package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.SeckillSessionDao;
import org.tshc.coupon.entity.SeckillSessionEntity;
import org.tshc.coupon.service.SeckillSessionService;


@Service("seckillSessionService")
public class SeckillSessionServiceImpl extends
    ServiceImpl<SeckillSessionDao, SeckillSessionEntity> implements SeckillSessionService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SeckillSessionEntity> page = this.page(
        new Query<SeckillSessionEntity>().getPage(params),
        new QueryWrapper<SeckillSessionEntity>()
    );

    return new PageUtils(page);
  }

}
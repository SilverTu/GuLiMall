package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.HomeAdvDao;
import org.tshc.coupon.entity.HomeAdvEntity;
import org.tshc.coupon.service.HomeAdvService;


@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdvEntity> implements
    HomeAdvService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<HomeAdvEntity> page = this.page(
        new Query<HomeAdvEntity>().getPage(params),
        new QueryWrapper<HomeAdvEntity>()
    );

    return new PageUtils(page);
  }

}
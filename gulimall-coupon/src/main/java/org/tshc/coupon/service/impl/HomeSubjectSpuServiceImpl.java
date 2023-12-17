package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.HomeSubjectSpuDao;
import org.tshc.coupon.entity.HomeSubjectSpuEntity;
import org.tshc.coupon.service.HomeSubjectSpuService;


@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl extends
    ServiceImpl<HomeSubjectSpuDao, HomeSubjectSpuEntity> implements HomeSubjectSpuService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<HomeSubjectSpuEntity> page = this.page(
        new Query<HomeSubjectSpuEntity>().getPage(params),
        new QueryWrapper<HomeSubjectSpuEntity>()
    );

    return new PageUtils(page);
  }

}
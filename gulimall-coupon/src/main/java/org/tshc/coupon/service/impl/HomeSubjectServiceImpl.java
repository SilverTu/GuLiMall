package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.HomeSubjectDao;
import org.tshc.coupon.entity.HomeSubjectEntity;
import org.tshc.coupon.service.HomeSubjectService;


@Service("homeSubjectService")
public class HomeSubjectServiceImpl extends
    ServiceImpl<HomeSubjectDao, HomeSubjectEntity> implements HomeSubjectService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<HomeSubjectEntity> page = this.page(
        new Query<HomeSubjectEntity>().getPage(params),
        new QueryWrapper<HomeSubjectEntity>()
    );

    return new PageUtils(page);
  }

}
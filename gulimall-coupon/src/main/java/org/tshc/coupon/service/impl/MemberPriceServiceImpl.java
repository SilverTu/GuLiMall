package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.MemberPriceDao;
import org.tshc.coupon.entity.MemberPriceEntity;
import org.tshc.coupon.service.MemberPriceService;


@Service("memberPriceService")
public class MemberPriceServiceImpl extends
    ServiceImpl<MemberPriceDao, MemberPriceEntity> implements MemberPriceService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberPriceEntity> page = this.page(
        new Query<MemberPriceEntity>().getPage(params),
        new QueryWrapper<MemberPriceEntity>()
    );

    return new PageUtils(page);
  }

}
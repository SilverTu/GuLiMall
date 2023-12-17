package org.tshc.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.member.dao.MemberStatisticsInfoDao;
import org.tshc.member.entity.MemberStatisticsInfoEntity;
import org.tshc.member.service.MemberStatisticsInfoService;


@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends
    ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfoEntity> implements
    MemberStatisticsInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberStatisticsInfoEntity> page = this.page(
        new Query<MemberStatisticsInfoEntity>().getPage(params),
        new QueryWrapper<MemberStatisticsInfoEntity>()
    );

    return new PageUtils(page);
  }

}
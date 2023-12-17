package org.tshc.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.member.dao.GrowthChangeHistoryDao;
import org.tshc.member.entity.GrowthChangeHistoryEntity;
import org.tshc.member.service.GrowthChangeHistoryService;


@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends
    ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistoryEntity> implements
    GrowthChangeHistoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<GrowthChangeHistoryEntity> page = this.page(
        new Query<GrowthChangeHistoryEntity>().getPage(params),
        new QueryWrapper<GrowthChangeHistoryEntity>()
    );

    return new PageUtils(page);
  }

}
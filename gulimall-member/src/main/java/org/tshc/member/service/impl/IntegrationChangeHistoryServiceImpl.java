package org.tshc.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.member.dao.IntegrationChangeHistoryDao;
import org.tshc.member.entity.IntegrationChangeHistoryEntity;
import org.tshc.member.service.IntegrationChangeHistoryService;


@Service("integrationChangeHistoryService")
public class IntegrationChangeHistoryServiceImpl extends
    ServiceImpl<IntegrationChangeHistoryDao, IntegrationChangeHistoryEntity> implements
    IntegrationChangeHistoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<IntegrationChangeHistoryEntity> page = this.page(
        new Query<IntegrationChangeHistoryEntity>().getPage(params),
        new QueryWrapper<IntegrationChangeHistoryEntity>()
    );

    return new PageUtils(page);
  }

}
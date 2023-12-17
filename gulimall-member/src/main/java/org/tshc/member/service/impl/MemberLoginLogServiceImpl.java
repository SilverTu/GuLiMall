package org.tshc.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.member.dao.MemberLoginLogDao;
import org.tshc.member.entity.MemberLoginLogEntity;
import org.tshc.member.service.MemberLoginLogService;


@Service("memberLoginLogService")
public class MemberLoginLogServiceImpl extends
    ServiceImpl<MemberLoginLogDao, MemberLoginLogEntity> implements MemberLoginLogService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberLoginLogEntity> page = this.page(
        new Query<MemberLoginLogEntity>().getPage(params),
        new QueryWrapper<MemberLoginLogEntity>()
    );

    return new PageUtils(page);
  }

}
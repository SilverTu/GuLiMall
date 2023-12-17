package org.tshc.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.member.dao.MemberLevelDao;
import org.tshc.member.entity.MemberLevelEntity;
import org.tshc.member.service.MemberLevelService;


@Service("memberLevelService")
public class MemberLevelServiceImpl extends
    ServiceImpl<MemberLevelDao, MemberLevelEntity> implements MemberLevelService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberLevelEntity> page = this.page(
        new Query<MemberLevelEntity>().getPage(params),
        new QueryWrapper<MemberLevelEntity>()
    );

    return new PageUtils(page);
  }

}
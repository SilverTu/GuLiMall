package org.tshc.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.member.dao.MemberCollectSubjectDao;
import org.tshc.member.entity.MemberCollectSubjectEntity;
import org.tshc.member.service.MemberCollectSubjectService;


@Service("memberCollectSubjectService")
public class MemberCollectSubjectServiceImpl extends
    ServiceImpl<MemberCollectSubjectDao, MemberCollectSubjectEntity> implements
    MemberCollectSubjectService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberCollectSubjectEntity> page = this.page(
        new Query<MemberCollectSubjectEntity>().getPage(params),
        new QueryWrapper<MemberCollectSubjectEntity>()
    );

    return new PageUtils(page);
  }

}
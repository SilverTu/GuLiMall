package org.tshc.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.member.dao.MemberDao;
import org.tshc.member.entity.MemberEntity;
import org.tshc.member.service.MemberService;


@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, MemberEntity> implements
    MemberService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberEntity> page = this.page(
        new Query<MemberEntity>().getPage(params),
        new QueryWrapper<MemberEntity>()
    );

    return new PageUtils(page);
  }

}
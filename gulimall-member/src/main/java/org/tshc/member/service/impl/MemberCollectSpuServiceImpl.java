package org.tshc.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.member.dao.MemberCollectSpuDao;
import org.tshc.member.entity.MemberCollectSpuEntity;
import org.tshc.member.service.MemberCollectSpuService;


@Service("memberCollectSpuService")
public class MemberCollectSpuServiceImpl extends
    ServiceImpl<MemberCollectSpuDao, MemberCollectSpuEntity> implements MemberCollectSpuService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberCollectSpuEntity> page = this.page(
        new Query<MemberCollectSpuEntity>().getPage(params),
        new QueryWrapper<MemberCollectSpuEntity>()
    );

    return new PageUtils(page);
  }

}
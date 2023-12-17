package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.AttrAttrgroupRelationDao;
import org.tshc.product.entity.AttrAttrgroupRelationEntity;
import org.tshc.product.service.AttrAttrgroupRelationService;


@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends
    ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements
    AttrAttrgroupRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<AttrAttrgroupRelationEntity> page = this.page(
        new Query<AttrAttrgroupRelationEntity>().getPage(params),
        new QueryWrapper<AttrAttrgroupRelationEntity>()
    );

    return new PageUtils(page);
  }

}
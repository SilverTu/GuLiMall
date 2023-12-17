package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.SpuCommentDao;
import org.tshc.product.entity.SpuCommentEntity;
import org.tshc.product.service.SpuCommentService;


@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements
    SpuCommentService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SpuCommentEntity> page = this.page(
        new Query<SpuCommentEntity>().getPage(params),
        new QueryWrapper<SpuCommentEntity>()
    );

    return new PageUtils(page);
  }

}
package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.SpuInfoDescDao;
import org.tshc.product.entity.SpuInfoDescEntity;
import org.tshc.product.service.SpuInfoDescService;


@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends
    ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity> implements SpuInfoDescService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SpuInfoDescEntity> page = this.page(
        new Query<SpuInfoDescEntity>().getPage(params),
        new QueryWrapper<SpuInfoDescEntity>()
    );

    return new PageUtils(page);
  }

}
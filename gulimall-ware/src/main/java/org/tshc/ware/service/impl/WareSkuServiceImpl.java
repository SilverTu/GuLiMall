package org.tshc.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.ware.dao.WareSkuDao;
import org.tshc.ware.entity.WareSkuEntity;
import org.tshc.ware.service.WareSkuService;


@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuDao, WareSkuEntity> implements
    WareSkuService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WareSkuEntity> page = this.page(
        new Query<WareSkuEntity>().getPage(params),
        new QueryWrapper<WareSkuEntity>()
    );

    return new PageUtils(page);
  }

}
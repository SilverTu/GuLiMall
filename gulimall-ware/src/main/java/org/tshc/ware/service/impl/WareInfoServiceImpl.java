package org.tshc.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.ware.dao.WareInfoDao;
import org.tshc.ware.entity.WareInfoEntity;
import org.tshc.ware.service.WareInfoService;


@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity> implements
    WareInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WareInfoEntity> page = this.page(
        new Query<WareInfoEntity>().getPage(params),
        new QueryWrapper<WareInfoEntity>()
    );

    return new PageUtils(page);
  }

}
package org.tshc.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.ware.dao.WareOrderTaskDetailDao;
import org.tshc.ware.entity.WareOrderTaskDetailEntity;
import org.tshc.ware.service.WareOrderTaskDetailService;


@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends
    ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetailEntity> implements
    WareOrderTaskDetailService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WareOrderTaskDetailEntity> page = this.page(
        new Query<WareOrderTaskDetailEntity>().getPage(params),
        new QueryWrapper<WareOrderTaskDetailEntity>()
    );

    return new PageUtils(page);
  }

}
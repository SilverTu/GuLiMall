package org.tshc.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.ware.dao.WareOrderTaskDao;
import org.tshc.ware.entity.WareOrderTaskEntity;
import org.tshc.ware.service.WareOrderTaskService;


@Service("wareOrderTaskService")
public class WareOrderTaskServiceImpl extends
    ServiceImpl<WareOrderTaskDao, WareOrderTaskEntity> implements WareOrderTaskService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WareOrderTaskEntity> page = this.page(
        new Query<WareOrderTaskEntity>().getPage(params),
        new QueryWrapper<WareOrderTaskEntity>()
    );

    return new PageUtils(page);
  }

}
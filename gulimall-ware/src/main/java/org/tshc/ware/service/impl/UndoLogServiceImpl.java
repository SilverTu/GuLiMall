package org.tshc.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.ware.dao.UndoLogDao;
import org.tshc.ware.entity.UndoLogEntity;
import org.tshc.ware.service.UndoLogService;


@Service("undoLogService")
public class UndoLogServiceImpl extends ServiceImpl<UndoLogDao, UndoLogEntity> implements
    UndoLogService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<UndoLogEntity> page = this.page(
        new Query<UndoLogEntity>().getPage(params),
        new QueryWrapper<UndoLogEntity>()
    );

    return new PageUtils(page);
  }

}
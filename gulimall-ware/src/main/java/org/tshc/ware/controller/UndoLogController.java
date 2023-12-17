package org.tshc.ware.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.R;
import org.tshc.ware.entity.UndoLogEntity;
import org.tshc.ware.service.UndoLogService;


/**
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:47:24
 */
@RestController
@RequestMapping("ware/undolog")
public class UndoLogController {

  @Autowired
  private UndoLogService undoLogService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  //@RequiresPermissions("ware:undolog:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = undoLogService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  //@RequiresPermissions("ware:undolog:info")
  public R info(@PathVariable("id") Long id) {
    UndoLogEntity undoLog = undoLogService.getById(id);

    return R.ok().put("undoLog", undoLog);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  //@RequiresPermissions("ware:undolog:save")
  public R save(@RequestBody UndoLogEntity undoLog) {
    undoLogService.save(undoLog);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  //@RequiresPermissions("ware:undolog:update")
  public R update(@RequestBody UndoLogEntity undoLog) {
    undoLogService.updateById(undoLog);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  //@RequiresPermissions("ware:undolog:delete")
  public R delete(@RequestBody Long[] ids) {
    undoLogService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}

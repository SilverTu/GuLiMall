package org.tshc.order.controller;

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
import org.tshc.order.entity.OrderOperateHistoryEntity;
import org.tshc.order.service.OrderOperateHistoryService;


/**
 * 订单操作历史记录
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:18:53
 */
@RestController
@RequestMapping("order/orderoperatehistory")
public class OrderOperateHistoryController {

  @Autowired
  private OrderOperateHistoryService orderOperateHistoryService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  //@RequiresPermissions("order:orderoperatehistory:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = orderOperateHistoryService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  //@RequiresPermissions("order:orderoperatehistory:info")
  public R info(@PathVariable("id") Long id) {
    OrderOperateHistoryEntity orderOperateHistory = orderOperateHistoryService.getById(id);

    return R.ok().put("orderOperateHistory", orderOperateHistory);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  //@RequiresPermissions("order:orderoperatehistory:save")
  public R save(@RequestBody OrderOperateHistoryEntity orderOperateHistory) {
    orderOperateHistoryService.save(orderOperateHistory);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  //@RequiresPermissions("order:orderoperatehistory:update")
  public R update(@RequestBody OrderOperateHistoryEntity orderOperateHistory) {
    orderOperateHistoryService.updateById(orderOperateHistory);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  //@RequiresPermissions("order:orderoperatehistory:delete")
  public R delete(@RequestBody Long[] ids) {
    orderOperateHistoryService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}

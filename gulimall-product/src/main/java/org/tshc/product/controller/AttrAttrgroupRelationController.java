package org.tshc.product.controller;

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
import org.tshc.product.entity.AttrAttrgroupRelationEntity;
import org.tshc.product.service.AttrAttrgroupRelationService;

/**
 * 属性&属性分组关联
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 14:12:16
 */
@RestController
@RequestMapping("product/attrattrgrouprelation")
public class AttrAttrgroupRelationController {

  @Autowired
  private AttrAttrgroupRelationService attrAttrgroupRelationService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = attrAttrgroupRelationService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  public R info(@PathVariable("id") Long id) {
    AttrAttrgroupRelationEntity attrAttrgroupRelation = attrAttrgroupRelationService.getById(id);

    return R.ok().put("attrAttrgroupRelation", attrAttrgroupRelation);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  public R save(@RequestBody AttrAttrgroupRelationEntity attrAttrgroupRelation) {
    attrAttrgroupRelationService.save(attrAttrgroupRelation);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  public R update(@RequestBody AttrAttrgroupRelationEntity attrAttrgroupRelation) {
    attrAttrgroupRelationService.updateById(attrAttrgroupRelation);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  public R delete(@RequestBody Long[] ids) {
    attrAttrgroupRelationService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}

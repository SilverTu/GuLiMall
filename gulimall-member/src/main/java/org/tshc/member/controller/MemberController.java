package org.tshc.member.controller;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.R;
import org.tshc.member.entity.MemberEntity;
import org.tshc.member.feign.CouponFeign;
import org.tshc.member.service.MemberService;


/**
 * 会员
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
@RestController
@RequestMapping("member/member")
public class MemberController {

  @Autowired
  private MemberService memberService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  //@RequiresPermissions("member:member:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = memberService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  //@RequiresPermissions("member:member:info")
  public R info(@PathVariable("id") Long id) {
    MemberEntity member = memberService.getById(id);

    return R.ok().put("member", member);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  //@RequiresPermissions("member:member:save")
  public R save(@RequestBody MemberEntity member) {
    memberService.save(member);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  //@RequiresPermissions("member:member:update")
  public R update(@RequestBody MemberEntity member) {
    memberService.updateById(member);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  //@RequiresPermissions("member:member:delete")
  public R delete(@RequestBody Long[] ids) {
    memberService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

  @Resource
  private CouponFeign couponFeign;

  @PostMapping("/coupon")
  public R memberCoupon(@RequestBody MemberEntity member) {
    return R.ok(couponFeign.queryMemberCoupon(member.getLevelId())).put("member", member);
  }

}

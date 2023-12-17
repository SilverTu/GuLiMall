package org.tshc.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.tshc.common.utils.R;

@FeignClient("coupon-server")
public interface CouponFeign {

  @GetMapping("/coupon/coupon/{memberLevel}/list")
  R queryMemberCoupon(@PathVariable("memberLevel") Long memberLevel);

}

package org.tshc;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tshc.coupon.entity.CouponEntity;
import org.tshc.coupon.service.CouponService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CouponTest {

  @Resource
  private CouponService couponService;

  @Test
  public void couponTest() {
    String note = "测试";
    boolean save = couponService.save(
        new CouponEntity().setNote(note));
    if (save) {
      System.out.println(
          couponService.getOne(Wrappers.<CouponEntity>lambdaQuery().eq(CouponEntity::getNote, note)));
      couponService.remove(Wrappers.<CouponEntity>lambdaQuery().eq(CouponEntity::getNote, note));
    } else {
      System.out.println("保存失败");
    }
  }

}

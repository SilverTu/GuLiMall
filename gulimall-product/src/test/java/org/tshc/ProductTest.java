package org.tshc;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tshc.product.entity.BrandEntity;
import org.tshc.product.service.BrandService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductTest {

  @Resource
  private BrandService brandService;

  @Test
  public void brandTest() {
    String name = "测试";
    boolean save = brandService.save(
        new BrandEntity().setName(name).setLogo("TEST").setDescript("测试用品牌").setSort(-1)
            .setShowStatus(1).setFirstLetter("T"));
    if (save) {
      System.out.println(
          brandService.getOne(Wrappers.<BrandEntity>lambdaQuery().eq(BrandEntity::getName, name)));
      brandService.remove(Wrappers.<BrandEntity>lambdaQuery().eq(BrandEntity::getName, name));
    } else {
      System.out.println("保存失败");
    }
  }

}

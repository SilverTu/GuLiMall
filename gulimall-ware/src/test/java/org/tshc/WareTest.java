package org.tshc;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tshc.ware.entity.WareInfoEntity;
import org.tshc.ware.service.WareInfoService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WareTest {

  @Resource
  private WareInfoService wareInfoService;

  @Test
  public void wareInfoTest() {
    String name = "测试";
    boolean save = wareInfoService.save(
        new WareInfoEntity().setName(name));
    if (save) {
      System.out.println(wareInfoService.getOne(
              Wrappers.<WareInfoEntity>lambdaQuery().eq(WareInfoEntity::getName, name)));
      wareInfoService.remove(
          Wrappers.<WareInfoEntity>lambdaQuery().eq(WareInfoEntity::getName, name));
    } else {
      System.out.println("保存失败");
    }
  }

}

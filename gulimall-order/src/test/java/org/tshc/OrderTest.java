package org.tshc;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tshc.order.entity.OrderEntity;
import org.tshc.order.service.OrderService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderTest {

  @Resource
  private OrderService orderService;

  @Test
  public void orderTest() {
    String note = "测试";
    boolean save = orderService.save(
        new OrderEntity().setNote(note));
    if (save) {
      System.out.println(
          orderService.getOne(Wrappers.<OrderEntity>lambdaQuery().eq(OrderEntity::getNote, note)));
      orderService.remove(Wrappers.<OrderEntity>lambdaQuery().eq(OrderEntity::getNote, note));
    } else {
      System.out.println("保存失败");
    }
  }

}

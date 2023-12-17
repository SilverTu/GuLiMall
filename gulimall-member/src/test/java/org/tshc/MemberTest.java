package org.tshc;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tshc.member.entity.MemberEntity;
import org.tshc.member.service.MemberService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberTest {

  @Resource
  private MemberService memberService;

  @Test
  public void memberTest() {
    String city = "测试";
    boolean save = memberService.save(
        new MemberEntity().setCity(city));
    if (save) {
      System.out.println(
          memberService.getOne(Wrappers.<MemberEntity>lambdaQuery().eq(MemberEntity::getCity, city)));
      memberService.remove(Wrappers.<MemberEntity>lambdaQuery().eq(MemberEntity::getCity, city));
    } else {
      System.out.println("保存失败");
    }
  }
}

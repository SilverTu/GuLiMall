package org.tshc.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 秒杀活动商品关联
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
@Data
@Accessors(chain = true)
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * 活动id
   */
  private Long promotionId;
  /**
   * 活动场次id
   */
  private Long promotionSessionId;
  /**
   * 商品id
   */
  private Long skuId;
  /**
   * 秒杀价格
   */
  private BigDecimal seckillPrice;
  /**
   * 秒杀总量
   */
  private BigDecimal seckillCount;
  /**
   * 每人限购数量
   */
  private BigDecimal seckillLimit;
  /**
   * 排序
   */
  private Integer seckillSort;

}

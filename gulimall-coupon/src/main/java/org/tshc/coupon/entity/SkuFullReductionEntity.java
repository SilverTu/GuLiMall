package org.tshc.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 商品满减信息
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
@Data
@Accessors(chain = true)
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * spu_id
   */
  private Long skuId;
  /**
   * 满多少
   */
  private BigDecimal fullPrice;
  /**
   * 减多少
   */
  private BigDecimal reducePrice;
  /**
   * 是否参与其他优惠
   */
  private Integer addOther;

}
